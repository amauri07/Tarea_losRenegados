package unidad2;

import java.util.Scanner;

public class Ejercicio2_33 {
	
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)){
			System.out.print("peso en Kilogramo: ");
			double peso = input.nextDouble();
			System.out.print("altura en metros: ");
			double altura = input.nextDouble();
			double bmi = peso/(altura*altura);
			System.out.println("su masa corporal es: "+ bmi);
			
			if (bmi > 30) {
				System.out.println("obesidad");
			}
			else if (bmi < 30 &&bmi > 25){
				System.out.println("sobre peso");
			}
			else if (bmi < 25 &&bmi > 18.5){
				System.out.println("peso normal");
			}
			else if (bmi <= 18.5) {
				System.out.println("bajo peso");
			}
		}
		System.out.println(" ");
		System.out.println("*****BMI valores*****");
		System.out.println("bajo peso: menos de 18.5");
		System.out.println("normal: entre 18.5 y 24.9");
		System.out.println("sobrepeso: entre 25 y 29.9");
		System.out.println("obeso: 30 o mas");

	}

}
