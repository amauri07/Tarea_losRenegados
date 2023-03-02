package unidad4;

import java.util.Scanner;

public class Criptografia {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que cifra un entero de cuatro digitos");
		System.out.println("Introduzca el numero");
		System.out.print("----> ");
		int x = entrada.nextInt();
		
		while(true) {
			
			if(x > 999 && x < 10000) {
				
				int cuatro 	= x % 10;
				int tres 	= (x / 10) % 10;
				int dos 	= (x / 100) % 10;
				int uno 	= (x / 1000) % 10;
				
				cuatro 	+= 7;
				tres 	+= 7;
				dos 	+= 7;
				uno 	+= 7;
				
				cuatro 	%= 10;
				tres 	%= 10;
				dos 	%= 10;
				uno 	%= 10;
				
				System.out.printf("El numero cifrado es: %d%d%d%d", tres, cuatro, uno, dos);
				break;
				
			}
			else {
				
				System.out.println("NUMERO INVALIDO. Vuelva a introducir el numero");
				System.out.println("----> ");
				x = entrada.nextInt();
				
			}
			
		}
		
	}

}
