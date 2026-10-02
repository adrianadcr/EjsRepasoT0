package Arrays;

public class Ejercicio05 {

		public static void main(String[] args) {
			float[] arrFlo = { 1.5f, 2.5f, 3.0f, -1.0f, 4.25f };
			
			System.out.println("El promedio es: " + promedio(arrFlo));
			
	
		}

		private static float promedio(float[] arr) {
			float promed = 0f;
			float suma = 0f;
			for(int i = 0; i<arr.length; i++) {
				suma += arr[i];
				
			}
			return promed = suma / arr.length;
		}


}
