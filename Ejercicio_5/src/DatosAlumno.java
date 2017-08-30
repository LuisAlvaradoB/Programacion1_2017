import java.util.Scanner;

public class DatosAlumno {

//Declaracion de variables
  String runAlumno, nombreAlumno, apellidoAlumno, carreraAlumno, semestreAlumno,
      asignaturaAlumno, estadoFinalAlumno;
  int nota1Alumno, nota2Alumno, nota3Alumno, nota4Alumno, promedioAlumno,
      sumaNotasAlumno, asistenciaAlumno;

    //Metodo para realizar el ingreso de los datos por pantalla, no retorna variable
    void ingresarDatos(){
      Scanner sc = new Scanner(System.in);
      System.out.println("*****************  BIENVENIDO  *********************");
      System.out.println("----------------------------------------------------");

      System.out.println("Ingrese RUN del alumno : ");
      runAlumno = sc.nextLine();
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
      semestreAlumno = sc.nextLine();
      System.out.println("----------------------------------------------------");


      System.out.println("Ingrese Asignatura del alumno : ");
      asignaturaAlumno = sc.nextLine();
      System.out.println("----------------------------------------------------");


      System.out.println("Ingrese nota 1 del alumno : ");
      nota1Alumno = sc.nextInt();
      System.out.println("----------------------------------------------------");


      System.out.println("Ingrese nota 2 del alumno : ");
      nota2Alumno = sc.nextInt();
      System.out.println("----------------------------------------------------");


      System.out.println("Ingrese nota 3 del alumno : ");
      nota3Alumno = sc.nextInt();
      System.out.println("----------------------------------------------------");


      System.out.println("Ingrese nota 4 del alumno : ");
      nota4Alumno = sc.nextInt();
      System.out.println("----------------------------------------------------");

      System.out.println("Ingrese % de asistencia : ");
      asistenciaAlumno = sc.nextInt();
      System.out.println("----------------------------------------------------");

    }

    //Metodo para realizar el calculo del promedio y situacion final, no retorna variable
    void calculoPromedio(){
      sumaNotasAlumno = nota1Alumno + nota2Alumno + nota3Alumno + nota4Alumno;
      promedioAlumno = sumaNotasAlumno / 4;

      /* Condicional IF para resolver estado final*/
      if (promedioAlumno >=40 && asistenciaAlumno >=70) {
        estadoFinalAlumno = "Aprobado";
      } else {
        estadoFinalAlumno = "Reprobado";
      }
    }

    //Metodo para imprimir los resultados por pantalla, no retorna variable
    void imprimirResultados(){
      System.out.println("\n");
      System.out.println("El Sr " +nombreAlumno +" " +apellidoAlumno +" de la carrera de " +carreraAlumno +", " +"semestre " +semestreAlumno);
      System.out.println("En la asignatura de " +asignaturaAlumno +" " +"obtuvo un promedio de " +promedioAlumno);
      System.out.println("siendo su estado final " +estadoFinalAlumno);
    }


    public static void main(String[] args) {
      DatosAlumno objeto1 = new DatosAlumno();
      objeto1.ingresarDatos();
      objeto1.calculoPromedio();
      objeto1.imprimirResultados();
    }

}
