package voluntarios6;

import java.io.IOException;

public class EjercicioEC6 {
	public static void main(String[] args) throws IOException {
		System.out.print("Introduce un caracter: ");
		//System.in.read() actua como el Scanner pero solo para caracteres
		char caracter = (char) System.in.read();
		
		if (Character.isDigit(caracter)) {
			System.out.println("Es un numero");
		}else {
			System.out.println("No es numero");
		}
	}
}
