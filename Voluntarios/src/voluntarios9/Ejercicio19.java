package voluntarios9;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		//Array de tamaño 8 jugadores
		int array1[]=new int[8];
		int valor=0;
		
		//Rellenemos el array por teclado y entre valores 1000 y 2800
		Scanner teclado = new Scanner(System.in);
		for (int cont=0; cont<array1.length; cont++) {
			do{
				System.out.println("Dime puntacion entre 1000 y 2800 de jugador "+(cont+1)+": ");
				valor=teclado.nextInt();
				
			}while(valor<1000||valor>2800);
			array1[cont]=valor;
		}
		//Lo ordenamos
		Arrays.sort(array1);
		
		//Eco en TFT
		System.out.println("Array");		
		for(int cont=array1.length-1; cont>=0; cont--) {
			System.out.print(array1[cont] +" ");
		}
	}

}
