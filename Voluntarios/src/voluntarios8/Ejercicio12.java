package voluntarios8;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		//Array de tamaño 10
		int array1[]=new int[10];
		
		//Rellenamos el array
		for (int cont=0, cont2=1; cont<array1.length;cont++,cont2++) {
			array1[cont]=cont2;
		}
		String respuesta="";
		Scanner teclado = new Scanner(System.in);	
		//Mientras la repuesta no sea c se repetira
		do {	
			System.out.println("a. Mostrar valores.\n"+ "b. Introducir valor.\n"+ "c. Salir. ");
			respuesta=teclado.next();
			//Opcion a mostramos los valores
			if(respuesta.equals("a")){
				
				System.out.println("Array");
				
				for(int valor: array1) {
					System.out.print(valor +" ");
				}
				System.out.println("");
			
			}
			//Opcion b modificamos el valor de la posicion ambos dados por usuario
			if(respuesta.equals("b")){
				
				System.out.println("Dame el valor:");
				int valor=teclado.nextInt();
				int pos=0;
				
				do {
					System.out.println("Dame la posicion entre 0 y 9:");
					pos=teclado.nextInt();
				}while(pos<0||pos>9);
				
				array1[pos]=valor;
			}
		}while(!respuesta.equals("c"));
		System.out.println("Fin");
	}

}
