import java.util.Scanner;

public class DatosAlumno {

  public static void main(String[] args) {
    /* Declaracion de variables*/
    String nombreAlumno, apellidoAlumno, carreraAlumno, semestreAlunmno;
    int nota1Alumno, nota2Alumno, nota3Alumno, nota4Alumno, promedioAlumno,
        sumaNotasAlumno;

    /* Ingreso de datos*/
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

    sumaNotasAlumno = nota1Alumno + nota2Alumno + nota3Alumno + nota4Alumno;
    promedioAlumno = sumaNotasAlumno / 4;

    System.out.println("\n");
    System.out.println("El promedio del alumno es : " + promedioAlumno);
    System.out.println("----------------------------------------------------");


  }
}
