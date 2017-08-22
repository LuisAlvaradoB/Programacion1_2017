import java.util.Scanner;

public class SegundaEntrada {
  public static void main(String[] args) {
    /* Declaracion de variables  */
    Scanner entrada = new Scanner(System.in);
    String nombre;
    String direccion;
    int edad;
    double sueldo;

    /* Cargar valores  */
    System.out.println("*****************  BIENVENIDO  *********************");
    System.out.println("----------------------------------------------------");
    System.out.println("Ingrese su nombre y apellido : ");;
    nombre = entrada.nextLine();
    System.out.println("----------------------------------------------------");
    System.out.println("Ingrese su direccion");
    direccion = entrada.nextLine();
    System.out.println("----------------------------------------------------");
    System.out.println("Ingrese su edad");
    edad = entrada.nextInt();
    System.out.println("----------------------------------------------------");
    System.out.println("Ingrese su sueldo");
    sueldo = entrada.nextDouble();
    System.out.println("----------------------------------------------------");

    /* Impresion de valores  */
    System.out.println("\n");
    System.out.println("Su nombre y apellido es : " +nombre);
    System.out.println("----------------------------------------------------");
    System.out.println("Su direccion es : " + direccion);
    System.out.println("----------------------------------------------------");
    System.out.println("Su edad es :" + edad);
    System.out.println("----------------------------------------------------");
    System.out.println("Su sueldo es : " + sueldo);
    System.out.println("----------------------------------------------------");
  }
}
