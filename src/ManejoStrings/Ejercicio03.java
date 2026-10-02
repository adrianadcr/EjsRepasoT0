package ManejoStrings;

public class Ejercicio03 {
	public static void main(String[] args) {
		String texto = "\thola mundo   \t ";
		String nuevoTexto = eliminoBlanco(texto);
		System.out.println(nuevoTexto);
	}
	
	
	private static String eliminoBlanco(String texto) {
		if(texto==null || texto.isEmpty()) {
			return texto;
		}
		return texto.strip();
	/**
	 * strip es para borrar los espacios al principio y al final de un String sin modificar el medio
	 * replace es para borrar todos los espacios 
	 * stripTrailing para borrar espacios al final
	 * stripLeading para borrar espacios al principio
	 */
		
		
	}

}
