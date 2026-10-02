package ManejoStrings;

public class Ejercicio06 {
	public static void main(String[] args) {
		String texto = "Precio: 10.50, descuento: 2.30, total: 8.20.";
		String nuevoTexto = sustituirPuntos(texto);
		System.out.println("Texto con puntos: " + texto);
		System.out.println("Texto con comas: " + nuevoTexto);
		
	}
	
	
	
	private static String sustituirPuntos(String texto) {
		if(texto == null || texto.isEmpty()) {
			return null;
		}
		char coma = ',';
		char punto = '.';
		StringBuilder newText = new StringBuilder();
		
		
		for(int i=0; i<texto.length(); i++) {
			char c = texto.charAt(i);
			if(c == punto) {
				newText.append(coma);
			} else if (c == coma) {
				newText.append(punto);
			} else {
				newText.append(c);
			}
			
		
		}
		return newText.toString();
		
	}

}
