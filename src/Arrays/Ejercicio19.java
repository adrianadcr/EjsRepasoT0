package Arrays;

public class Ejercicio19 {
	public static void main(String[] args) {
		int[] muestras = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int[] subMues = submuestreo(muestras, 3);
		for(int muestr : subMues) {
			System.out.println(muestr);
		}
		
	}
	private static int[] submuestreo(int[] arrOg, int nivel) {
		if(nivel == 0 || arrOg == null) {
			return new int[0];
		}

		int[] arrFin = new int[(arrOg.length+nivel-1)/nivel]; // a+b-1/b método muy usado para hacer división redondeada hacia arriba 
		int pos=0;
		for(int i=0; i<arrOg.length; i+=nivel) {
			arrFin[pos] = arrOg[i];
			pos++;
		}
		
		return arrFin;
	}
}
