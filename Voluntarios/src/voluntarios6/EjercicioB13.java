package voluntarios6;

import java.util.Scanner;

public class EjercicioB13 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Pedimos valores
		System.out.print("Dame el dia: ");
		int dia=teclado.nextInt();
		
		System.out.print("Dame el mes: ");
		int mes=teclado.nextInt();
		
		System.out.print("Dame el año: ");
		int anio=teclado.nextInt();
		
		//suma de los valores
		int sumaFecha=dia+mes+anio;
		
		int diaSuerte=0;
		
		//otro metodo
		/*String sFecha =String.valueOf(sumaFecha);
		int diaSuerte=Character.getNumericValue(sFecha.charAt(3)) ;
		diaSuerte+=Character.getNumericValue(sFecha.charAt(2));
		diaSuerte+=Character.getNumericValue(sFecha.charAt(1));
		diaSuerte+=Character.getNumericValue(sFecha.charAt(0));*/
		
		//Ej 2018: 2018/10 el resto es 8 y el cociente es 201 se le asigna a diaSuerte el resto y el cociente a la sumafecha para seguir quitandole y sumandolo a diaSuerte
		diaSuerte +=sumaFecha%10;
		sumaFecha=sumaFecha/10;
		
		diaSuerte +=sumaFecha%10;
		sumaFecha=sumaFecha/10;

		diaSuerte +=sumaFecha%10;
		sumaFecha=sumaFecha/10;

		diaSuerte +=sumaFecha;
		System.out.println("Dia de la suerte: " + diaSuerte);
		teclado.close();
	}
}
