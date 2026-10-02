package TiposDeDatosYSecuenciasDeControl;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		int numero = 2;
		int contador = 0;
		System.out.println("La lista de los primeros 100 números primos son: ");
		while(contador<100) {
			if(esPrimo(numero)) {
				System.out.print(numero + " ");
				contador++;
				if(contador%15 == 0) {
					System.out.println();
				}
			}numero++; //esto hace que si el if da true, que pase al siguiente numero al contador
		}
		System.out.println();
		
	}
		
	//los métodos van fuera del main !!!	
	private static boolean esPrimo(int num) {
			if(num < 2) {
				return false;
			}
			if(num == 2) {
				return true;
			}
			if(num%2==0) {
				return false;
			}
			for(int i=3; i*i<=num; i+=2) { // el i*i hace que el bucle no repita numeros y que solo divida entre el numero una vez. 
			//REGLA MATEMATICA: SI UN NUMERO TIENE DIVISOR, TODOS ESTÁN ENTRE ÉL MISMO Y SU RAÍZ CUADRADA
				if(num%i==0) {
					return false;
				}
			}
			return true;
		}
}
