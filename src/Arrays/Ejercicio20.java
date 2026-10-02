package Arrays;

public class Ejercicio20 {
	public static void main(String[] args) {
		int[] muestras = { 10, 20, 40, 70 };
		int[] muesMedia = interpolacion(muestras);
		
		for(int muest : muesMedia) {
			System.out.println(muest);
		}
	}
	private static int[] interpolacion(int[] arrOg) {
		if(arrOg == null || arrOg.length == 0) {
			return new int[0];
		}
		if(arrOg.length == 1) {
			return arrOg.clone();
		}
		int[] arrFin = new int[arrOg.length*2-1];
		for(int i=0; i<arrOg.length; i++) {
			arrFin[i*2] = arrOg[i];
			if(i<arrOg.length-1) {
			int media = (arrOg[i]+arrOg[i+1])/2;
			arrFin[i*2+1] = media;
		}
		}
		return arrFin;
	}
}

