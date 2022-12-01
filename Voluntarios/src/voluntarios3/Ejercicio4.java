package voluntarios3;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame a:");
		int a = teclado.nextInt();
		
		System.out.println("Dame b:");
		int b = teclado.nextInt();
		int suma=0;
		if((a > 10) && (b > 10)) 
		{
			suma = a + b;
			System.out.println("Suma: " + suma);
		}else {

			System.out.println("No se puede sumar");
		}
		
		teclado.close();
	}

}
