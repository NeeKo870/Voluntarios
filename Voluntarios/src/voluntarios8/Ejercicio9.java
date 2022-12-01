package voluntarios8;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Array de numeros aleatorios
		int arrayNumAle[]=new int[100];
		//Rellenamos el array
		for (int cont=0; cont<arrayNumAle.length; cont++) {
			arrayNumAle[cont]=(int) (1 + Math.random()*10);
		}
		
		//Pedimos la cantidad por teclado
		Scanner teclado = new Scanner(System.in);	
		System.out.println("Dime un numero entre 1 y 10: ");
		int cant=teclado.nextInt();
		
		//Buscamos el numero dado por el usuario
		System.out.println("Posiciones de "+ cant +" :");
		for (int cont = 0; cont < arrayNumAle.length;cont++) {
			
			if(arrayNumAle[cont]==cant) {
				System.out.print(cont+" ");
			}
		}
		
	}

}
