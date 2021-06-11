package src;

import java.util.*;

public class Insercion {
    public static void main(String[] args) {
        Burbuja b = new Burbuja();
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
        

    }

    public void imprimirMatriz(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }
    }
}
