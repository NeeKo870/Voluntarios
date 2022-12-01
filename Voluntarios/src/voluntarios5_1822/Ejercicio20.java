package voluntarios5_1822;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num=0;
		do {			
			System.out.print("Dame numero:");
			num = teclado.nextInt();
		}while((num<=0)||(num>=20));
		
		int i=1;
		int numVeces=1;
		
		while(i<=num)
		{
			numVeces=i;
			while(numVeces!=0) {
				System.out.print(i);
				numVeces--;
			}
			System.out.println();
			i++;
			
		}
		teclado.close();

	}

}
