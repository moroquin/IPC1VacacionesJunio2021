package src.objetos;

import src.objetos.contadores.*;
import src.objetos.figuras_geometricas.*;

public class TareaObjetos {
    public static void main(String[] args){
        TareaObjetos t = new TareaObjetos();
    }

    public TareaObjetos(){

        //contador
        contador c = new contador();
        contador c1 = c;
        for (int i = 0; i < 10; i++) {
            c1.incrementar();
            System.out.println(c.imprimirDatos());
        }

        //fin contador

        //cuadrado 

        Cuadrado d = new Cuadrado();
        Cuadrado d1 = d;

        d1.setLado(5);

        System.out.println("cambiando lado . . . " + ( (d1.setLado(2)||(false))?"se pudeo cambiar":"No se pudo cambiar"   ));
        //                                           (condición)   entonces     . . .        caso contrario  . . .                
        //                                           (condición)      ?          algo            :        algo      

        System.out.println("\n\n Area: "+d.getArea());
        System.out.println("Perimetro: "+d.getPerimetro());


        //fin cuadrado 

    }
    
}
