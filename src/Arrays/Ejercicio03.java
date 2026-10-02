package Arrays;

public class Ejercicio03 {
	private static int tamano = 300;
	private static int modulo = 16;
	
	public static void main(String[] args) {
		int[] finArr = generar();
		
		for(int i=0; i<finArr.length;i++) {
			System.out.print(finArr[i] + " ");
		}	
	}
	
	private static int[] generar() { //el generador del array con las conds que me piden en el enunciado
		int[] arrTres = new int[tamano];
		for(int i=0; i<arrTres.length; i++) {
			arrTres[i]=i%modulo; //esto funciona porque el simbolo % de division solo divide como enteros, no pone comas. entonces
			//hace algo del palo 5%16 es 0 y al resto 5, por eso va a funcionar. 16%16 1 y al resto 0, etc.
			//es como "la formula" exacta q se necesita, se puede hacer por metodos mas largos obvio pero este es el mas rapido.
			
		}
		return arrTres;
	}
}
