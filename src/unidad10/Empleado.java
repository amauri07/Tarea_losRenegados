package unidad10;

public class Empleado extends Nomina{
	
	  private double ventasBrutas; 
	  private double tarifaComision; 
	 

	  public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision)
	   {
	      super(primerNombre, apellidoPaterno, numeroSeguroSocial);

	      if (tarifaComision <= 0.0 || tarifaComision >= 1.0) 
	   
	    	{
	    	throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");
	    	}
	    	if (ventasBrutas < 0.0)
	    	{
	    		throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
	    	}
	    	this.ventasBrutas = ventasBrutas;
	        this.tarifaComision = tarifaComision;
	    }
	  
	    public void establecerVentasBrutas(double ventasBrutas)
	     {
	         if (ventasBrutas < 0.0)
	    	 {
	        	 throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
	    	 }
	    	
	    	 this.ventasBrutas = ventasBrutas;
	    }
	    

	    public double obtenerVentasBrutas()
	     {
	    	 return ventasBrutas;
	     }
	    	

	    public void establecerTarifaComision(double tarifaComision)
	    {
	    	if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
	    	{
	    		throw new IllegalArgumentException( "La tarifa de comision debe ser > 0.0 y < 1.0");
	    	}
	    	 this.tarifaComision = tarifaComision;
	    }
	    	

	    public double obtenerTarifaComision()
	     {
	    	 return tarifaComision;
	     }
	    	
	    public double ingresos()
	     {
	    	 return obtenerTarifaComision() * obtenerVentasBrutas();
	     }
	    	
	     public String toString()
	    {
	          return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", "empleado por comision", super.toString(), "ventas brutas", obtenerVentasBrutas(),"tarifa de comision", obtenerTarifaComision());
	    }
	     
}
