package src;

import java.util.*;

public class Insercion {
    public static void main(String[] args) {
        Insercion b = new Insercion();
    }

    public Insercion() {
        int[] matriz = { 1, 7, 4, 3, 8, 9, 6, 4, 0, 2, 5 }; // new int[7];

        // llenarMatriz(matriz);
        imprimirMatriz(matriz);
        System.out.println("\n\nOrdenando . . . \n\n");
        ordenInsercion(matriz);
        System.out.println("\n\nFin Ordenando . . . \n\n");
        imprimirMatriz(matriz);
    }

    public void ordenInsercion(int[] array){
        int selec = 0;
        int pos = 0;

        int operaciones = 0;
        int intercambio = 0;

        for (int i = 0; i < array.length; i++) {
            selec = array[i];
            pos = i;

            for (int j = i+1; j < array.length; j++) {
                if (selec > array[j]){
                    selec = array[j];
                    pos = j;
                }
                operaciones++;
            }


            array[pos] = array[i];
            array[i] = selec;
            intercambio++;
            
        }
        System.out.println("Operaciones: "+operaciones + " Intercambios "+intercambio);

    }

    public void imprimirMatriz(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }
    }
}
