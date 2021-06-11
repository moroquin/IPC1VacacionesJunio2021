package src;

import java.util.*;

public class Burbuja {
    public static void main(String[] args){
        Burbuja b = new Burbuja();
    }

    public Burbuja(){
        int[] matriz = new int[7];
        
        llenarMatriz(matriz);
        imprimirMatriz(matriz);
        System.out.println("\n\nOrdenando . . . \n\n");
        ordenBurbuja(matriz);
        System.out.println("\n\nFin Ordenando . . . \n\n");
        imprimirMatriz(matriz);

    }

    public void ordenBurbuja(int[] array){
        //i<array.length   =   i <= (array.length-1)
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length-i; j++) {
                if (array[j]> array[j+1]){
                    /*
                    variable1  = 1
                    variable2 = 2

                        temporal = variable1 = 1
                        variable1 = variable2 = 2
                        variable2 = temporal = 1
                    */
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
                
            }
        }
    }

    public void imprimirMatriz(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición "+i+": "+array[i]);
        }
    }

    public void llenarMatriz(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10);
        }
    }


    
}
