package Arrays;

public class Ejercicio15 {
	
	public static void main(String[] args) {
		float[] datos = { 1f, 5f, 2f, 8f, 3f, 3f, 9f, 1f };
		float[] fins = filtrado(datos);
		
		for(int i=0; i<fins.length; i++) {
			System.out.println(fins[i]);
		}
		
	}
	private static float[] filtrado(float[] arrOg) {
		
		if(arrOg == null || arrOg.length == 0) {
			return new float[0];
		}
		int cantidad = 0;
		for(int i=1; i<arrOg.length-1; i++) { //cambiamos estos límites para que al restarle uno al cero no nos de -1 que no existe, y al sumarle 
			//uno a la longitud no se nos salga del array
			if(arrOg[i]>arrOg[i+1] && arrOg[i]>arrOg[i-1]) {
				cantidad++;
			}
		}
		float[] arrFin = new float[cantidad];
		int pos = 0;
		for(int i=1; i<arrOg.length-1; i++) { 
			if(arrOg[i]>arrOg[i+1] && arrOg[i]>arrOg[i-1]) {
				arrFin[pos] = arrOg[i];
				pos++;
			}
		}
		
		return arrFin;
	}
}
