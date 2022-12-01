package voluntarios5_1822;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame numero de \"*\":");
		int num = teclado.nextInt();
		
		for(int i =1;i<=num;i++)
		{
			System.out.print("*");
		}
		teclado.close();
	}

}
