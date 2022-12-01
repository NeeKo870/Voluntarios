package voluntariosMatrices2;

import java.util.Scanner;

/*
 * . Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
programa mostrará la nota mínima, máxima y media de cada alumno.
*/
public class Ejercicio4Matriz {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[][] matriz =  new double[4][5];
		double valor=0.0;
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Dame el valor para el alumno " + (i+1) + " y asignatura "+ (j+1) +": ");
				valor=teclado.nextDouble();
				if(valor>0&&valor<10) {
					matriz[i][j]=valor;
				}else {
					System.out.println("Error nota entre 0 y 10");
				}
				
			}			
		}
		
		double notaMedia=0.0;
		double notaMax=0.0;
		double notaMin=0.0;
		
		for (int i = 0; i < matriz.length; i++) {
			notaMin=matriz[i][0];
			notaMax=matriz[i][0];
			for (int j = 0; j < matriz[i].length; j++) {
				if(notaMin>matriz[i][j]) {
					notaMin = matriz[i][j];
				}else if(notaMax<matriz[i][j]) {
					notaMax = matriz[i][j];
					
				}
				notaMedia +=matriz[i][j];
			}
			System.out.println("Alumno " + (i+1) + ": ");
			System.out.println("Media: " + (notaMedia/5) +"\nMaxima:"+ notaMax+ "\nMinima:"+ notaMin );
			System.out.println();
		}
		

	}
}
