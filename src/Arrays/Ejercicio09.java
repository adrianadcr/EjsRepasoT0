package Arrays;

public class Ejercicio09 {
	public static void main(String[] args) {
		char[] datos = { 'h', 'o', 'l', 'a' };
		
		char[] invertido = invierte(datos);
		
		System.out.println("El nuevo array es: ");
		for(int i=0; i<datos.length; i++) {
		System.out.print(invertido[i]);
		}
	}

	
	
	
	private static char[] invierte(char[] arrOg) {
		
		char[] arrFin = new char[arrOg.length];
		for(int i=0; i<arrOg.length; i++) {
			arrFin[i]= arrOg[arrOg.length-1-i];
		}
		return arrFin;
	}
}
