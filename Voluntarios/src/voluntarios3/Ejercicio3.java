package voluntarios3;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame a:");
		int a = teclado.nextInt();
		
		System.out.println("Dame b:");
		int b = teclado.nextInt();
		
		if(a > b) 
		{
			System.out.println("Numero " + a + " es mayor que numero " + b);
		}else if(a < b){
			
			System.out.println("Numero " + a + " es menor que numero " + b);
			
		}else {
			
			System.out.println("Numero " + a + " es igual que numero " + b);
			
		}
		teclado.close();
	}

}
