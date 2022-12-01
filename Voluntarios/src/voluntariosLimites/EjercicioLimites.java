package voluntariosLimites;

import java.util.Scanner;

public class EjercicioLimites {
	/*- Leer_limites_del_intervalo: Función que lee los dos límites del intervalo.
	- Intercambiar_variables: Función que intercambia el valor de dos variables.
	- Numero_fuera_del_intervalo: Función que indica si número está fuera del intervalo.
	- Comprobar_limites: Función que te dice si el número introducido es igual a algunos de los límites.*/
	public static void leer_limites_del_intervalo(Scanner scan) {
		int arrLim[] = new int[2];
		System.out.println("Dame numero 1");
		arrLim[0]=scan.nextInt();
		
		System.out.println("Dame numero 2");
		arrLim[1]=scan.nextInt();
		intercambiar_variables(arrLim);
		leerNumeros(scan, arrLim);
	}
	public static void intercambiar_variables(int[] arr) {
		if(arr[0]>arr[1]) {
			int a = arr[0];
			int b = arr[1];
			arr[0]=b;
			arr[1]=a;
			System.out.println("Limite menor: " + arr[0]);
			System.out.println("Limite mayor: " + arr[1]);
		}else {
			System.out.println("Limite menor: " + arr[0]);
			System.out.println("Limite mayor: " + arr[1]);
		}
	}
	public static void leerNumeros(Scanner scan,int[] arr) {
		
		int contNumeros=0;
		int NumerosIguales=0;
		int numero=0;
		do {
			System.out.println("Dame numero para limite:");
			numero=scan.nextInt();
			if(arr[0]<=numero&&arr[1]>=numero) {
				contNumeros++;
			}
			NumerosIguales = comprobar_limites(numero, arr,NumerosIguales);
		}while(numero>0);
		
		System.out.println("Se han introducido " + contNumeros + " dentro del limite");
		
		if(NumerosIguales!=0) {
			System.out.println("Se han introducido numeros "+ NumerosIguales +" iguales al limite");
		}else {
			System.out.println("No hay numeros iguales al limite");
		}
		
	}
	public static int comprobar_limites(int n,int[] arr, int contNumeros) 
	{
		
		if(arr[0]==n||arr[1]==n) {
			contNumeros++;
		}
		return contNumeros;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		leer_limites_del_intervalo(scan);
		scan.close();
	}

}
