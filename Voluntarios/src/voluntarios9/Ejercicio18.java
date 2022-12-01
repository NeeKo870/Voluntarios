package voluntarios9;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		//Array de tamaño 30
		int array1[]=new int[30];
		
		//Rellenemos el array
		for (int cont=0; cont<array1.length; cont++) {
			array1[cont]=(int) (Math.random()*10);
		}
		//Lo ordenamos
		Arrays.sort(array1);
		//Eco en TFT
		System.out.println("Array");		
		for(int valorImp: array1) {
			System.out.print(valorImp +" ");
		}
	}

}
