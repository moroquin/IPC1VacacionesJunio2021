package src.ejemplo;

import java.util.*;

public class Ejemplo1{
	int base, altura = 0;
	//lógica
	public Ejemplo1(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese base: ");
		base = scanner.nextInt();
		System.out.print("Ingrese altura: ");
		altura = scanner.nextInt();
		System.out.println("programa principal altura "+ altura+ " base "+ base);
		int perimetro = calcularPerimetro();
		System.out.println("programa principal altura "+ altura+ " base "+ base);
		System.out.println("\n\nel perimetro es: "+perimetro);
	}

	public int calcularPerimetro(){
		int resultado = 0;
		resultado = 2 * base + 2 * altura;
		base = 0;
		altura = 0;
		System.out.println("\n\ncalcularPerimetro altura "+ altura+ " base "+ base);
		return resultado;
	}

	public static void main(String[] args){
		Ejemplo1 t = new Ejemplo1();
	}
}