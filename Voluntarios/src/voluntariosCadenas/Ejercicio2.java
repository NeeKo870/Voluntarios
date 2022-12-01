package voluntariosCadenas;

import java.util.Scanner;

/*Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales,
además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
*/
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Pedimos la cadena
		System.out.println("Dame la cadena1: ");
		String cadena=teclado.nextLine();
		System.out.println("Dame la cadena2: ");
		String cadena2=teclado.nextLine();
		
		if(cadena.equals(cadena2)) {
			System.out.println("Son iguales con mayusculas incluidas");
		}else {
			System.out.println("No son iguales con mayusculas incluidas");
		}
		
		if(cadena.equalsIgnoreCase(cadena2)) {
			System.out.println("Son iguales ignorando mayusculas");
		}else {
			System.out.println("No son iguales ignorando mayusculas");
		}

	}

}
