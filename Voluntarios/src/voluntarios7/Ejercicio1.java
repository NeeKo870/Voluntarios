package voluntarios7;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		//Array de monedas y sus contadores de 50e hasta 1e
		int arrMonedas[]= {50,20,10,5,2,1};
		int contMonedas[]= new int[arrMonedas.length];
		
		//Array de centimos y sus contadores de 50cent hasta 1cent 
		double arrCentimos[]= {0.5,0.2,0.1,0.05,0.02,0.01};
		int contCentimos[]= new int[arrCentimos.length];
		
		//Pedimos la cantidad por teclado
		Scanner teclado = new Scanner(System.in);	
		System.out.println("Dime la cantidad: ");
		double cant=teclado.nextDouble();
		
		/**Separamos euros de centimos ya que al dividir entre uno el resto es la parte decimal
		   y se la quitamos a la cantidad para quedarnos con los euros
		**/
		double centimos= cant%1;
		double euros= cant-centimos;
		
		//Recorremos el array de monedas
		for(int cont=0;cont<arrMonedas.length;cont++) {
			
			//Reiniciamos contador cada vez que tenemos que usarlo de nuevo
			int contMone=0;
			
			//Bucle que incrementa el contador y le va quitando la cantidad del array hasta que esta sea menor y pase a la siguiente
			while(euros>=arrMonedas[cont]) {
				contMone++;	
				euros=euros-arrMonedas[cont];				
			}
			//Asignamos la cantidad de monedas
			contMonedas[cont]=contMone;
		}
		//Al separar la parte decimal queda 0.x9999 asi que le sumamos 0.01 para que se quede bien
		centimos+=0.01;
		//Repetimos el proceso con los centimos
		for(int cont=0;cont<arrCentimos.length;cont++) {
			int contCent=0;
			
			while(centimos>=arrCentimos[cont]) {
				contCent++;
				
				centimos=centimos-arrCentimos[cont];
				
			}
			contCentimos[cont]=contCent;
		}
		//Eco en TFT
		System.out.println("Monedas");
		for (int i = 0; i < contMonedas.length; i++) {
			
			System.out.println(arrMonedas[i]+" euros: "+ contMonedas[i]);
			
		}
		
		System.out.println("\n\nCentimos");
		for (int i = 0; i < contCentimos.length; i++) {
			
			System.out.println(arrCentimos[i]*100+" cent: "+contCentimos[i]);
		}
	}
}
