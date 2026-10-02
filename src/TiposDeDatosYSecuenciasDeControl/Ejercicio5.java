package TiposDeDatosYSecuenciasDeControl;

public class Ejercicio5 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.println("Tabla del " + i +":");
			for(int j=1; j<=10; j++) {
				int mult = i*j;
				System.out.println(i + " X " + j + " = " + mult);
				
			}
		}
		
	}
}
