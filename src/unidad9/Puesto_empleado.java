package unidad9;

public class Puesto_empleado {
	

	private String primerNombre; private String apellidoPaterno; private String numeroSeguroSocial;

	public Puesto_empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
	this.primerNombre = primerNombre; this.apellidoPaterno = apellidoPaterno; this.numeroSeguroSocial = numeroSeguroSocial;
	}

	public String obtenerPrimerNombre() { return primerNombre;
	}

	public String obtenerApellidoPaterno() { return apellidoPaterno;
	}

	public String obtenerNumeroSeguroSocial() { return numeroSeguroSocial;
	}

	public String toString() {
	 
	return String.format("%s %s%nnúmero de seguro social: %s", obtenerPrimerNombre(), obtenerApellidoPaterno(),
	obtenerNumeroSeguroSocial());
	}

}
