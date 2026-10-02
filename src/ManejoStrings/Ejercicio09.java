package ManejoStrings;

public class Ejercicio09 {
	
	public static void main(String[] args) {
		String texto = "Hola Mundo";
		String otxet = alReves(texto);
		System.out.println(texto + " al revés es " + otxet);
	}

	
	public static String alReves(String texto) {
		if(texto == null) {
			return null;
		}
		
		StringBuilder otxet = new StringBuilder();
	
		for(int i=texto.length()-1; i >=0; i--) {
			
			char prim = texto.charAt(i);
			otxet.append(prim);
		}
		
		return otxet.toString();
	}
}
