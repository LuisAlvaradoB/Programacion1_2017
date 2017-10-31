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
public class Bodega {
    
    public static int aliUniversal =200, aliCortante= 200, aliElectricista=200, desCruz=200,
            desPaleta=200, desMecanico=200, marCarpintero=200, marBola=200, marGalponero=200,
            lijMadera=200, lijGrano=200, lijMetal=200, llavAjustable=200, llavPuntaCorona=200,
            llavImpacto=200;
    
    static void bodegaMenu() {
        ArrayList<String> lista_bodega = new ArrayList<>();
        Bodega objetoBodega = new Bodega();
        lista_bodega.add("Ali1 Alicate Universal" +aliUniversal);
        lista_bodega.add("Ali2 Alicate Cortante"+aliCortante);
        lista_bodega.add("Ali3 Alicate Electricista" + aliElectricista);
        lista_bodega.add("Des1 Destornillador de Cruz"+ desCruz);
        lista_bodega.add("Des2 Destornillador de Paleta" + desPaleta);
        lista_bodega.add("Des3 Destornillador Mecanico" + desMecanico);
        lista_bodega.add("Mar1 Martillo Carpintero"+ marCarpintero);
        lista_bodega.add("Mar2 Martillo de bola" + marBola);
        lista_bodega.add("Mar3 Martillo galponero" + marGalponero);
        lista_bodega.add("Lij1 Lija de madera" + lijMadera);
        lista_bodega.add("Lij2 Lija de grano" + lijGrano);
        lista_bodega.add("Lij3 Lija de metal" + lijMetal);
        lista_bodega.add("Llav1 Llave ajustable" + llavAjustable);
        lista_bodega.add("Llav2 Llave punta corona" + llavPuntaCorona);
        lista_bodega.add("Llav3 Llave de impacto" + llavImpacto);


        System.out.println("********** Menu Bodega *********");
        for (int i = 0; i < lista_bodega.size(); i++) {
            System.out.println("[" +i+"]" +lista_bodega.get(i));
        }
        
        

    }
    
    
    static void salida(){
        String  opcionBodega;
        Scanner scBodega = new Scanner(System.in);
        System.out.println("¿Desea volver al menú principal?   s/n");
        opcionBodega = scBodega.nextLine();
       
        if (opcionBodega.equals(scBodega)) {
            Bodega.bodegaMenu();
        }else{
            System.exit(0);
        }
        
        
    }
    
}
