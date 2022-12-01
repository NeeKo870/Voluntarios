package voluntarios9;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		//Array de tamaño N introducido por teclado
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime cuantos valores quieres: ");
		int longitud=teclado.nextInt();
		
		int array1[]=new int[longitud];
		
		//Pedimos el valor y rellenamos con este el array con Arrays.fill
		System.out.println("Dime que valor quieres: ");
		int valor=teclado.nextInt();
		Arrays.fill(array1, valor);
		
		//Eco en TFT
		System.out.println("Array");		
		for(int valorImp: array1) {
			System.out.print(valorImp +" ");
		}
	}

}
