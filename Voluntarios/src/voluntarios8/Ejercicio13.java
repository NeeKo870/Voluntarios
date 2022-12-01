package voluntarios8;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		//Array de tamaño N introducido por teclado
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime cuantos valores quieres: ");
		int longitud=teclado.nextInt();
		
		int arrArit[]=new int[longitud];
		
		//Pedimos el valor inicial e incremento
		System.out.println("Dime el valor inicial: ");
		int valorIn=teclado.nextInt();
		
		System.out.println("Dime el incremento: ");
		int incremento=teclado.nextInt();

		//Rellenamos el array con los numeros
		for (int cont=0; cont<arrArit.length; cont++) {
			
			arrArit[cont]=valorIn;
			
			valorIn +=incremento;
		}
		
		//Eco en TFT
		System.out.println("Array");		
		for(int valor: arrArit) {
			System.out.print(valor +" ");
		}
	}

}
