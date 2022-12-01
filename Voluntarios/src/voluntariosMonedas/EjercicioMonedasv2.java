package voluntariosMonedas;

import java.util.Scanner;

public class EjercicioMonedasv2 {

	public static void main(String[] args) {
		//Array de monedas y sus contadores de 50e hasta 1cent
		double arrMonedas[]= {50,20,10,5,2,1,0.5,0.2,0.1,0.05,0.02,0.01};
		int contMonedas[]= new int[arrMonedas.length];
	
		//Pedimos la cantidad por teclado
		Scanner teclado = new Scanner(System.in);	
		for (int cont = 0;cont<arrMonedas.length;cont++) {
			if(arrMonedas[cont]==50) {
				System.out.println("Dime cuantos billetes de " + arrMonedas[cont] + " €:");
				contMonedas[cont]=teclado.nextInt();	
			}else if(arrMonedas[cont]==20) {
				System.out.println("Dime cuantos billetes de " + arrMonedas[cont] + " €:");
				contMonedas[cont]=teclado.nextInt();
			}else if(arrMonedas[cont]==10) {
					System.out.println("Dime cuantos billetes de " + arrMonedas[cont] + " €:");
					contMonedas[cont]=teclado.nextInt();
			}else if(arrMonedas[cont]<5||arrMonedas[cont]>1){
				System.out.println("Dime cuantas monedas de " + arrMonedas[cont] + " €:");
				contMonedas[cont]=teclado.nextInt();
			}else {
				System.out.println("Dime cuantos centimos de " + arrMonedas[cont] + " €:");
				contMonedas[cont]=teclado.nextInt();
			}

		}
		
		double cantFinal=0;
		for (int cont = 0;cont<arrMonedas.length;cont++) {
			if(contMonedas[cont]!=0) {
				cantFinal+=arrMonedas[cont]*contMonedas[cont];
			}
			
		}
		System.out.println(cantFinal);
	}

}
