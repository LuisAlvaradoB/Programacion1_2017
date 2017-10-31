/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoambar;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luisalvarado
 */
public  class Ventas {


    public static void ventasMenu() {
        ArrayList<String> venta = new ArrayList<>();
        Scanner scventa =new Scanner(System.in);
        Bodega objetoBodega = new Bodega();

        String opcionVenta, opcionOtraVenta;
        int cantidadVenta, precioCantidad;

        venta.add("Ali1 Alicate Universal" );
        venta.add("Ali2 Alicate Cortante");
        venta.add("Ali3 Alicate Electricista" );
        venta.add("Des1 Destornillador de Cruz");
        venta.add("Des2 Destornillador de Paleta" );
        venta.add("Des3 Destornillador Mecanico" );
        venta.add("Mar1 Martillo Carpintero");
        venta.add("Mar2 Martillo de bola" );
        venta.add("Mar3 Martillo galponero" );
        venta.add("Lij1 Lija de madera" );
        venta.add("Lij2 Lija de grano");
        venta.add("Lij3 Lija de metal");
        venta.add("Llav1 Llave ajustable");
        venta.add("Llav2 Llave punta corona");
        venta.add("Llav3 Llave de impacto" );

        do{
            
            for (int i = 0; i < venta.size(); i++) {
                System.out.println(""+venta.get(i));
            }
    
        System.out.println("Ingrese el codigo del producto");
        opcionVenta = scventa.next();
        System.out.println("Ingrese cantidad");
        cantidadVenta = scventa.nextInt();
        
        if (opcionVenta.equalsIgnoreCase("Ali1")) {
            System.out.println("Alicate Unviersal Precio : 5000");
            precioCantidad = (cantidadVenta*5000);
            objetoBodega.aliUniversal = objetoBodega.aliUniversal-cantidadVenta;
            
            System.out.println("Total a pagar" + precioCantidad);
        }
        
         if (opcionVenta.equalsIgnoreCase("Ali2")) {
            System.out.println("Alicate Cortante Precio : 4500");
            precioCantidad = (cantidadVenta*4500);
            objetoBodega.aliCortante = objetoBodega.aliCortante-cantidadVenta;
            
            System.out.println("Total a pagar" + precioCantidad);
        }
        
         if (opcionVenta.equalsIgnoreCase("Ali3")) {
            System.out.println("Alicate Electricista Precio : 3500");
            precioCantidad = (cantidadVenta*3500);
            objetoBodega.aliElectricista = objetoBodega.aliElectricista-cantidadVenta;
            
            System.out.println("Total a pagar" + precioCantidad);
        } 
         
         System.out.println("Desea ingresar otra venta? s/n");
         opcionOtraVenta = scventa.next();
         
        } while (opcionOtraVenta.equalsIgnoreCase ("s"));
         
         if (opcionOtraVenta.equalsIgnoreCase("n")) {
             System.exit(0);
        }
         

    }
}
