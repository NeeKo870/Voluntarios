package voluntarios5_1822;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame un numero:");
		int num1=teclado.nextInt();
		int num2=0;
		do {			
			System.out.print("Dame otro numero mayor al anterior:");
			num2 = teclado.nextInt();
		}while(num2<=num1);
		int contPar=0;
		while(num2>=num1) {
			if(num1%2==0) {
				contPar++;
			}
			System.out.print(num1++ +" ");
		}
		
		System.out.println("\nLa cantidad de pares son: " + contPar);
		teclado.close();
	}

}
