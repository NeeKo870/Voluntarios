package voluntarios8;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Array de alturas con N tamaño introducido por teclado
		Scanner teclado = new Scanner(System.in);	
		System.out.println("Dime cuantas alturas guardaras: ");
		int longitud=teclado.nextInt();
		
		double arrAlturas[]=new double[longitud];
		
		//Rellenamos array con alturas del usuario
		for (int cont=0; cont<arrAlturas.length; cont++) {
			System.out.println("Dime altura "+(cont+1)+": ");
			arrAlturas[cont]=teclado.nextDouble();
		}
		
		//Obtenemos el min y max
		
		double min=arrAlturas[0];
		double max=arrAlturas[0];
		
		for(int i=0;i<arrAlturas.length;i++) {
			
			if(min>arrAlturas[i]) {
				min=arrAlturas[i];
			}
			if(max<arrAlturas[i]) {
				max=arrAlturas[i];
			}
			
		}
		
		//Calculamos la media
		double media=0.0;
		for (int cont=0; cont<arrAlturas.length; cont++) {
			
			media=arrAlturas[cont]+media;
		
		}
		media=media/longitud;
		//Contamos cuantas alturas hay por encima y debajo de la media
		int contInf=0;
		int contSup=0;
		
		for (int cont=0; cont<arrAlturas.length; cont++) {
			
			if(arrAlturas[cont]>=media) {
				contSup++;
			}else 
			{
				contInf++;
			}
		
		}
		//Eco en TFT
		System.out.println("Altura media: " + media );
		System.out.println("Altura minima: " + min );
		System.out.println("Altura maxima: " + max );
		System.out.println("Alturas superiores a la media " + media + ": "+ contSup);
		System.out.println("Alturas inferiores a la media " + media + ": "+ contInf);
	}

}
