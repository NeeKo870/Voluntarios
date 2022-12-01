package voluntarios6;

import java.util.Scanner;

public class EjercicioB10 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame numero:");
		int num=teclado.nextInt();
		
		String sNum="";
		
		if(num>99&&num<999) {
			sNum= String.valueOf(num);
			System.out.println("Primera cifra " + sNum.charAt(0));
			System.out.println("Cifra centra " + sNum.charAt(1));
			System.out.println("Ultima cifra " + sNum.charAt(2));
		}else
		{
			System.out.println("Fallo debe estar entre 99 y 999");
		}
		
		teclado.close();
	}
}
