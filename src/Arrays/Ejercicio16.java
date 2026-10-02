package Arrays;

import java.util.Scanner;

import java.util.Random;

public class Ejercicio16 {
	
	public static void main(String[] args) {
		Scanner pantalla = new Scanner(System.in);
		System.out.print("Introduce la dimensión de tu matriz:");

		int dimensión = pantalla.nextInt();
		
		pantalla.close();
		imprPant(simetrico(dimensión));
		
	}
	
	
	private static int[][] simetrico(int dim){
		if(dim <= 0) {
			return new int[0][0];
		}
		Random numeros = new Random();
		int[][] matSim = new int[dim][dim];
		for(int i=0; i<dim; i++) {
			for(int j = i; j<dim; j++) {
				int valor = numeros.nextInt(100);
				matSim[i][j] = valor;
				matSim[j][i] = valor;
				/**esto se hace para que se llenen con los mismos números pero cambiado el orden
				 * si llamase a numeros.nextInt(100) en cada una se generarían numeros distintos
				 * y entonces no sería simetrica la matriz
				*/
			}
		}
		return matSim;
	}
	
	private static void imprPant(int[][] matriz) {
		for(int[] fila : matriz) {
			for(int numero : fila) {
				System.out.print(numero + "\t");
			}
			System.out.println();
		}
		
	}
}
