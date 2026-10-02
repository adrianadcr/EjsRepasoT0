package TiposDeDatosYSecuenciasDeControl;

import java.util.Scanner;
public class Ejercicio7 {
	
	public static void main(String[] args) {
		
		Scanner pantalla = new Scanner(System.in);
		
		System.out.println("Introduzca número para su descomposición en valores primos:");
		System.out.print("Número: ");
		int numIntro = pantalla.nextInt();
		pantalla.close();
		
		
		if(numIntro < 1) {
			System.out.println("El número tiene que ser mayor a 1");
		}
		
		System.out.print(numIntro + " = ");
		descomponer(numIntro);
		System.out.println();
		
		
	}
	
	private static void descomponer(int n) {
		boolean primFact = true;
		while(n % 2 == 0) {
			if (!primFact) {
				System.out.print(" x ");
			}
			System.out.print("2");
			n = n/2;
			primFact = false;
		} 

		for(int i = 3; i*i <=n; i+=2) {
			if(!primFact) {
				System.out.print(" x ");
			}
			System.out.print("3");
			n /= i;
			primFact = false;
		}
		
		if(n > 1) {
			if(!primFact) {
				System.out.print(" x ");
			} 
			System.out.print(n);
		}
		
	}
	
}
