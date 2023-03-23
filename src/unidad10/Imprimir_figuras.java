package unidad10;

import unidad10.Figuras.Figura;
import unidad10.Figuras.FiguraBidimensional;
import unidad10.Figuras.FiguraTridimensional;

public class Imprimir_figuras {
	
	public class Main {
	    public static void main(String[] args) {

	        Figura[] figuras = new Figura[4];

	        Circulo circulo = new Circulo();
	        circulo.establecerRadio(5);

	        Cuadrado cuadrado = new Cuadrado();
	        cuadrado.establecerLado(4);

	        Cubo cubo = new Cubo();
	        cubo.establecerLado(3);

	        Esfera esfera = new Esfera();
	        esfera.establecerRadio(2);

	        figuras[0] = circulo;
	        figuras[1] = cuadrado;
	        figuras[2] = cubo;
	        figuras[3] = esfera;

	        for (Figura figura : figuras) {
	            System.out.println(figura.obtenerDescripcion());

	            if (figura instanceof FiguraBidimensional) {
	                FiguraBidimensional figuraBidimensional = (FiguraBidimensional) figura;
	                System.out.println("Área: " + figuraBidimensional.obtenerArea());
	            }

	            if (figura instanceof FiguraTridimensional) {
	                FiguraTridimensional figuraTridimensional = (FiguraTridimensional) figura;
	                System.out.println("Área superficial: " + figuraTridimensional.obtenerAreaSuperficial());
	                System.out.println("Volumen: " + figuraTridimensional.obtenerVolumen());
	            }

	            System.out.println();
	        }
	    }
	}
	}
