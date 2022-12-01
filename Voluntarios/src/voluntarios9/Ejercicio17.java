package voluntarios9;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		//Arrays de tamaño 10
		int array1[]=new int[10];
		int array2[]=new int[10];
		Scanner teclado = new Scanner(System.in);
		
		for (int contVeces = 0; contVeces < array1.length; contVeces++) {
			System.out.println("Dame valor "+(contVeces+1)+":" );
			int valor=teclado.nextInt();
			array1[contVeces]=valor;
			
		}

		for (int contVeces = 0; contVeces < array2.length; contVeces++) {
			System.out.println("Dame valor "+(contVeces+11)+":" );
			int valor=teclado.nextInt();
			array2[contVeces]=valor;
			

		}

		if(Arrays.equals(array1, array2)) {
			System.out.println("Los arrays son iguales");
		}else {
			System.out.println("Los arrays no son iguales");
		}
		
	}

}
