package voluntarios3;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame a:");
		int a = teclado.nextInt();
		
		System.out.println("Dame b:");
		int b = teclado.nextInt();
		int suma = 0;
		if((a % 2 == 0)&&(b % 2 == 0))
		{
			suma = a + b;
			System.out.println("Suma: " + suma);
		}else 
		{
			if(a % 2 == 0) {
				
				System.out.println("Numero " + a + " es par ");
				
			}else
			{
				
				System.out.println("Numero " + a + " es impar ");
				
			}
			
			if(b % 2 == 0) {
				
				System.out.println("Numero " + b + " es par ");
				
			}else
			{
				
				System.out.println("Numero " + b + " es impar ");
				
			}
		}
		teclado.close();
	}

}
