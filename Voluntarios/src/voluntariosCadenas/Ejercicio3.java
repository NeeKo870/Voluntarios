package voluntariosCadenas;

import java.util.Scanner;

/*Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego
mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres
primeras letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y
“Alcocer” mostrará “LIOTARALC”*/
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Pedimos la cadena
		System.out.println("Dame el nombre: ");
		String nombre=teclado.nextLine();
		System.out.println("Dame la apellido 1: ");
		String apellido1=teclado.nextLine();
		System.out.println("Dame la apellido 2: ");
		String apellido2=teclado.nextLine();
		
		//Recortamos y usamos toUpper para las mayusculas
		
		String cadenaImp= nombre.substring(0, 3)+apellido1.substring(0, 3).substring(0, 3)+apellido2.substring(0, 3);
		System.out.println(cadenaImp.toUpperCase());
		
	}

}
