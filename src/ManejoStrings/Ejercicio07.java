package ManejoStrings;

public class Ejercicio07 {
	public static void main(String[] args) {
		String[] ejemplos = {"123", "12.34", "12,34", "12.34,56", "abc", "-5.5", "+3.14", ".", ","};
		
		for(String ej : ejemplos) {
			boolean valido = decimalValido(ej);
			System.out.println("¿" + ej + " es decimal válido? " + valido);
		}
		
		
	}
	
	private static boolean decimalValido(String numeros) {
		if(numeros == null || numeros.isEmpty()) {
			return false;
		}
		
		
		char primDigit = numeros.charAt(0);
		int inicio = 0;
		if(primDigit == '-' || primDigit == '+') {
			inicio = 1;
		}
		
		boolean separador = false;
		int digito = 0;
		
		for(int i= inicio; i<numeros.length(); i++) {
			char c = numeros.charAt(i);
			
			if(c == ',' || c == '.') {
					if(separador) {
						return false;
					}
					separador = true;
				} else if(Character.isDigit(c)) {
					digito++;
				} else {
					return false;
				}
		}
	
		return digito>0 ;
	}

}
