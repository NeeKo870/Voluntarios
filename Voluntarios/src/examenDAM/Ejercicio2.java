package examenDAM;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int array1[] = new int[5];
		
		//rellenamos
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Introduzca el numero "+ (i+1));
			array1[i]=teclado.nextInt();
			
		}
		//numero a buscar
		System.out.println("Introduzca un numero para buscar");
		int buscar=teclado.nextInt();
		
		
		int contNum=0;
		int pos[]=new int[5];
		//buscamos el numero y en que posiciones  esta
		for (int i = 0,j=0; i < array1.length; i++) {
			if(array1[i]==buscar) {
				contNum++;
				pos[j]=i;
				j++;	
			}
		}
		
		System.out.println("El numero "+buscar+ " se ha introducido " + contNum + " en la/s posicion/es");
		
		//recorremos el array solo esas posiciones
		for (int i = 0; i < pos.length; i++) {
			if(pos[i+1]!=0) {
				System.out.println(pos[i]);
				
			}else {
				System.out.println(pos[i]);
				break;
			}
			
		}
		System.out.println("Los numeros introduccidos al reves son: ");
		//orden invers,suma y mayor	
		int mayor=array1[array1.length-1];
		int suma=0;
		for (int i = array1.length-1; i>=0 ; i--) {
			System.out.println(array1[i]);
			suma+=array1[i];
			if(mayor<array1[i]) {
				mayor=array1[i];
			}
		}
		System.out.println("La suma de los valores introduccidos es " + suma);
		System.out.println("El numero mayor de los introduccidos es " + mayor);
		teclado.close();

	}

}
