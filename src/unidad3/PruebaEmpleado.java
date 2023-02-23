package unidad3;
//Ejercicio 3.13
public class PruebaEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado1 = new Empleado ("Jose","Enriquez", 5400);
		
		System.out.println("El salario anual de "+ empleado1.obtenerPrimerNombre()+""+ empleado1.obtenerApellidoPaterno()+" es de: "+ String.format("%.2f", empleado1.obtenerSalarioMensual()*12));
		System.out.println("El salario anual de "+ empleado1.obtenerPrimerNombre()+ " mas el 10% es de:"+ String.format("%.2f", empleado1.obtenerSalarioMensual()*12*1.1));
		
		Empleado empleado2 = new Empleado ("Amauri","Ibañez", 4800);
		
		System.out.println("El salario anual de "+ empleado2.obtenerPrimerNombre()+""+ empleado2.obtenerApellidoPaterno()+" es de: "+ String.format("%.2f", empleado2.obtenerSalarioMensual()*12));
		System.out.println("El salario anual de "+ empleado2.obtenerPrimerNombre()+ " mas el 10% es de:"+ String.format("%.2f", empleado2.obtenerSalarioMensual()*12*1.1));
		
	}

}
