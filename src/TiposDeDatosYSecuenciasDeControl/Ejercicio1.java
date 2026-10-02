package TiposDeDatosYSecuenciasDeControl;

public class Ejercicio1 {

		public static void main(String[] args) {
			short diasAnio = 365;
			byte horasDia = 24;
			byte minHoras = 60;
			byte segsMin = 60;
			
			long segPorAnio = diasAnio*horasDia*segsMin*minHoras;
			
			System.out.println("Un año tiene " + segPorAnio + " segundos.");
		}
}
