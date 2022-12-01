package voluntarios6;

import java.util.Scanner;

public class EjercicioER6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int edad=0;
		int promedio=0;
		int contVeces=0;
		
		do {
			
			System.out.print("Dame edad:");
			edad=teclado.nextInt();
			
			contVeces++;
			//Sumatorio de valores entre numero de valores
			promedio = (promedio+edad)/contVeces;
			System.out.println("Promedio: " + promedio);
		}while(promedio<25);
		
		System.out.print("Fin");
		
		teclado.close();
	}
}
