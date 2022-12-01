 package voluntarios5_1517;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num=0;
		int num2 = 0;
		int contFallos = 0;
		int contVeces = 0;
		
		System.out.print("Dame un numero inicial:");
		num = teclado.nextInt();
		
		while(num != 0){

			System.out.print("Dame un numero: ");
			num2= teclado.nextInt();
			
			if(num > num2&&num2!=0) {
				contFallos++;
				System.out.println("Fallo es menor");
			}
			num=num2;
			contVeces++;
		}

		System.out.println("Total de fallos: " + contFallos);
		System.out.println("Total de numeros introducidos: " + contVeces);
		teclado.close();
	}

}
