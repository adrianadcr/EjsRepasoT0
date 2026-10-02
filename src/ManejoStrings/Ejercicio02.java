package ManejoStrings;

public class Ejercicio02 {
	public static void main (String[] args) {
		String texto = "programacion";
		char buscado = 'a';
		int veces = buscador(texto, buscado);
		System.out.println("Las veces que aparece la a son: " + veces);
	}

	
	private static int buscador(String texto, char carBuscado) {
		if(texto == null || texto.length() == 0) {
			return 0;
		}
		int veces = 0;
		
		for(int i=0; i<texto.length(); i++) {
			char c = texto.charAt(i);
			if(c == carBuscado) {
				veces++;
			}
		}
		return veces;
	}
}
