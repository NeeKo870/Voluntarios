package voluntarios3;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero:");
		int numero = teclado.nextInt();
		
		if(numero >10) {
			System.out.println(numero + " es mayor de 10");
		}else {
			if(numero <10) {
				System.out.println(numero + " es menor de 10");
			}else {
				System.out.println(numero + " es igual a 10");
			}
		}
		teclado.close();
	}

}
