package unidad10;

public class Prueba_nomina {
	
	public static void main(String[] args) 
	{

		Salario empleadoAsalariado = new Salario("Jair", "olivarse", "19530658", 800.00);
		Horas_trabajo empleadoPorHoras = new Horas_trabajo("luis", "Mendez", "19530659", 16.75, 40);
		 Empleado empleadoPorComision = new Empleado("Ricardo", "versunza", "19530660", 10000, .06);
		 Comision empleadoBaseMasComision = new Comision ("bob", "lewis", "444-444-444", 5000, .04, 300);
		
		  	System.out.println("Empleados procesados por separado:");
		
		  	System.out.printf("%n%s%n%s: $%,.2f%n%n",empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());
		  	
		  	System.out.printf("%s%n%s: $%,.2f%n%n",empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos());
		  	
		  	System.out.printf("%s%n%s: $%,.2f%n%n",empleadoPorComision, "ingresos", empleadoPorComision.ingresos());
	
		  	System.out.printf("%s%n%s: $%,.2f%n%n",empleadoBaseMasComision,"ingresos", empleadoBaseMasComision.ingresos());
		
		  	
	Nomina[] empleados = new Nomina[4];
		
		  empleados[0] = empleadoAsalariado;
		  empleados[1] = empleadoPorHoras;
		  empleados[2] = empleadoPorComision;
		  empleados[3] = empleadoBaseMasComision;
		
	 System.out.println("Empleados procesados en forma polimorfica:\n");
	
		
	 	for ( Nomina empleadoActual : empleados)
		 {
	 		System.out.println(empleadoActual); 
		
	 			if (empleadoActual instanceof Comision)
	 				{

	 	Comision empleado =(Comision) empleadoActual; 
	 	empleado.establecerSalarioBase(1.10 * empleado.obtenerSalarioBase());
	 		
	 		
	 	System.out.printf("el nuevo salario base con 10%% de aumento es: $%,.2f%n",empleado.obtenerSalarioBase());
	 	} 
	 				
	 	System.out.printf("ingresos $%,.2f%n%n", empleadoActual.ingresos());
	 	  } 
	 				

	 		for (int j = 0; j < empleados.length; j++)
	 			{
	 				System.out.printf("El empleado %d es un %s%n", j,empleados[j].getClass().getName());
	 			 } 
	 				

	}		

}
