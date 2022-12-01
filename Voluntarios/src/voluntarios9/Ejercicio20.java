package voluntarios9;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		//Array de tamaño 30
		int array1[]=new int[1000];
		
		//Rellenemos el array
		for (int cont=0; cont<array1.length; cont++) {
			array1[cont]=(int) (Math.random()*100);
		}
		//Lo ordenamos
		Arrays.sort(array1);
		//Pedimos numero
		Scanner teclado = new Scanner(System.in);
		int valor=0;
		do{
			System.out.println("Dime numero entre 0 y 99: ");
			valor=teclado.nextInt();
			
		}while(valor<0||valor>99);
		
		//Eco en TFT buscando si existe y cuantas veces
		if(Arrays.binarySearch(array1, valor)!=0) {
			System.out.println("Existe");
			int contV=0;
			if(valor==0) {
				for (int cont=0; cont<Arrays.binarySearch(array1, valor)+10; cont++) {
					if(array1[cont]==valor) {
						contV++;
					}
				}
			}else if(valor==99) 
			{
				for (int cont=Arrays.binarySearch(array1, valor)-10; cont<array1.length; cont++) {
					if(array1[cont]==valor) {
						contV++;
					}
				}	
			}else {
				for (int cont=Arrays.binarySearch(array1, valor)-10; cont<Arrays.binarySearch(array1, valor)+10; cont++) {
					if(array1[cont]==valor) {
						contV++;
					}
				}
			}

			System.out.println("Hay " + contV + " de " + valor);
		}else {
			System.out.println("No existe");
		}
		
	
		
		
	}

}
