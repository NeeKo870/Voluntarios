package voluntarios6;

import java.io.IOException;

public class EjercicioEC3 {
	public static void main(String[] args) throws IOException {
		System.out.print("Introduce un caracter: ");
		//System.in.read() actua como el Scanner pero solo para caracteres
		char caracter = (char) System.in.read();
		
		if (Character.isUpperCase(caracter)) {
			System.out.println("Es una mayuscula");
		}else {
			System.out.println("Es una minuscula");
		}
	}
}
