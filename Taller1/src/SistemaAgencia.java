import java.util.Scanner;
/**
 *
 * @author luisalvarado
 */

public class SistemaAgencia {
  //Declaracion de variables globales


  //Método para crear usuario e ingresar al sistema
  void login(){
    //Declaración de variables locales del método
    String crearUsuarioLogin,crearContraseñaLogin,usuarioLogin, contraseñaLogin,
     ingresaUsuarioLogin, ingresaContraseñaLogin;

    int opcionLogin;

    Scanner scLogin = new Scanner(System.in);
    System.out.println("------------------ Menú /login ------------------");
    System.out.println("Por favor eliga una opción");
    System.out.println("\t (1) Ingresar al sistema");
    System.out.println("\t (2) Crear nuevo usuario");
    System.out.print("Opción ingresada : ");
    opcionLogin = scLogin.nextInt();
    //Validación de la opción ingresada
    if ((opcionLogin != 1) && (opcionLogin != 2)) {
      System.out.println("¡Ingrese una opción válida!"); //Alerta
    }else {
      if (opcionLogin == 2) {
        System.out.println("------------------ Crear nuevo usuario /login ------------------");
        System.out.println("Por favor completar con los datos solicitados");
        System.out.println("Usuario : ");
        crearUsuarioLogin = scLogin.nextLine();
        System.out.println("Contraseña : ");
        crearContraseñaLogin = scLogin.nextLine();
        System.out.println("Su registro está completo, ahora puede ingresar al sistema");
      }
      if (opcionLogin == 1) {
        System.out.println("------------------ Ingresar al sistema /login ------------------");
        System.out.println("Para ingresar al sistema ingrese su usuario y contraseña");
        System.out.println("Usuario : ");
        ingresaUsuarioLogin =scLogin.nextLine();
        System.out.println("Contraseña : ");
        ingresaContraseñaLogin = scLogin.nextLine();
      } /*Cierre de if*/
    } /*Cierre de else login*/

  } /*Cierre del método login*/
  public static void main(String[] args) {
    SistemaAgencia objeto1 = new SistemaAgencia();
    objeto1.login();   
 }
} /* Cierre de la clase */
