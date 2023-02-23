package unidad3;
//Ejercicio 3.17
import java.time.LocalDate;
import java.time.Period;

public class PerfilMedico {

	private String Nombre;
	private String Apellido;
	private char Sexo;
	private int Dia;
	private int Mes;
	private int Año;
	private double Altura;
	private double Peso;
	
	public PerfilMedico(String Nombre, String Apellido, char Sexo, int Dia, int Mes, int Año, double Altura, double Peso) {
		this.establecerNombre(Nombre);
		this.establecerApellido(Apellido);
		this.establecerSexo(Sexo);
		this.establecerDia(Dia);
		this.establecerMes(Mes);
		this.establecerAño(Año);
		this.establecerAltura(Altura);
		this.establecerPeso(Peso);
		
	}
	public String obtenerNombre() {
		return Nombre;
	}
	public void establecerNombre(String Nombre) {
		this.Nombre=Nombre;
	}
	public String obtenerApellido() {
		return Apellido;
	}
	public void establecerApellido(String Apellido) {
		this.Apellido=Apellido;
	}
	public char obtenerSexo() {
		return Sexo;
	}
	public void establecerSexo(char Sexo) {
		this.Sexo=Sexo;
	}
	public int obtenerDia() {
		return Dia;
	}
	public void establecerDia(int Dia) {
		this.Dia=Dia;
	}
	public int obtenerMes() {
		return Mes;
	}
	public void establecerMes(int Mes) {
		this.Mes=Mes;
	}
	public int obtenerAño() {
		return Año;
	}
	public void establecerAño(int Año) {
		this.Año=Año;
	}
	public double obtenerAltura() {
		return Altura;
	}
	public void establecerAltura(double Altura) {
		this.Altura=Altura;
	}
	public double obtenerPeso() {
		return Peso;
	}
	public void establecerPeso(double Peso) {
		this.Peso=Peso;
	}
	public void EdadPersona() {
		LocalDate FechaNacimiento = LocalDate.of(Año, Mes, Dia);
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(FechaNacimiento, hoy);
		
		System.out.printf("Edad: %d", periodo.getYears());
	}
	public void FrecuenciaCardiacaMaxima() {
		LocalDate FechaNacimiento = LocalDate.of(Año, Mes, Dia);
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(FechaNacimiento, hoy);
		
		System.out.printf("Frecuencia Cardiaca Maxima: %d", 220 - periodo.getYears());
	}
	public void FrecuenciaCardiacaPromedio() {
		LocalDate FechaNacimiento = LocalDate.of(Año, Mes, Dia);
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(FechaNacimiento, hoy);
		
		System.out.printf("Frecuencia Cardiaca Promedio: %.0f y %.0f", (220 - periodo.getYears())*0.5, (220 - periodo.getYears())*0.85);
	}
	public void IMC() {
		 
		double IMC;
		IMC= Peso/(Altura*Altura);
		
		if(IMC < 18.5) {
			System.out.printf("IMC es: %.2f **Bajo de Peso**", IMC);
		}
		else if(IMC >= 18.5 && IMC <= 24.9) {
			System.out.printf("IMC es: %.2f **Peso Normal", IMC);
		}
		else if(IMC >= 25 && IMC <= 29.9) {
			System.out.printf("IMC es: %.2f **Sobrepeso**", IMC);
		}
		else {
			System.out.printf("IMC es: %.2f **Obesidad**", IMC);
		}
	}

}
