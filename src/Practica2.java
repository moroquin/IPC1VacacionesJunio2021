package src;

import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args){
        Practica2 p = new Practica2();
    }

    //variables de instancia globales
    Scanner scanner = new Scanner(System.in);

    String[] clienteNombre = new String[50];
    int [][] clienteIdTelefono = new int[2][50];
    int clienteCantidad = 0;

    //fin variables de instancia globales
    

    public Practica2(){
        ingresoDatosCliente();
        ingresoDatosCliente();
        imprimirArregloCliente();

    }

    //trabajo con texto
    public String componorTexto(String data, int tamMaximo){
        String resultado = "";
        if (data.length() > tamMaximo){
            resultado = data.substring(0, tamMaximo);
        }
        else{
            
            for (int i = data.length();i< tamMaximo;i++){
                resultado = resultado + " ";
            }
            resultado = data + resultado;
        }
        return resultado;
        
    }

    //********************* inicio clientes
    public void imprimirArregloCliente(){
        for (int i = 0; i < clienteCantidad; i++) {
            System.out.println(getDataCliente(i));
        }
    }

    public String getDataCliente(int indice){
        return "El nombre del cliente es "+componorTexto(clienteNombre[indice], 10) + " telefono: "+clienteIdTelefono[1][indice];
    }

    public void ingresoDatosCliente(){
        System.out.println("\n");
        clienteNombre[clienteCantidad] = getTexto("Ingres el nombre del cliente: ");
        clienteIdTelefono[0][clienteCantidad] = getEntero("Ingrese el id del cliente: ");
        clienteIdTelefono[1][clienteCantidad] = getEntero("Ingrese el telefono del cliente: ");
        System.out.println("\n\n");
        clienteCantidad++;
    }

    //********************* fin clientes

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
