package voluntarios4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame a:");
		int a = teclado.nextInt();
		
		System.out.println("Dame b:");
		int b = teclado.nextInt();
		int suma = 0;
		
		if(a <= b) {
			if(a == b) {
				System.out.println(a + " es igual a " + b);
			}else {
				System.out.println(a + " es menor");
				b = b-1;
				while(a != b) {
					a++;
					suma= suma + a; 
				}
				System.out.println("Suma: " + suma);
			}
		}else {
			System.out.println(b + " es menor");
			a = a-1;
			while(a != b) {
				b++;
				suma= suma + b; 
			}
			System.out.println("Suma: " + suma);
			
		}
		teclado.close();
	}	
}
