package examenDAM;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		final String clave="lkhj554d";
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 5 ; i++) {
			System.out.print("Dame clave:");
			String claveUsu=scan.next();
			
			if(claveUsu.equalsIgnoreCase(clave)) {
				System.out.println("Has acertado en el intento " + (i+1));
				break;
			}else {
				System.out.println("Incorrecta");
			}
			if(i==4){
				System.out.println("Intentos permitidos superados");
				break;
			}
		}
		scan.close();
	}

}
