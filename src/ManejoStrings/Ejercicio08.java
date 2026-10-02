package ManejoStrings;

public class Ejercicio08 {
	public static void main(String[] args) {
		String texto = "Áéíóú aeiouAEIOUñÑ";
		int vocTot = cuantasVocales(texto);
		System.out.println("Las vocales que hay en " + texto + " son " + vocTot);
	}
	
	private static int cuantasVocales(String texto) {
		if(texto == null || texto.isEmpty() || texto == "\n") {
			return 0;
		}
		
		String textoMinusc = texto.toLowerCase();
		String textoNoBl = textoMinusc.strip();
		
		int vocales = 0;
		String vocs = "aeiouáéíóú";
		for(int i=0; i<textoNoBl.length(); i++) {
			char c = textoNoBl.charAt(i);
			
			if(vocs.indexOf(c) != -1){
				vocales++;
			}
		}
		return vocales;
	}
}
