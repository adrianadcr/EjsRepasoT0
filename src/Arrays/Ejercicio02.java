package Arrays;

public class Ejercicio02 {
	public static void main(String[] args) {
		int[] arrInt = {67, 4, 34, 5, 1};
		
		System.out.println("La posición del número es: " + buscador(arrInt, 4));
		System.out.println("La posición del número es: " + buscador(arrInt, 0));
		
		
		
		
	}
	
	private static int buscador(int[] arr, int numero) {
		if(arr == null) {
			return -1;
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==numero) {
				return i;
			}
			
			
		}	
	return -1;
	}
	
	
}
