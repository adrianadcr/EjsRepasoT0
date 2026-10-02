package ManejoStrings;

public class Ejercicio01 {
	public static void main (String[] args) {
		String texto = "abcdefg1234";
		String soloNumero = primerNumero(texto);
		System.out.println("El primer número es " + soloNumero);
		
	}
	
   private static String primerNumero(String texto) {
	   if(texto == null || texto.isEmpty()) {
		   return null;
	   }

		StringBuilder numero = new StringBuilder();
		for(int i = 0; i<texto.length(); i++) {
			char c = texto.charAt(i);
			if(Character.isDigit(c)) {
				numero.append(c);
				
			} else if(numero.length() > 0) {
				break;
			}
		}
			return numero.toString();

	}

}
