package voluntariosMatrices2;

import java.util.Scanner;

/* Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la
información de N personas distintas (valor también introducido por teclado). Para cada
persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta información debe
guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada
género*/
public class Ejercicio5Matriz {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el numero de hombres: ");
		int hombres=teclado.nextInt();
		System.out.println("Dame el numero de mujeres: ");
		int mujeres=teclado.nextInt();
		int[][] matriz=new int[2][];
		matriz[0]= new int[hombres];
		matriz[1]= new int[mujeres];
		System.out.println();
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				if(i == 0 ) {
					System.out.println("Dame el valor para el empleado: ");
					matriz[0][j]=teclado.nextInt();
				}else {
					System.out.println("Dame el valor para la empleada: ");
					matriz[1][j]=teclado.nextInt();
				}
				
				
			}			
		}
		int mediaH=0;
		int mediaM=0;
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				if(i == 0 ) {
					
					mediaH=matriz[0][j];
				}else {
	
					mediaM=matriz[1][j];
				}
			}			
		}
		mediaH=mediaH/matriz[0].length;
		mediaM=mediaM/matriz[1].length;
		System.out.println("Media Hombres: " + mediaH + "\nMedia Mujeres: "+mediaM);
		if(mediaH>mediaM) {
			System.out.println("Hay brecha salarial");
		}else {
			System.out.println("No hay brecha salarial");
		}
	}
}
