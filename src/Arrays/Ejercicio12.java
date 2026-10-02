package Arrays;

public class Ejercicio12 {
	public static void main(String[] args) {
		char[] palabra1 = { 'h', 'o', 'l', 'a'  };
		char[] palabra2 = { 'm', 'u', 'n', 'd', 'o' };
		char[] palFinal = concatenar(palabra1, palabra2);
		
		for(int i=0; i<palFinal.length; i++) {
			System.out.print(palFinal[i]);
		}
		
	}
	
	private static char[] concatenar(char[] pal1, char[] pal2) {
	
		char[] palFinal = new char[pal1.length+pal2.length];
		
		for(int i=0; i<pal1.length; i++) {
			palFinal[i] = pal1[i];
		}
		
		for(int i=0; i<pal2.length; i++) {
			palFinal[i+pal1.length] = pal2[i]; 
		}
		
		return palFinal;
	}
}
