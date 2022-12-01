package voluntarios5_1517;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero:");
		int num = teclado.nextInt();
		int contMult=0;
		for(int i=1;i<=num;i++) {
			if(i%3==0)
			{
				contMult++;
			}
		}
		System.out.println("Cantidad de multiplos de 3: " + contMult);
		teclado.close();
	}

}
