
package proyectoambar;
import java.util.Scanner;

/**
 *
 * @author luisalvarado
 */
public class ProyectoAmbar {
   
    
    public static void main(String[] args) {
        
    String usuario, contraseña = null, opcionLogin;
    String contraseñaAdmin = "admin";
    String contraseñaVenta = "ventas";
    String contraseñaBodega = "bodega";
    
        // TODO code application logic here
        ProyectoAmbar Objeto1 = new ProyectoAmbar();
        Administrador menuPrincipalAdmin = new Administrador();
        Bodega menuprincipalBodega = new Bodega();
        
        
        Scanner scLogin = new Scanner(System.in);
        System.out.println("********** Ambar/login **********");
        System.out.println("Por favor eliga un perfil para iniciar sesión");
        System.out.println("  |1| Administrador");
        System.out.println("  |2| Bodeguero");
        System.out.println("  |3| Ventas");
        System.out.print("Opción : ");
        opcionLogin = scLogin.nextLine();
        
        
        if ((!"1".equals(opcionLogin)) && (!"2".equals(opcionLogin)) && (!"3".equals(opcionLogin))) {
            System.out.println("¡Ingrese una opción válida!"); 
        }else{
            if ("1".equals(opcionLogin)) {
                System.out.print("Ingrese contraseña :");
                contraseña = scLogin.nextLine();
                if ("1234".equals(contraseña)) {
                    System.out.println("¡Contraseña válida!");
                    Administrador.adminMenu();
                       
                }else{
                    System.out.println("¡Contraseña inválida!");
                }
            } // Cierre Administrador
            
            if ("2".equals(opcionLogin)) {
                System.out.print("Ingrese contraseña :");
                contraseña = scLogin.nextLine();
                if ("1234".equals(contraseña)) {
                    System.out.println("¡Contraseña válida!");
                    Bodega.bodegaMenu();
                }else{
                    System.out.println("¡Contraseña inválida!");
                }
            } // cierre de vendedor
            
            if ("3".equals(opcionLogin)) {
                System.out.print("Ingrese contraseña :");
                contraseña = scLogin.nextLine();
                if ("1234".equals(contraseña)) {
                    System.out.println("Contraseña válida");
                    Ventas.ventasMenu();
                }else{
                    System.out.println("Contraseña inválida");
                }   
            } // cierre de bodeguero
        }
        
        
                
    }
    

}


