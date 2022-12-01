package voluntarios3;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame tu clave:");
		
		int clave = teclado.nextInt();
		
		if(clave == 1234)
		{
			System.out.println("Correcto");
		}
		else
		{
			System.out.println("Incorrecto");
		}
		teclado.close();
	}

}
