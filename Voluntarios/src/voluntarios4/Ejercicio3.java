package voluntarios4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame a:");
		int a = teclado.nextInt();
		
		System.out.println("Dame b:");
		int b = teclado.nextInt();
		
		if(a <= b) {
			if(a == b) {
				System.out.println(a + " es igual a " + b);
			}else {
				System.out.println(a + " es menor");
				b = b-1;
				while(a != b) {
					a++;
					System.out.print(a + " ");
				}
				
			}
		}else {
			System.out.println(b + " es menor");
			a = a-1;
			while(b != a) {
				b++;
				System.out.print(b + " ");
			}
			
		}
		teclado.close();
	}
		
}
