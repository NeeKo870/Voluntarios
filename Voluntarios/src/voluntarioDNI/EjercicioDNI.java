package voluntarioDNI;

import java.util.Scanner;

public class EjercicioDNI {
	public static char calcularLetraDNI(int DNI) {
		char array1[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','C','L','K','E'};
		
		return array1[DNI%23];
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int DNI=0;
		do {
		System.out.println("Dame DNI");
		DNI = scanner.nextInt();
		}while(DNI>999999 && DNI<99999999);
		
		System.out.println("Tu letra del DNI es: " + calcularLetraDNI(DNI));
		scanner.close();
	}
}
