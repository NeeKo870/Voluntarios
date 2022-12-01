package voluntariosCadenas;

import java.util.Scanner;

/*Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo o
no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). Supondremos que
el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.). Un
palíndromo es un texto que se lee igual de izquierda a derecha que de derecha a izquierda.
Por ejemplo:
*/
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Pedimos la cadena
		System.out.println("Dame la cadena: ");
		String cadena=teclado.nextLine();
		//Covertimos la cadena en un array de caracteres pero antes la convertimos en minuscula y quitamos los espacios
		cadena = cadena.toLowerCase();
		cadena = cadena.replaceAll(" ","");
		char[] arrCadena1 = cadena.toCharArray();
		
		char[] arrCadenaInv= new char[(arrCadena1.length)];
		//Copia del array1 al array2
				
		for (int cont=0; cont<arrCadenaInv.length;cont++) {
			arrCadenaInv[cont]=arrCadena1[cont];
		}
		

		
		boolean esPoli= true;
		//Buscamos en el array mirando si son iguales si en algun momento difiere sale
		for (int cont=0,cont2=arrCadena1.length-1; cont<arrCadenaInv.length;cont++,cont2--) {
			Character  ch1 = arrCadenaInv[cont2];
			Character  ch2 = arrCadena1[cont];
			System.out.println("charater 1 :" + ch1 +" charater 2 :" + ch2);
			if(!ch1.equals(ch2)) {
				esPoli= false;
				break;
			}
		}
		if(esPoli) {
			System.out.println("Es un palíndromo");
		}else {
			System.out.println("No es un palíndromo");
		}
	}

}
