package ManejoStrings;

import java.util.Scanner;
import java.text.Normalizer;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		Scanner pantalla = new Scanner(System.in);
		System.out.println("Introduzca su texto: ");
		String texto  = pantalla.nextLine();
		
		pantalla.close();
		
		
		System.out.println("El texto " + texto + " es palíndromo? " + esPalindroma(texto));
	}
	
	public static boolean esPalindroma(String texto) {
		 if (texto == null) {
		        return false;
		    }
		
		 
		String normalizado = Normalizer.normalize(texto, Normalizer.Form.NFD);
		normalizado = normalizado.replaceAll("\\p{M}", "");
		String texMin = normalizado.toLowerCase();
		String texNoBl = texMin.replace(" ", "");
		
			int izquierda = 0;
			int derecha = texNoBl.length()-1;
			
			while(izquierda < derecha) {
				if(texNoBl.charAt(izquierda) != texNoBl.charAt(derecha)) {
					return false;
				}
				izquierda++;
				derecha--;
			}
		
		return true;
	}

}
