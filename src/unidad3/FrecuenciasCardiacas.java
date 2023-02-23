package unidad3;
//Ejercicio 3.16
import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {
	
	private String Nombre;
	private String Apellido;
	private int Dia ;
	private int Mes;
	private int Año;
	
	public FrecuenciasCardiacas(String Nombre, String Apellido, int Dia, int Mes,  int  Año){
		
		this.establecerNombre(Nombre);
		this.establecerApellido(Apellido);
		this.establecerDia(Dia);
		this.establecerMes(Mes);
		this.establecerAño(Año);
	}

	
	public String obtenerNombre() {
		return Nombre;
	}
	public void establecerNombre(String Nombre ) {
		this.Nombre = Nombre;
	}

	public String obtenerApellido() {
		return Apellido;
	}

	public void establecerApellido(String Apellido) {
		this.Apellido = Apellido;
	}

	public int obtenerDia() {
		return Dia;
	}

	public void establecerDia(int Dia) {
		this.Dia = Dia;
	}

	public int obtenerMes() {
		return Mes;
	}

	public void establecerMes(int Mes) {
		this.Mes = Mes;
	}

	public int obtenerAño() {
		return Año;
	}

	public void establecerAño(int Año) {
		this.Año = Año;
	}

	public void edadPersona(){
		
		LocalDate fechaNac = LocalDate.of(Año, Mes, Dia);
		LocalDate ahora = LocalDate.now();
		
		Period periodo = Period.between(fechaNac, ahora);
		System.out.printf("%nEdad: %d Años", periodo. getYears());
		
	}
	
	 public void frecMaxPersona(){
		
		LocalDate fechaNac = LocalDate.of(Año, Mes, Dia);
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechaNac, ahora);
		
		System.out.printf("%nFrecuencia cardiaca maxima: %d", 220 - periodo. getYears());
		
	}
	
	 public void frecEspPersona(){
		
		
		LocalDate fechaNac = LocalDate.of(Año, Mes, Dia);
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechaNac, ahora);
		
		System.out.printf("%nRango de frecuencia cardiaca esperada: entre %.0f y %.0f", (220 - periodo. getYears())*0.5, (220 - periodo. getYears())*0.85);
		
	}

}
