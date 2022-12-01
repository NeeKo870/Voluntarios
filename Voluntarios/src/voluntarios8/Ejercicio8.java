package voluntarios8;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Array de numeros aleatorios
		double arrayNumAle[]=new double[100];
		//Rellenamos el array
		for (int cont=0; cont<arrayNumAle.length; cont++) {
			arrayNumAle[cont]=Math.random();
		}
		
		//Pedimos la cantidad por teclado
		Scanner teclado = new Scanner(System.in);
		double cant=0.0;

		System.out.println("Dime un numero entre 0.0 y 0.1: ");
		cant=teclado.nextDouble();
			
		//Buscamos el numero dado por el usuario
		int contSuperiores=0;
		for (int cont = 0; cont < arrayNumAle.length;cont++) {
			if(arrayNumAle[cont]>=cant) {
				contSuperiores++;
			}
		}
		//Eco en TFT
		System.out.println("Hay " + contSuperiores + " numeros en el array iguales o superiores a "+ cant);
	}

}
