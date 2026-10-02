package Arrays;

public class Ejercicio07 {
	public static void main(String[] args) {
		int[] origen = { 1, 2, 3, 4, 5 };
		int[] fin = copiadora(origen, 3);
		System.out.println("Copiando los elementos de un array a otro...");
		
		for(int i=0; i<origen.length; i++) {
			System.out.print(fin[i] + " ");
		}
		
		
	}

	
	private static int[] copiadora(int[] arrOg, int factor) {
		int[] arrFin = new int[arrOg.length];
		
		for(int i=0; i<arrOg.length; i++) {
			arrFin[i] = arrOg[i] * factor;
		}
		return arrFin;
	}
}
