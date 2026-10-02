package Arrays;

public class Ejercicio17 {
	public static void main(String[] args) {
		float[] datos = { 1.5f, 4.2f, 0.3f, 7.8f, 2.1f };
		
		float[] filtrada = filtroUmbral(datos,2f);
		for(float numeros : filtrada) {
			System.out.println(numeros);
		}
	}
	
	private static float[] filtroUmbral(float[] arrOg, float umbral) {
		if(arrOg == null || arrOg.length == 0) {
			return new float[0];
		}
		int cantidad = 0;
		for(int i=0; i<arrOg.length; i++) {
			if(arrOg[i] > umbral) {
				cantidad++;
			}
		}
		float[] arrFin = new float[cantidad];
		int indice = 0;
		for(float numeros : arrOg) {
			if(numeros <= umbral) {
				continue; //Es decir, que siga recorriendo, que pase de ellos.
			}
			arrFin[indice] = numeros;
			indice++;
		}
		return arrFin;
	}

}
