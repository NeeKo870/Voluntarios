package voluntariosCadenas;

import java.util.Scanner;

/* Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra
de la cadena en una línea distinta.*/
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Pedimos la cadena
		System.out.println("Dame la cadena: ");
		String cadena=teclado.nextLine();
		String cadenaTemp="";
	

		for(int i = 0;i<cadena.length();) {
			//Si detecta que aun hay espacios a partir de i y se corta desde i hasta que el siguiente espacio de i 
			if(i<cadena.indexOf(" ",i)) {
				cadenaTemp=cadena.substring(i,cadena.indexOf(" ",i));
				//Se le asigna el siguiente esacio a partir de i +1 para que no salga el espacio
				i=cadena.indexOf(" ",i)+1;
				System.out.println(cadenaTemp);
			}else {
				//Si no hay mas espacios llega hasta el final
				cadenaTemp=cadena.substring(i,cadena.length());
				System.out.println(cadenaTemp);
				break;
			}

		}
		
	}

}
