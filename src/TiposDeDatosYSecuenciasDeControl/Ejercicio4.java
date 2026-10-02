package TiposDeDatosYSecuenciasDeControl;

import java.util.Scanner; //Nos fijamos que en este ejercicios nos dice números introducidos por el usuario. Para que esto pueda ocurrir hay que
						  // hacer lo del escáner este, que sirve para leer los datos introducidos por consola.

public class Ejercicio4 {
/**Calcule el mínimo y el máximo de una serie de números enteros positivos introducidos por
el usuario. Cuando el usuario introduzca un número negativo se considerará que el anterior
*a este es el último número.
*/
	public static void main(String[] args) {
		Scanner pantalla = new Scanner(System.in);
	/**Poner el system.in es lo q hace que lea el input que le metas. 
	 * Tb puede leer archivos, Strings que se le pasen, etc.
	 */
		System.out.println("Introduzca nºs enteros positivos (un negativo si quiere terminar)");
		
	int maximo = Integer.MIN_VALUE; //IMPORTANTE ESTE CAMBIO! para que el limite del integer siempre sea menor que el numero intriducido.
	// si no lo ponemos así, nos sale como maximo y minimo siempre los limites del integer
	int minimo = Integer.MAX_VALUE;
	boolean metiendoNums = false; //como funciona esto?? como sabe lo que significa esto?

	while(true) {
		System.out.print("Número: ");
		int entero = pantalla.nextInt();
		
		if(entero < 0) {
			break;
		}
			
		metiendoNums = true;
		if(entero < minimo) {
			minimo = entero;
		}
		if(entero > maximo) {
			maximo = entero;
		}
	} 
	
	pantalla.close();
	
		if(!metiendoNums) {
			System.out.println("Tiene que introducir un entero positivo");
		} else {
			 System.out.println("El número mínimo de la serie es: " + minimo);
			 System.out.println("El número máximo de la serie es: " + maximo);
		}	
	}
}
