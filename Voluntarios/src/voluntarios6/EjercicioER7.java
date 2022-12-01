package voluntarios6;

import java.util.Scanner;

public class EjercicioER7 {
	public static void main(String[] args) {
		int num=1;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Dame numero entre 1 y 10: ");
			num=teclado.nextInt();
			
		}while(num < 1 || num > 10);
		
		for(int i=1;i <=12; i++) {
			System.out.println(num + " x "+ i +" = " + num*i);
		}
		teclado.close();
	}
}
