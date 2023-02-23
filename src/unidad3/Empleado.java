package unidad3;
//Ejercicio 3.13
public class Empleado {
	
	String PrimerNombre;
	String ApellidoPaterno;
	double SalarioMensual;
	public Empleado() {
	}
	public Empleado (String PrimerNombre, String ApellidoPaterno, double SalarioMensual) {
		this.PrimerNombre=PrimerNombre;
		this.ApellidoPaterno=ApellidoPaterno;
		this.SalarioMensual=SalarioMensual;
	}
	public void establecerPrimerNombre(String PrimerNombre) {
		this.PrimerNombre=PrimerNombre;
	}
	public String obtenerPrimerNombre() {
		return this.PrimerNombre;
	}
	public void establecerApellidoPaterno(String ApellidoPaterno) {
		this.ApellidoPaterno=ApellidoPaterno;
	}
	public String obtenerApellidoPaterno() {
		return this.ApellidoPaterno;
	}
	public void establecerSalarioMensual(double SalarioMensual) {
		this.SalarioMensual = SalarioMensual;
	}
	public double obtenerSalarioMensual() {
		return this.SalarioMensual;
	}
}
