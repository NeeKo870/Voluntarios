package voluntarios8;

public class Ejercicio14 {

	public static void main(String[] args) {
		//Array de tamaño 55
		int array[]=new int[55];
		//Rellenamos el array con los numeros
		int valor=1;
		int numVeces=1;
		
		for (int cont=0; cont<array.length;) {
			//Cuantas veces tenemos que meter el valor 
			numVeces=valor;
			/**Mientras las veces no sean 0 asignamos valor,decrementamos el numero de veces 
			e incrementamos el contador de posiciones para acceder a la siguiente**/
			while(numVeces!=0) {
				
				array[cont]=valor;
				numVeces--;
				cont++;
			}
			
			valor++;
		}
		//Eco en TFT
		System.out.println("Array");		
		for(int valorImp: array) {
			System.out.print(valorImp +" ");
		}
	}

}
