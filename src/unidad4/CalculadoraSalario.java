package unidad4;
   //Ejercicio 4.20
import java.util.Scanner;

public class CalculadoraSalario {
	

	
public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		while(true){
			
			System.out.print("Seleccione una opcion\n" + 
			"\n1) Calcular y mostrar el sueldo bruto de 1 trabajador" +
			"\n2) Calcular y mostrar el sueldo bruto de 2 trabajadores" +
			"\n3) Calcular y mostrar el sueldo bruto de 3 trabajadores" +
			"\n4) Finalizar \n----> ");
			
			int x = entrada.nextInt();
			
			if(x == 1){
				
				Sueldo empleado1 = new Sueldo();
				System.out.println("\nINFORMACION DE EMPLEADO");
				empleado1.datosSalario();
				empleado1.calculoSalario();
				System.out.println();
				
			}
			else if(x == 2){
				
				Sueldo empleado1 = new Sueldo();
				Sueldo empleado2 = new Sueldo();
				
				System.out.println("\nINFORMACION DE EMPLEADO 1");
				empleado1.datosSalario();
				System.out.println("\nINFORMACION DE EMPLEADO 2");
				empleado2.datosSalario();
				
				System.out.println("\n===TRABAJADOR 1===");
				empleado1.calculoSalario();
				System.out.println("===TRABAJADOR 2===");
				empleado2.calculoSalario();
				System.out.println();
				
			}
			else if(x == 3){
				
				Sueldo empleado1 = new Sueldo();
				Sueldo empleado2 = new Sueldo();
				Sueldo empleado3 = new Sueldo();
				
				System.out.println("\nINFORMACION DE EMPLEADO 1");
				empleado1.datosSalario();
				System.out.println("INFORMACION DE EMPLEADO 2");
				empleado2.datosSalario();
				System.out.println("INFORMACION DE EMPLEADO 3");
				empleado3.datosSalario();
				
				System.out.println("\n===TRABAJADOR 1===");
				empleado1.calculoSalario();
				System.out.println("===TRABAJADOR 2===");
				empleado2.calculoSalario();
				System.out.println("===TRABAJADOR 3===");
				empleado3.calculoSalario();
				System.out.println();
				
			}
			else if(x == 4){
				System.out.println("PROGRAMA TERMINADO");
				break;
			}
			else{
				System.out.println("\n***ELECCION INCORRECTA, VUELVA HACER SU SELECCION***\n");
			}
			
		}
	
		
		
	}

}
