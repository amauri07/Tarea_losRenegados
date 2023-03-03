package figuras_geometricas;

public class PruebaDeFigurasGeometricas {

	public static void main(String[] args) {
		Circulo circulo1 = new Circulo(4);
		Rectángulo rectangulo1 = new Rectángulo(6, 4);
		Triángulo triangulo1 = new Triángulo(1, 2, 1);
		
        System.out.println("El perimetro del circulo es: "+circulo1.getPerimetro());
        System.out.println("El Area del circulo es: "+circulo1.getArea()+"\n");
        
        System.out.println("El perimetro del rectangulo es: "+rectangulo1.getPerimetro());
        System.out.println("El Area del rectangulo es: "+rectangulo1.getArea());
        System.out.println("¿Es un cuadrado? "+rectangulo1.isCuadrado()+"\n");

        System.out.println("El perimetro del triangulo es: "+triangulo1.getPerimetro());
        System.out.println("El Area del triangulo es: "+triangulo1.getArea());
        System.out.println("El tipo de triangulo es: "+triangulo1.getTipo());
	}

		
	}
