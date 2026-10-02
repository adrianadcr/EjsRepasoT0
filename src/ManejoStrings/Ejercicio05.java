package ManejoStrings;

public class Ejercicio05 {
	public static void main(String[] args) {
		String texto = "abcabcabc";
		String subcadena = "abc";
		int veces = contadorString(texto, subcadena);
		System.out.println("El substring aparece " + veces + " veces");
	}

	
	private static int contadorString(String texto, String subcadena) {
		if(texto == null || subcadena==null || subcadena.isEmpty()) {
			return 0;
		}
		int veces = 0;
		int pos = 0;
		
		while((pos=texto.indexOf(subcadena, pos)) != -1) {
			/**
			 * mientras que la posición sea distinta de -1, aumentamos el contador
			 * de veces y sumamos la posición actual a la longitud de la cadena,
			 * para que no compruebe uno a uno sino que compruebe de tres
			 * en tres en este caso que es lo que nos interesa
			 * 
			 * la posición tiene que ser distinta de -1 porque cuando usamos indexOf,
			 * el método devuelve -1 cuando no hay coincidencias.
			 */
			veces++;
			pos += subcadena.length();
		}	
		return veces;
	}
}
