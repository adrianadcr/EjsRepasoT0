package Arrays;

import java.util.Scanner;

public class Ejercicio11 {
	
	public static void main(String[] args) {
		Scanner pantalla = new Scanner(System.in);
		System.out.println("Introduzca enteros (0 para terminar): ");
		
		calculadora(pantalla);
		pantalla.close();
		
	}
	

	private static void calculadora(Scanner pantalla) {
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		int numerTotal = 0;
		int sumaNums = 0;

		while(pantalla.hasNextInt()) {
			int numero = pantalla.nextInt();
			if(numero==0) {
				break;
			}
			numerTotal++;
			sumaNums += numero;
			maximo = Math.max(numero, maximo);
			minimo = Math.min(numero, minimo);
			
		}
		if(sumaNums == 0) {
			System.out.println("Introduzca otro número antes que el 0");
			return;
		}
		int media = sumaNums/numerTotal;
		System.out.println("Maximo: " + maximo);
		System.out.println("Minimo: " + minimo);
		System.out.println("Media: " + ((double)media));
		
	}
}
