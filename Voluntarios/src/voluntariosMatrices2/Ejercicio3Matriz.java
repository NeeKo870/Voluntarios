package voluntariosMatrices2;

import java.util.Scanner;

/*Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
menores que cero y cuántos son igual a cero.*/
public class Ejercicio3Matriz {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Pedimos N y M
		System.out.println("Dame las filas: ");
		int fila=teclado.nextInt();
		System.out.println("Dame las columnas: ");
		int columna=teclado.nextInt();
		
		int[][] matriz =  new int[fila][columna];
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Dame el valor para la fila " + i + " y columna "+ j +": ");
				matriz[i][j]=teclado.nextInt();
				
			}			
		}
		int contMay=0;
		int contMen=0;
		int contIgual=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if(matriz[i][j]>0) 
				{
					contMay++;
				}else if(matriz[i][j]< 0) 
				{
					contMen++;
				}else 
				{
					contIgual++;
				}
				 
			}
			
		}
		System.out.println("Menores que 0: " + contMen + "\nIguales a 0: " + contIgual + "\nMayores a 0: " +contMay);
	}
}
