import java.util.Scanner;

public class DatosAlumno1 {

  void ingresarDatos() {
    Scanner sc = new Scanner(System.in);
    System.out.println("*****************  BIENVENIDO  *********************");
    System.out.println("----------------------------------------------------");
    System.out.println("Ingrese Nombre del alumno : ");
    nombreAlumno = sc.nextLine();
    System.out.println("----------------------------------------------------");
    System.out.println("Ingrese Apellido del alumno : ");
    apellidoAlumno = sc.nextLine();
    System.out.println("----------------------------------------------------");
    System.out.println("Ingrese Carrera del alumno : ");
    carreraAlumno = sc.nextLine();
    System.out.println("----------------------------------------------------");
    System.out.println("Ingrese Semestre del alumno : ");
    semestreAlunmno = sc.nextLine();
    System.out.println("----------------------------------------------------");
    System.out.println("Ingrese 1 nota del alumno : ");
    nota1Alumno = sc.nextInt();
    System.out.println("----------------------------------------------------");
    System.out.println("Ingrese nota 2 del alumno : ");
    nota2Alumno = sc.nextInt();
    System.out.println("----------------------------------------------------");
    System.out.println("Ingrese 3 nota del alumno : ");
    nota3Alumno = sc.nextInt();
    System.out.println("----------------------------------------------------");
    System.out.println("Ingrese 4 nota del alumno : ");
    nota4Alumno = sc.nextInt();
    System.out.println("----------------------------------------------------");
  }

  void calcularPromedio() {
    sumaNotasAlumno = nota1Alumno + nota2Alumno + nota3Alumno + nota4Alumno;
    promedioAlumno = sumaNotasAlumno / 4;
  }

  void imprimirResultados() {
    System.out.println("\n");
    System.out.println("El promedio del alumno es : " + promedioAlumno);
    System.out.println("----------------------------------------------------");
  }

  public static void main(String[] args) {

    DatosAlumno1 objeto1 = new DatosAlumno1();

    objeto1.ingresarDatos();
    objeto1.calcularPromedio();
    objeto1.imprimirResultados();

  }
}
