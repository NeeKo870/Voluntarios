package voluntarios8;

public class Ejercicio11 {

	public static void main(String[] args) {
		//Arrays de tamaño 100
		int array1[]=new int[100];
		int array2[]=new int[100];
		
		//Rellenamos el array1
		for (int cont=0, cont2=1; cont<array1.length;cont++,cont2++) {
			array1[cont]=cont2;
		}
		
		//Copia inversa del array1 al array2
		
		for (int cont=0, cont2=array1.length-1; cont<array2.length;cont++,cont2--) {
			array2[cont]=array1[cont2];
		}
		//Eco en TFT
		System.out.println("Array1");		
		for(int valor: array1) {
			System.out.print(valor +" ");
		}
		System.out.println("\nArray2");		
		for(int valor: array2) {
			System.out.print(valor +" ");
		}
	}

}
