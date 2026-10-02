package TiposDeDatosYSecuenciasDeControl;

public class Ejercicio3 {
	public static void main(String[] args) {
		int sumaMultiplos = 0;
		int contador = 0;
		
		System.out.println("Los múltiplos de 5 entre 1 y 100 son: ");
		for(int i=5; i<=100; i+=5 ) {// bucle for que recorre los numeros 5 al 100 de 5 en 5 (multiplos de 5)
			System.out.print(i + " ");//se pone solo print para que salgan todos en la misma línea
			//se pone " " para que salgan separados por un espacio.
			contador++; // lo que hace esta línea es contar cuántos numeros recorre el bucle
			sumaMultiplos +=i; // suma los numeros que recorre el bucle 
		}
		
		System.out.println("\n\nCantidad de múltiplos: " + contador); //se pone \n\n para saltar de línea
		System.out.println("La suma de los múltiplos resulta: " + sumaMultiplos);
	
	}
	
}
