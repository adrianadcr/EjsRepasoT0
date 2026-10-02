package TiposDeDatosYSecuenciasDeControl;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main (String[] args) {
		Scanner pantalla = new Scanner(System.in);
		
		
		System.out.println("Introduzca las componentes del primer vector:");
		double[] vect1 = leerVector(pantalla);
		
		System.out.println();
		
		System.out.println("Introduzca las componentes del segundo vector:");
		double[] vect2 = leerVector(pantalla);
		
		pantalla.close();
		System.out.println();
		System.out.println("El producto escalar de ambos vectores es: " + productoEscalar(vect1,vect2));
		
		
	}
	
	private static double[] leerVector(Scanner pantalla) {
		double[] vector = new double[3];
		String[] componentes = {"X","Y","Z"};
		
		for(int i=0; i<3; i++) {
			System.out.print("Componente " + componentes[i] + ": ");
			vector[i] = pantalla.nextDouble();
			
		}
		return vector;
	}
	
	private static double productoEscalar(double[] vect1, double[] vect2) {
		double resultado = 0.0 ;
		for(int i=0; i<3; i++) {
			resultado += vect1[i] * vect2[i];
		} return resultado;			
	}
}
