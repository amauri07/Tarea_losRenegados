package unidad9;

public class Empleado_mas_comision extends Empleado_por_comision{
	
	private double salarioBase;

	public Empleado_mas_comision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) { 
		super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas,tarifaComision);
	 
	this.salarioBase = salarioBase;
	}

	public double ingresos() {
	return salarioBase + super.ingresos();
	}

	public String toString() {
	return String.format("empleado con salario base más comisión: %s%nsalario base: $%,.2f",super.toString(), salarioBase);
	}
}
