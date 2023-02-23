package unidad3;
  //ejercicio 3.16
import java.util.Scanner;

public class PruebaPersona {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		FrecuenciasCardiacas frecc = new FrecuenciasCardiacas("John", "Doe", 27,  10, 1975);
		
		System.out.println("Persona 1");
		System.out.printf("Nombre: %s %s", frecc.obtenerNombre(), frecc.obtenerApellido());
		frecc.edadPersona();
		frecc.frecMaxPersona();
		frecc.frecEspPersona();
		
		System.out.println("\n\nIngrese Datos de Persona 2");
		System.out.printf("Nombre: ");
		String Nombre = entrada.nextLine();
		frecc. establecerNombre(Nombre);
		System.out.print("Apellido: ");
		String Apellido = entrada.nextLine();
		frecc. establecerApellido(Apellido);
		System.out.println("Fecha de Nacimiento (DD/MM/AAAA)");
		System.out.print("Dia: ");
		int Dia = entrada.nextInt();
		frecc. establecerDia(Dia);
		System.out.print("Mes: ");
		int Mes = entrada.nextInt();
		frecc. establecerMes(Mes);
		System.out.print("Año: ");
		int Año = entrada.nextInt();
		frecc. establecerAño(Año);
		
		System.out.println("\nPersona 2");
		System.out.printf("Nombre: %s %s", frecc. obtenerNombre(), frecc. obtenerApellido());
		frecc. edadPersona();
		frecc. frecMaxPersona();
		frecc. frecEspPersona();
		
		
		
	}
}
