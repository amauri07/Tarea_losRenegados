package figuras_geometricas;

public class Triángulo {
	
	private String tipo; 
	private double lado1; 
	private double lado2; 
	private double lado3;  
	
	public Triángulo () {
		this.lado1 = 1;
		this.lado2 = 1;
		this.lado3 = 1;
	}

	public Triángulo (double lado1, double lado2, double lado3) {
		if (lado1 < 1 || lado2 < 1 || lado3 < 1) {
            System.out.println("Error: Los valores no pueden ser negativos o cero. Se asignará un valor de 1.");
		}
		else {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
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
  public void setLado3 (double lado3) {
  	if (lado3 < 1) {
          System.out.println("Error: Un lado no puede ser negativos o cero.");
      } else {
          this.lado3 = lado3;
      }
  }
    
    public double getLado1 () {
    	return this.lado1; 
    }
    public double getLado2 () {
    	return this.lado2; 
    }
    
    public double getLado3 () {
    	return this.lado3; 
    }
	
    public String getTipo () {
    	if (lado1 == lado2 && lado1 == lado3) { 
    		tipo = "Equilatero";
    	}
    	if (lado1 == lado2 && lado1 != lado3) {
    		tipo = "Isóceles";
    	}
    	if (lado2 == lado3 && lado2 != lado1) {
    		tipo = "Isóceles";
    	}
    	if (lado3 == lado1 && lado1 != lado2 ) {
    		tipo = "Isóceles";
    	}
    	if (lado1 != lado2 && lado2 != lado3) { 
    		tipo = "Escaleno";
    	}
    	return tipo;
    }
    
    public double getPerimetro() {
    	double perimetro = lado1+lado2+lado3; 
    	return perimetro; 
    }

    public double getArea() {
    	double s;
    	s = (lado1+lado2+lado3)/2; 
    	double valor = s*(s-lado1)*(s-lado2)*(s-lado3); 
    	double area = Math.sqrt(valor);
    	return area; 
    }

}