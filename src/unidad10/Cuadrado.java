package unidad10;

public class Cuadrado extends Figuras{
	
    private double lado;

    public void Cuadrado(double lado) {
        this.lado = lado;
    }

    public double obtenerLado() {
        return lado;
    }

    public void establecerLado(double lado) {
        this.lado = lado;
    }

    public double obtenerArea() {
        return lado * lado;
    }

    public String obtenerDescripcion() {
        return String.format("Cuadrado de lado %.2f", lado);
    }

}
