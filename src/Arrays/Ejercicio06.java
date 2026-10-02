package Arrays;

public class Ejercicio06 {
	
	public static void main(String[] args) {
		//matriz que vamos a recibir
		float[][] matriz = { 
				{ 1.0f, 5.5f, 3.2f }, 
				{ 8.1f, 2.0f, 4.4f }, 
				{ -1.0f, -5.0f, -3.0f }, 
				{                     } };
		
		System.out.println("Los máximos por fila de este array son: ");
		float[] maximosDef = maximoPorFila(matriz);
		for(int i=0; i<matriz.length; i++) {
			System.out.println("Máximo fila " + i + ": " + maximosDef[i]);
		}
}
	
	//método que nos aplica el maximoFila a cada fila de una matriz de muchas filas
	private static float[] maximoPorFila(float[][] matCompl) {
		
		if(matCompl == null) {
			return new float[0]; //fijarse en la diferencia de returns cuando es una mtriz de una dimensión a cuando es una de dos
		}
		
		float[] arrMaximos = new float[matCompl.length];
		for(int i=0; i<matCompl.length; i++) {
			arrMaximos[i] = maximoFila(matCompl[i]);
		}
		return arrMaximos;
	}
	
	//método que nos saca el máximo de una fila de una matriz
	private static float maximoFila(float[] matFila) {
	
		if(matFila == null || matFila.length ==0) {
			return Float.NaN;
		}
		
		float maximo = matFila[0];
		for(int i=0; i<matFila.length; i++) {
			if(matFila[i]> maximo) {
				maximo = matFila[i];
			}
		}
		return maximo;
	}
}
