package voluntariosMatrices2;
/* Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.*/
public class Ejercicio2Matriz {
	
	public static void main(String[] args) {
		int[][] matriz =  new int[10][10];
		int producto1=1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				 matriz[i][j]=producto1*10;
				 
			}
			producto1++;
		}
		producto1=1;
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Tabla de: " + producto1 + " x 10");
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.println(producto1+" x 10="+ matriz[i][j]);
				 
			}
			System.out.println();
			producto1++;
		}
	}
}
