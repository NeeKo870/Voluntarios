package voluntarios6;


import java.util.Scanner;

public class EjercicioEC10 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame un mes:");
		int mes=teclado.nextInt();
		
		String sMes="";
		int dias=0;
		
		switch (mes) {
		case 1: 
			sMes="Enero";
			dias=31;
			break;
			
		case 2: 
			sMes="Febrero";
			dias=28;
			break;
			
		case 3: 
			sMes="Marzo";
			dias=31;
			break;
			
		case 4: 
			sMes="Abril";
			dias=30;
			break;
			
		case 5: 
			sMes="Mayo";
			dias=31;
			break;
			
		case 6: 
			sMes="Junio";
			dias=30;
			break;
			
		case 7: 
			sMes="Julio";
			dias=31;
			break;
			
		case 8: 
			sMes="Agosto";
			dias=31;
			break;
			
		case 9: 
			sMes="Septiembre";
			dias=30;
			break;
			
		case 10: 
			sMes="Octubre";
			dias=31;
			break;
			
		case 11: 
			sMes="Noviembre";
			dias=30;
			break;
			
		case 12: 
			sMes="Diciembre";
			dias=31;
			break;
			
		default:
			System.out.println("No es un mes");
			break;
			
		}
		
		if(dias!=0) {
			System.out.println("Mes: "+ sMes + " \ndias: " +dias);
		}
		teclado.close();
		
	}
}
