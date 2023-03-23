package unidad9;

public class Horas extends Empleado{
	
	public Horas(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double sueldo, double horas) {
		super(primerNombre, apellidoPaterno, numeroSeguroSocial, sueldo, horas);
	}

	public static void main(String[] args) {
		Horas empleado = new Horas("Juan", "Perez", "123-45- 6789", 15.25, 40);
		System.out.println("Informacion del empleado obtenida por los metodos establecer:\n");
		System.out.printf("El primer nombre es: %s%n", empleado.obtenerPrimerNombre()); 
		System.out.printf("El apellido paterno es: %s%n",empleado.obtenerApellidoPaterno());
		System.out.printf("El numero de seguro social es: %s%n", empleado.obtenerNumeroSeguroSocial());
		System.out.printf("El sueldo por hora es: %.2f%n", empleado.obtenerSueldo()); 
		System.out.printf("Las horas trabajadas son: %.2f%n", empleado.obtenerHoras()); 
		System.out.printf("Los ingresos son: $%,.2f%n", empleado.ingresos());
		 
		empleado.establecerHoras(50); 
		empleado.establecerSueldo(20);
		System.out.printf("%n%s:%n%n%s%n", "Informacion actualizada del empleado obtenida por toString", empleado.toString());
		System.out.printf("Los ingresos son: $%,.2f%n", empleado.ingresos());
	}

}
