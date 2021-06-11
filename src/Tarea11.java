package src;
import java.util.*;

public class Tarea11{
	public static void main(String[] args){
		Tarea11 t = new Tarea11();
	}

	Scanner scanner = new Scanner(System.in);

	public Tarea11(){

		String[] nombres = new String[6];
		String[] resultado = new String[6];
		Double[] nota = new Double[6];

		insertarEstudiantes(nombres,resultado,nota,6);

		imprimirEstudiantes(nombres,resultado,nota,6);


	}

	public void imprimirEstudiantes(String[] nombres, String[] resultado, Double[] nota, int cantEstudiantes){
		for( int i =0; i<cantEstudiantes;i++){
			System.out.println("Nombre: "+ nombres[i]+", nota: "+ nota[i]+", resultado: "+resultado[i]);
		}
	}

	public void insertarEstudiantes(String[] nombres, String[] resultado, Double[] nota, int cantEstudiantes){

		for (int i = 0; i<cantEstudiantes; i++){
			boolean noValido = true;

			do{
				System.out.print("\n\nIngrese el nombre del estudiante No. " + (i+1) + ": ");
				nombres[i]= scanner.nextLine();
				System.out.print("Ingrese la nota del estudiante No. " + (i+1) + ": ");
				nota[i]= scanner.nextDouble();
				scanner.nextLine();
				if((nota[i]>=0)&&(nota[i]<=10)){
					noValido = false;
					resultado[i] = getResultadoNota(nota[i]);
				}
				else{
					System.out.println("La nota ingresada no es valida");
				}

			}while(noValido);
		}
		System.out.println("\n\n");
	}

	public String getResultadoNota(Double nota){
		String resultado = "";
		if(nota<4.99){
			resultado = "Suspenso";
		}
		else{
			if(nota<6.99){
				resultado = "Bien";
			}
			else{
				if(nota<8.99){
					resultado = "Notable";
				}
				else{
					resultado = "Sobresaliente";
				}
			}
		}
		return resultado;
	}


}