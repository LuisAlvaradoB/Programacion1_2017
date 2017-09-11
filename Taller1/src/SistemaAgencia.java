import java.util.Scanner;

/**
 *
 * @author luisalvarado
 */

public class SistemaAgencia {
  //Declaracion de variables globales

   String crearUsuarioLogin,crearContraseñaLogin,usuarioLogin, contraseñaLogin,
    ingresaUsuarioLogin, ingresaContraseñaLogin, nuevoIntento;
   String nuevoIntento1 = "s";
  

  //Método para crear usuario e ingresar al sistema

   void login(){
    //Declaración de variables locales del método
        int opcionLogin;

        Scanner scMenuLogin = new Scanner(System.in);
        System.out.println("------------------ Menú /login ------------------");
        System.out.println("Por favor eliga una opción");
        System.out.println("\t (1) Ingresar al sistema");
        System.out.println("\t (2) Crear nuevo usuario");
        System.out.print("Opción ingresada : ");
        opcionLogin = scMenuLogin.nextInt();

    //Validación de la opción ingresada
        if ((opcionLogin != 1) && (opcionLogin != 2)) {
            System.out.println("¡Ingrese una opción válida!"); //Alerta
        }else {
            if (opcionLogin == 2) {
                Scanner scCrearUsuario = new Scanner(System.in);
                System.out.println("------------------ Crear nuevo usuario /login ------------------");
                System.out.println("Por favor completar con los datos solicitados");
                System.out.print("Usuario : ");
                crearUsuarioLogin = scCrearUsuario.nextLine();
                System.out.print("Contraseña : ");
                crearContraseñaLogin = scCrearUsuario.nextLine();
                System.out.println("Su registro está completo, ahora puede ingresar al sistema");
            }
            if (opcionLogin == 1) {
                Scanner scLogin = new Scanner(System.in);
                    for (int i = 0; i < 3; i++) {
                        System.out.println("------------------ Ingresar al sistema /login ------------------");
                        System.out.println("Para ingresar al sistema ingrese su usuario y contraseña");
                        System.out.print("Usuario : ");
                        ingresaUsuarioLogin =scLogin.nextLine();
                        System.out.print("Contraseña : ");
                        ingresaContraseñaLogin = scLogin.nextLine();
                
                        if (ingresaUsuarioLogin.equals(crearUsuarioLogin) && (ingresaContraseñaLogin.equals(crearContraseñaLogin))){
                            System.out.println("Usuario y contraseña correcta");
                            break;
                    
                        }else{
           
                            System.out.println("Usuario o contraseña inválido !");
                            System.out.println("Intentelo nuevamente");
                       
                        }
                    }  /*Cierre ciclo for repeticion de validacion*/ 
                   
            } /*Cierre de if*/
        } /*Cierre de else login*/

    } /*Cierre del método login*/
   
  
  void menuPrincipal(){
      System.out.println("------------------ Menú Principal ------------------");

  }

   
   void imprimir(){
        System.out.println("Usuario creado : "+ crearUsuarioLogin + "\t " +"Usuario ingresado : "  + ingresaUsuarioLogin);
        System.out.println("Contraseña creada : "+ crearContraseñaLogin + "\t "+ "Contraseña ingresada : " + ingresaContraseñaLogin);
    }


    public static void main(String[] args) {
        SistemaAgencia objeto1 = new SistemaAgencia();
        objeto1.login();
        objeto1.login();
   
        objeto1.imprimir();
        objeto1.menuPrincipal();
     
        
      
        
        
        
   

    } /*Cierre metodo main*/
} /* Cierre de la clase */
