package unidad3;
//Ejercicio 3.17
import java.util.Scanner;

public class Persona {

	public static void main(String[] args) {
		
PerfilMedico Persona = new PerfilMedico("Rogelio", "Funes", 'M', 5, 10, 1998, 1.75, 80);
		
		Scanner entrada = new Scanner(System.in);
		
			System.out.println("paciente1");
			System.out.printf("Nombre: %s %s", Persona.obtenerNombre(), Persona.obtenerApellido());
			System.out.printf("%nSexo: %c", Persona.obtenerSexo());
			System.out.println("");
			Persona.EdadPersona();
			System.out.println("");
			Persona.FrecuenciaCardiacaMaxima();
			System.out.println("");
			Persona.FrecuenciaCardiacaPromedio();
			System.out.println("");
			Persona.IMC();
			
			System.out.println("\n\nIngresar datos de nuevo paciente");
			System.out.print("Nombre: ");
			String Nombre = entrada.nextLine();
			System.out.print("Apellido: ");
			String Apellido = entrada.nextLine();
			System.out.print("Sexo (M o F): ");
			char Sexo = entrada.next().charAt(0);
			System.out.println("Fecha Nacimiento (DD/MM/YYYY");
			System.out.print("Dia: ");
			int Dia = entrada.nextInt();
			System.out.println("Mes: ");
			int Mes = entrada.nextInt();
			System.out.print("Año: ");
			int Año = entrada.nextInt();
			System.out.print("Altura (metros): ");
			double Altura = entrada.nextDouble();
			System.out.print("Peso (kg): ");
			double Peso = entrada.nextDouble();
			
			Persona.establecerNombre(Nombre);
			Persona.establecerApellido(Apellido);
			Persona.establecerSexo(Sexo);
			Persona.establecerDia(Dia);
			Persona.establecerMes(Mes);
			Persona.establecerAño(Año);
			Persona.establecerAltura(Altura);
			Persona.establecerPeso(Peso);
		
			System.out.println("\nPaciente2");
		System.out.printf("Nombre: %s %s", Persona.obtenerNombre(), Persona.obtenerApellido());
		System.out.printf("%nSexo: %c", Persona.obtenerSexo());
		System.out.println("");
		Persona.EdadPersona();
		System.out.println("");
		Persona.FrecuenciaCardiacaMaxima();
		System.out.println("");
		Persona.FrecuenciaCardiacaPromedio();
		System.out.println("");
		Persona.IMC();
	}


	}

