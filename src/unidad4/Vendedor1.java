package unidad4;

import java.util.Scanner;
     //Ejercicio 4.19
public class Vendedor1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		CalculadoraComisiones vendedor1 = new CalculadoraComisiones();
		
		System.out.println("Programa que calcula las comisiones de los vendedores");
		
		while(true){
			
			System.out.print("\nSeleccione una opcion" + 
			"\n\n1) Calcular comision de vendedor" + 
			"\n2) Salir" + 
			"\n----> ");
			
			int x = entrada.nextInt();
			
			if(x == 1){
				vendedor1.ventas();
				vendedor1.comisionXVta();
			}
			else if(x == 2){
				System.out.println("PROGRAMA TERMINADO");
				break;
			}
			else{
				System.out.println("***OPCION INCORRECTA, VUELVA A INGRESAR SU ELECCION***");
			}
			
		}
		
	}

	}
