package voluntariosCadenas;

import java.util.Scanner;

/* Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’,
cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama me mima” dirá que hay:
*/
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Pedimos la cadena
		System.out.println("Dame la cadena: ");
		String cadena=teclado.next();
		//Covertimos la cadena en un array de caracteres pero antes la convertimos en minuscula
		cadena = cadena.toLowerCase();
		char[] arrCadena = cadena.toCharArray();
		//Contadores
		int numA=0;
		int numE=0;
		int numI=0;
		int numO=0;
		int numU=0;
		//Recorremos el array buscando y contando las letras
		for (char c : arrCadena) {
			switch (c) {
				case 'a': {
					numA++;
					break;
				}
				case 'e': {
					numE++;
					break;
				}
				case 'i': {
					numI++;
					break;
				}
				case 'o': {
					numO++;
					break;
				}
				case 'u': {
					numU++;
					break;
				}
				default:
					
					break;
				}
		}
		System.out.println("Numero de A: " + numA);
		System.out.println("Numero de E: " + numE);
		System.out.println("Numero de I: " + numI);
		System.out.println("Numero de O: " + numO);
		System.out.println("Numero de U: " + numU);
		
	}

}
