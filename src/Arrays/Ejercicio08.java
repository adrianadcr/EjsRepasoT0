package Arrays;

public class Ejercicio08 {
	public static void main(String[] args) {
		float[] datos = { 1.5f, -2.5f, 0.0f, -1.0f, 4.25f, -0.1f };
		
		System.out.println("Hay " + contadorNegativos(datos) + " números negativos en este array.");
		
	}
	
	private static int contadorNegativos(float[] arrFl) {
		if(arrFl == null) {
			return 0;
		}
		int total = 0;
		
		for(int i=0; i<arrFl.length; i++) {
			if(arrFl[i]<0) {
			total++;
			}
		}
		return total;
	}

}
