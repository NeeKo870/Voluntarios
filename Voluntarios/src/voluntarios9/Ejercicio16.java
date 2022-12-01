package voluntarios9;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		//Array de tamaño 55
		int array[]=new int[55];
		//Rellenamos el array con los numeros hasta que el ultimo numero cambie
		int valor=1;
		for (int cont=0; array[array.length-1]==0;) {
			//Rellena desde cont hasta cont+valor con valor
			//Ej valor=1, cont=0 rellena desde 0 hasta la posicion 1 con 1
			//Ej valor=2, cont=1 rellena desde 1 hasta la posicion 3 con 2
			Arrays.fill(array,cont,cont+valor,valor);
			cont+=valor;
			valor++;
			
		}
		//Eco en TFT
		System.out.println("Array");		
		for(int valorImp: array) {
			System.out.print(valorImp +" ");
		}
	}

}
