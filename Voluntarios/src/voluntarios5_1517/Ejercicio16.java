 package voluntarios5_1517;


import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num=0;
		do {
			
			System.out.println("Dame un numero:");
			num = teclado.nextInt();
		}while(num<0);
		
		boolean esPrimo=true;
		for (int i = 2; i!=num && esPrimo; i++) {
			if(num%i==0)
			{
				esPrimo=false;
			}
			
		}
		if (esPrimo) {
			System.out.println("Es primo");
		}else
		{
			System.out.println("No es primo");
		}
		teclado.close();
	}

}
