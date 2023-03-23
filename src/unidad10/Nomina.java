package unidad10;

public class Nomina {
	
	private final String nombre;
	private final String apellidoPaterno;
	private final String numeroSocial;
	

	public Nomina (String nombre, String apellidoPaterno, String numeroSocial )
	{
		this.nombre=nombre;
		this.apellidoPaterno=apellidoPaterno;
		this.numeroSocial=numeroSocial;
		
	}
	

	public String obtenerNombre()
	{
		return nombre;
	}
	public String obtenerApellidoPaterno()
	{
		return apellidoPaterno;
	}
	public String obtenerNumeroSocial()
	{
		return numeroSocial;
	}
	
	public String toString()
	{
		return String.format("%s %s%nnumero de seguro social: %s",obtenerNombre(), obtenerApellidoPaterno(),obtenerNumeroSocial());
	}

	public double ingresos() {
		return 0;
	} 
}

