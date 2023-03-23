package unidad7;
//Ejercicio_7.17
import java.util.Random;

public class Tiro_dados {
	
	   public static void main(String[] args) {
	        int[] resultados = new int[11];

	        Random rand = new Random();

	        for (int i = 0; i < 36000000; i++) {
	            int dado1 = rand.nextInt(6) + 1;
	            int dado2 = rand.nextInt(6) + 1;
	            int suma = dado1 + dado2 - 2;

	            resultados[suma]++;
	        }

	        System.out.println("|Suma\tFrecuencia\tProbabilidad");
	        System.out.println("--+----------------------------------");
	        for (int i = 0; i < resultados.length; i++) {
	            double probabilidad = (double) resultados[i] / 36000000;
	            System.out.printf("%d\t%d\t\t%.5f\n", i + 2, resultados[i], probabilidad);
	        }
	    }
}
