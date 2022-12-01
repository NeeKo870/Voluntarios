package voluntarios8;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12Bis {

	public static void main(String[] args) {
		//Array de tamaño 0
		int array1[]=new int[0];
		
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
				
				
				System.out.println("Dame la posicion:");
				pos=teclado.nextInt();
				
				if(pos>array1.length) {
					
					int array2[]=new int[pos];
					System.arraycopy(array1, 0, array2, 0, array1.length);
					array1=new int[pos];
					System.arraycopy(array2, 0, array1, 0, array2.length);
				}
				array1[pos-1]=valor;
				
				
			}
		}while(!respuesta.equals("c"));
		System.out.println("Fin");
	}

}
