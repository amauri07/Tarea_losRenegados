package figuras_geometricas;

public class Rectángulo {
	
	private double lado1; 
	private double lado2; 
	
	public Rectángulo () {
		this.lado1 = 1;
		this.lado2 = 1;
	}

	public Rectángulo (double lado1, double lado2) {
		if (lado1 < 1 || lado2 < 1) {
            System.out.println("Error: Los valores no pueden ser negativos o cero. Se asignará un valor de 1.");
		}
		else {
		this.lado1 = lado1;
		this.lado2 = lado2;
		}
	}
	
	  public void setLado1 (double lado1) {
	    	if (lado1 < 1) {
	            System.out.println("Error: Un lado no puede ser negativos o cero.");
	        } else {
	            this.lado1 = lado1;
	        }
	    }
	  
	  public void setLado2 (double lado2) {
	    	if (lado2 < 1) {
	            System.out.println("Error: Un lado no puede ser negativos o cero.");
	        } else {
	            this.lado2 = lado2;
	        }
	    }
	    
	    public double getLado1 () {
	    	return this.lado1; 
	    }
	    public double getLado2 () {
	    	return this.lado2; 
	    }
	
    public double getPerimetro() {
        return ((lado1 * 2) + (lado2 * 2));
    }

    public double getArea() {
        return (lado1 * lado2);
    }
    
    public boolean isCuadrado(){
    	boolean estado = false;
    	if (lado1 == lado2) {
    		estado = true; 
    	}
    	else {
    		estado = false; 
    	}
		return estado;
    }

}
