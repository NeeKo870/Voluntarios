package voluntariosMatriz;

import java.util.Scanner;

public class EjercicioSalario {

	public static void main(String[] args) {
		double salario[][]=new double[4][7];
		double acumuSueldo=0.0; 
		Scanner teclado = new Scanner(System.in);
		
		for(int col=0;col<salario[0].length;col++) {
			System.out.println("Dime salario de la primera semana dia " + (col+1)+": ");
			salario[0][col]=teclado.nextDouble();
		}
		
		for(int fila=0;fila<salario.length-1;fila++) {
			
			for(int col=0;col<salario[0].length;col++) {
				
				double valCol=salario[fila][col];
				salario[fila+1][col]=valCol+(valCol*0.1);
				
			}
		}
		for(int fila=0;fila<salario.length;fila++) {
			System.out.println("Semana: " + (fila+1));
			for(int col=0;col<salario[0].length;col++) {
				if(salario[fila][col]!=0) {
					System.out.println(" Dia: " + (col+1) + " " + salario[fila][col]);
					acumuSueldo+=salario[fila][col];
				}
				
			}
		}
		System.out.println("Total: "+ acumuSueldo);
		

	}

}
