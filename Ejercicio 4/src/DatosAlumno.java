import java.util.Scanner;
public class DatosAlumno {

    
    public static void main(String[] args) {
        /* Declaracion de variables*/
    String runAlumno, nombreAlumno, apellidoAlumno, carreraAlumno, semestreAlumno,
        asignaturaAlumno, estadoFinalAlumno;
    int nota1Alumno, nota2Alumno, nota3Alumno, nota4Alumno, promedioAlumno,
        sumaNotasAlumno;

    /* Ingreso de datos
      Se crea el objeto sc de la clase Scanner el cual captura los datos de
      entrada*/
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

  

    /* Calculo del promedio*/
    sumaNotasAlumno = nota1Alumno + nota2Alumno + nota3Alumno + nota4Alumno;
    promedioAlumno = sumaNotasAlumno / 4;

    /* Condicional IF para ver estado final*/
    if (promedioAlumno >=40) {
      estadoFinalAlumno = "Aprobado";
    } else {
      estadoFinalAlumno = "Reprobado";
    }

    /* Impresion de los resultados por pantalla*/
    System.out.println("\n");
    System.out.println("El Sr " +nombreAlumno +" " +apellidoAlumno +" de la carrera de " +carreraAlumno +", " +"semestre " +semestreAlumno);
    System.out.println("En la asignatura de " +asignaturaAlumno +" " +"obtuvo un promedio de " +promedioAlumno);
    System.out.println("siendo su estado final " +estadoFinalAlumno);
    } 
}
