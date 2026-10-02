package Arrays;

import java.util.Scanner;


public class Ejercicio23 {
	public static void main(String[] args) {
		Scanner pantalla = new Scanner(System.in);
		
		System.out.println("Matriz A: ");
		int[][] matriz1 = leerMatriz(pantalla);
		
		System.out.println("Matriz B: ");
		int[][] matriz2 = leerMatriz(pantalla);
		
		pantalla.close();
		
		if(!sonCompatibles(matriz1, matriz2)){
			System.out.println("El nº de columnas de A tiene que ser igual al nº de filas de B.");
		}
		int[][] matMult = multiplicador(matriz1, matriz2);
		for(int[] fila: matMult) {
			for(int numero : fila) {
				System.out.print(numero + "\t");
			}
		}
		
	}
	
	private static int[][] leerMatriz(Scanner pantalla) {
		System.out.print("Filas: ");
		int fila = pantalla.nextInt();
		
		System.out.print("Columnas: ");
		int col = pantalla.nextInt();
		
		int[][] mat = new int[fila][col];
		for(int i=0; i<fila; i++) {
			for(int j=0; j<col; j++ ) {
				System.out.print("Valor " + "["+i+"]"+"["+j+"]" + " : ");
				mat[i][j] = pantalla.nextInt();
			}
		}
		return mat;
	}
	
	private static boolean sonCompatibles(int[][] mat1, int[][] mat2) {
		if(mat1.length == 0 || mat2.length == 0) {
			return false;
		}
		return mat1[0].length == mat2.length;
	}
	
	private static int[][] multiplicador(int[][] mat1, int[][] mat2) {
		
		System.out.println("Matriz A: ");
		for(int[] fila : mat1) {
			for(int numero : fila) {
				System.out.print(numero+ "\t");
			}
		}
		System.out.println();
		
		System.out.println("Matriz B: ");
		for(int[] fila : mat2) {
			for(int numero : fila) {
				System.out.print(numero+"\t");
			}
		}
		System.out.println();
		
		System.out.println("A x B");
		int[][] matFin = new int[mat1.length][mat2[0].length];
		
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat2[0].length; j++) {
				int suma = 0;
				for (int k = 0; k < mat2.length; k++) {
					suma += mat1[i][k] * mat2[k][j];
				}
				matFin[i][j] = suma;
			}
		}
		return matFin;
		
	}
}
