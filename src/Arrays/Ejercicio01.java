package Arrays;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		float[] array = {1.5f, -1.6f, 2.5f, -3.4f, 3.7f};
		float suma = sumaFloats(array);
		
		System.out.println("Suma = " + suma);
		
		
	}
	
	private static float sumaFloats(float[] arr) {
		float suma = 0;
		
		if(arr == null) { //esta línea es importante a la hora de que si meto todo ceros o ningún nº en el array, que no pete.
			return 0;
		}
		for(int i=0; i<arr.length; i++) {
			suma += arr[i]; //IMPORTANTE, si no llamo a i como los valores que hay dentro del array y solo pongo suma += i, se me suman los indices,
							//tipo si hay 5 datos, pues 0 + 1 + 2 + 3 + 4 = 10
		}
		
		return suma;
	}
}
