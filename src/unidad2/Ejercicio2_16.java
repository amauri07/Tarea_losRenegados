package unidad2;

import java.util.Scanner;

public class Ejercicio2_16 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner entrada= new Scanner(System.in)){
			int num1;
			int num2;
			System.out.println("\n introduzca un entero: ");
			num1 = entrada.nextInt();
			
			System.out.println("\n introduzca otro entero: ");
			num2 = entrada.nextInt();
			
			System.out.printf("el mayor es: %d\n", Math.max(num1, num2));
			System.out.printf("el menor es: %d\n", Math.min(num1, num2));
			
			if (num1 == num2);
			System.out.printf("\n el numero %d es igual al numero %d\n", num1, num2);
		}
	}

}
