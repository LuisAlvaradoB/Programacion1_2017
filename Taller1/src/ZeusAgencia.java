
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisalvarado
 */
public class ZeusAgencia {
    
    String crearUsuarioLogin,crearContraseñaLogin,usuarioLogin, contraseñaLogin,
    ingresaUsuarioLogin, ingresaContraseñaLogin, nuevoIntento, ventaNombre, ventaCi,
    ciudadDestino = null, tipoBus, valorPasaje, horarioSalida, ventaFecha, estadoPasaje;
    
   int  opcionLogin, opcionMenuPrincipal, opcionDestino, opcionTipoBus, contadorId=0,
        asientoAricaSSC, contadorAsientosSSCArica=0, opcionMenuP;

   String ventasGeneral[][] = new String [250][10];
   String ventaZeus[][] = new String [300][2600];
   
   int asientosAricaSSC[] = new int [20];
   
   
   void login(){
        Scanner scMenuLogin = new Scanner(System.in);
        System.out.println("------------------ Menú /login ------------------");
        System.out.println("Por favor eliga una opción");
        System.out.println("\t (1) Ingresar al sistema");
        System.out.println("\t (2) Crear nuevo usuario");
        System.out.print("Opción ingresada : ");
        opcionLogin = scMenuLogin.nextInt();
        
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
   
   // Método que imprime el menú principal
    void menuPrincipal(){
            System.out.println("------------------ Menú Principal ------------------");
            System.out.println("Por favor eliga una opción");
            System.out.println("\t (1) Realizar venta");
            System.out.println("\t (2) Consultas");
    }
    
    // Método que imprime el menú de ventas
    void menuVentas(){
      System.out.println("------------------ Menú Ventas ------------------");
      System.out.println("Ciudad de Origen : La Serena");
      System.out.println("Seleccione ciudad de destino : ");
      System.out.println("\t (1) Arica");
      System.out.println("\t (2) Iquique");
      System.out.println("\t (3) Antofagasta");
      System.out.println("\t (4) Copiapó");
      System.out.println("\t (5) Santiago");

    }
    
    void realizarVentas(){
        for (int i = 0; i < 250; i++) {
            contadorId = contadorId + 1; /* contador ID  */
            for (int j = 0; j < 2500; j+=10) {
                Scanner scVenta = new Scanner(System.in);
                System.out.println("------------------ Menú Principal ------------------");
                System.out.println("Por favor eliga una opción");
                System.out.println("\t (1) Realizar venta");
                System.out.println("\t (2) Consultas");
                System.out.print("Ingrese una opción : ");
                opcionMenuP = scVenta.nextInt();
                if (opcionMenuP == 1) {
                    System.out.println("------------------ Menú Ventas ------------------");
                    System.out.println("Ciudad de Origen : La Serena");
                    System.out.println("Seleccione ciudad de destino : ");
                    System.out.println("\t (1) Arica");
                    System.out.println("\t (2) Iquique");
                    System.out.println("\t (3) Antofagasta");
                    System.out.println("\t (4) Copiapó");
                    System.out.println("\t (5) Santiago");
                
                    System.out.print("Ingrese una opción : ");
                    opcionDestino = scVenta.nextInt();

                    Scanner scDatosPersonales = new Scanner(System.in);
                    System.out.print("Ingrese Nombre y apellido : ");
                    ventaNombre = scDatosPersonales.nextLine();
                    System.out.print("Ingrese C.I : ");
                    ventaCi = scDatosPersonales.nextLine();
                    System.out.print("Ingrese fecha de venta :");
                    ventaFecha = scDatosPersonales.nextLine();
        
                    switch (opcionDestino){
                        case 1:
                            ciudadDestino = "Arica";
                            System.out.println("Seleccione tipo de bus : ");
                            System.out.println("\t (1) Salón Super Cama");
                            System.out.println("\t (2) Salón Cama");
                            System.out.print("Ingrese una opción : ");
                            opcionTipoBus = scVenta.nextInt();
                        
                            switch (opcionTipoBus) {
                                case 1:
                                    tipoBus = "Salón Súper Cama"; //LS - Arica
                                    valorPasaje = "50000";
                                    horarioSalida = "07:00 AM";
                                    estadoPasaje = "0";
                                 
                                    System.out.println("Ingrese Nº de asiento");
                                    asientoAricaSSC = scVenta.nextInt();
                                 
                                    ventaZeus[i][j] = Integer.toString(contadorId); /* guarda el contador ID en el arreglo */
                                    ventaZeus[i][j+1] = ciudadDestino; /* guarda la ciudad de destino en el arreglo  */
                                    ventaZeus[i][j+2] = tipoBus;  /* guarda el tipo de bus en el arreglo */
                                    ventaZeus[i][j+3] = Integer.toString(asientoAricaSSC); /* guarda el nº de asiento en el arreglo */
                                    ventaZeus[i][j+4] = horarioSalida; /* guarda el horario de salida del bus en el arreglo */
                                    ventaZeus[i][j+5] = valorPasaje; /* guarda el valor del pasaje en el arreglo */
                                    ventaZeus[i][j+6] = estadoPasaje; /* guarda el estado del pasaje 0 es valido 1 invalido en el arreglo */
                                    ventaZeus[i][j+7] = ventaCi; /* guarda el run del pasajero en el arreglo */
                                    ventaZeus[i][j+8] = ventaNombre; /* guarda el nombre y apellido en el arreglo */
                                    ventaZeus[i][j+9] = ventaFecha; /* guarda la fecha de la venta en el arreglo */
                                 
                   
                                 
                                    System.out.println("¿Desea ingresar otra venta?");
                                 
                                    break;
                                 
                            }
              
                    }
                }else{
                System.out.println("id" + ventaZeus[i][j]);  
                System.out.println("Ciudad de destino" + ventaZeus[i][j+1]); 
                System.out.println("Tipo de bus" + ventaZeus[i][j+2]); 
                System.out.println("Numero de asiento" + ventaZeus[i][j+3]); 
                System.out.println("Horario de salida" + ventaZeus[i][j+4]);
                System.out.println("Valor del pasaje" + ventaZeus[i][j+5]); 
                System.out.println("Estado del pasaje" + ventaZeus[i][j+6]); 
                System.out.println("RUN" + ventaZeus[i][j+7]); 
                System.out.println("Nombre y Apellido" + ventaZeus[i][j+8]); 
                System.out.println("Fecha" + ventaZeus[i][j+9]);   
                    
                
                
                }
                
                
                
            
            }
        
            continue;
        }
    
    
    }


   void menuConsultas(){
    
    }
   
   void imprimir(){
     
       for (int i = 0; i < 250; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("id" + ventaZeus[i][j]);  
                System.out.println("Ciudad de destino" + ventaZeus[i][j+1]); 
                System.out.println("Tipo de bus" + ventaZeus[i][j+2]); 
                System.out.println("Numero de asiento" + ventaZeus[i][j+3]); 
                System.out.println("Horario de salida" + ventaZeus[i][j+4]);
                System.out.println("Valor del pasaje" + ventaZeus[i][j+5]); 
                System.out.println("Estado del pasaje" + ventaZeus[i][j+6]); 
                System.out.println("RUN" + ventaZeus[i][j+7]); 
                System.out.println("Nombre y Apellido" + ventaZeus[i][j+8]); 
                System.out.println("Fecha" + ventaZeus[i][j+9]); 
                
                
            }
       }    
   
   }
   
    public static void main(String[] args) {
        ZeusAgencia objeto1 = new ZeusAgencia();
        
        objeto1.login();
        objeto1.login();
        objeto1.realizarVentas();
        
            /*for (int i = 0; i < 3; i++) {
                objeto1.menuPrincipal();
                int opcion;
                Scanner scOpMenu = new Scanner(System.in);
                System.out.print("Opción ingresada : ");
                opcion = scOpMenu.nextInt();

                if(opcion == 1){
                    //objeto1.menuVentas();
                    objeto1.realizarVentas();
                break;

                }

                if(opcion ==2){
                    objeto1.menuConsultas();
                break;
                }

            }*/
        
    }
}

   
   
   
   
   
   
   
   
