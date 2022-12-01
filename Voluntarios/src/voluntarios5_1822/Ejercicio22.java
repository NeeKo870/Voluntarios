package voluntarios5_1822;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numLineas=0;
		do {			
			System.out.print("Dame numero:");
			numLineas = teclado.nextInt();
		}while((numLineas<=0)||(numLineas>=20));
		
		int i=1;
		
		int numVecesEspacios=0;
		int numVecesAst=1;
		
		while(i<=numLineas)
		{
			
			numVecesEspacios=numLineas-i;
			while(numVecesAst!=0) {
				
				while(numVecesEspacios!=0)
				{
					System.out.print(" ");
					numVecesEspacios--;
				}
				
				System.out.print("*");
				numVecesAst--;
			}
			System.out.println();
			numVecesAst=(i*2)+1;
			i++;
			
			
		}
		teclado.close();

	}

}
