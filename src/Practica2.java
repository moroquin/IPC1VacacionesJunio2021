package src;

import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args){
        Practica2 p = new Practica2();
    }
    //variables de instancia globales
    Scanner scanner = new Scanner(System.in);
    String[] clienteNombre = new String[50];
    int [] clienteIdTelefono = new int[50];
    //fin variables de instancia globales
    

    public Practica2(){

    }

    //ingreso en el teclado
    public String getTexto(String mensaje){
        System.out.print(mensaje + " ");
        String tmp = scanner.nextLine();
        return tmp;
    }

    public int getEntero(String mensaje){
        System.out.print(mensaje + " ");
        int tmp = scanner.nextInt();
        scanner.nextLine();
        return tmp;
    }
    
}
