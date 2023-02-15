package unidad2;

import java.util.Scanner;

public class Ejercicio2_17 {
	
	public static void main(String[]args) {
		Scanner entrada = new Scanner (System.in);
		System.out.print("escribir 1er numero entero:");
		int num1 = entrada.nextInt();
		
		System.out.print("escribir 2do numero entero:");
		int num2 = entrada.nextInt();
		
		System.out.print("escribir 3er numero entero:");
		int num3 = entrada.nextInt();
		
		int suma = num1 + num2 + num3;
		int promedio = suma/3;
		int producto = num1 * num2 * num3;
		int menor = Math.min(Math.min(num1, num2),num3);
		int mayor = Math.max(Math.max(num1, num2),num3);
		
		System.out.println("suma:"+ suma);
		System.out.println("promedio:"+ promedio);
		System.out.println("producto:"+ producto);
		System.out.println("menor:"+ menor);
		System.out.println("mayor:"+ mayor);
		entrada.close();
	}

}
