package voluntarios4;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame clave:");
		int claveUsu=teclado.nextInt();
		int clave=1234;
		
		while(clave != claveUsu) {

			System.out.println("Clave incorrecta, dame clave:");
			claveUsu=teclado.nextInt();
			
		}
		System.out.println("Clave correcta");
		teclado.close();
	}	
}
