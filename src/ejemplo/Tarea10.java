package src.ejemplo;
import java.util.*;

public class Tarea10{
	public static void main(String[] args){
		Tarea10 t = new Tarea10();
	}

	public Tarea10(){
		//int[columna][fila]	
		int[][] principal = new int[4][3];// 0x1525
		int[][] transpuesta = new int[3][4];

		llenarMatriz(principal);// 0x1525
		matrizTranspuesta(principal,transpuesta,3,4);

		imprimirMatriz(principal,3,4);// mat -> 0x1525
		System.out.println("\n\n");
		imprimirMatriz(transpuesta,4,3);// mat -> 0x1525

		System.out.println("\n\n");

		imprimirMatricesALaPar(principal,3,4,transpuesta,4,3);

				System.out.println("\n\n");

		imprimir3MatricesALaPar(principal,3,4,principal,3,4, transpuesta,4,3);

	}

	public void matrizTranspuesta(int[][] primaria, int[][] transpuesta, int fil, int col){
		for (int i = 0 ; i<fil;i++){
				for (int j = 0 ; j<col ; j++){
					transpuesta[i][j] = primaria[j][i];
				}
			}	
	}


	public void imprimirMatricesALaPar(int[][] mat1, int fil1, int col1, int[][] mat2, int fil2, int col2 ){
		int filas =0 ;
		String espacioEnMedio = "     ";

		if (fil1>fil2){
			//fil1
			filas = fil1;
		}
		else{
			//fil2
			filas = fil2;
		}

		for(int i = 0 ; i< filas; i++){
			imprimirColumnas(i,fil1,col1,mat1);
			//entre las dos matrices
			System.out.print(espacioEnMedio);
			imprimirColumnas(i,fil2,col2,mat2);
			System.out.println();

		}

	}


	public void imprimir3MatricesALaPar(int[][] mat1, int fil1, int col1, int[][] mat2, int fil2, int col2 , int[][] mat3, int fil3, int col3){
		int filas =0 ;
		String espacioEnMedio = "     ";

		if ((fil1>fil2) && (fil1>fil3)){
			//fil1
			filas = fil1;
		}
		else{
			//fil2
			if(fil2>fil3){
				filas = fil2;
			}
			else{
				filas = fil3;
			}
		}

		for(int i = 0 ; i< filas; i++){
			imprimirColumnas(i,fil1,col1,mat1);
			//entre las dos matrices
			System.out.print(espacioEnMedio);
			imprimirColumnas(i,fil2,col2,mat2);
			System.out.print(espacioEnMedio);
			imprimirColumnas(i,fil3,col3,mat3);
			System.out.println();

		}

	}

	public void imprimirColumnas(int filaActual, int filaMax, int cantColumnas, int[][] mat){
		if(filaActual < filaMax){
				for(int j = 0 ; j<cantColumnas; j++){
					System.out.print(mat [j][filaActual]+" ");
				}
			}
			else{
				for(int i = 0 ; i < cantColumnas; i++){
					System.out.print("  ");
				}
			}
	}

	public void llenarMatriz(int[][] mat){// 0x1525
		// mat -> 0x1525

		for (int i = 0 ; i<4;i++){
			for (int j = 0 ; j<3 ; j++){
				mat[i][j] = (int)(Math.random()*10);
			}
		}
		// imprimirMatriz(mat,3,4);// mat -> 0x1525
	}

	public void imprimirMatriz(int[][] matriz, int fil, int col){
		// matriz -> 0x1525
		for (int i = 0 ; i<fil;i++){
				for (int j = 0 ; j<col ; j++){
					System.out.print(matriz[j][i]+" ");
				}
				System.out.println();
			}	
	}
}