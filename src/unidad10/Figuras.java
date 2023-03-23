package unidad10;

public class Figuras {
	
	public abstract class Figura {
	    public abstract String obtenerDescripcion();
	}

	public abstract class FiguraBidimensional extends Figura {
	    public abstract double obtenerArea();
	}

	public abstract class FiguraTridimensional extends Figura {
	    public abstract double obtenerAreaSuperficial();
	    public abstract double obtenerVolumen();
	}
	

}
