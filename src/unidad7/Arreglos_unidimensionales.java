package unidad7;
//Ejercicio_7.11
import java.util.Arrays;

public class Arreglos_unidimensionales {
	
		public static void main(String[] args) {
	  
	        int[] cuentas = new int[10];

	        for (int i = 0; i < cuentas.length; i++) {
	            cuentas[i] = 0;
	        }

	        Arrays.fill(cuentas, 0);

	        mostrarArreglo(cuentas, "cuentas");
	        System.out.println();


	        int[] bono = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

	        for (int i = 0; i < bono.length; i++) {
	            bono[i]++;
	        }

	        mostrarArreglo(bono, "bono");
	        System.out.println();

	        int[] mejoresPuntuaciones = {100, 90, 80, 70, 60};
	        System.out.println("MEJORES PUNTUACIONES");
	        System.out.printf("%d%11d%10d%10d%10d%n", 1, 2, 3, 4, 5);

	        Arrays.sort(mejoresPuntuaciones);
	        for (int puntuacion : mejoresPuntuaciones) {
	            System.out.printf("%d        ", puntuacion);
	        }
	    }

	    public static void mostrarArreglo(int[] arreglo, String nombreArreglo) {
	        System.out.printf("El arreglo %s tiene los siguientes elementos:%n", nombreArreglo);

	        for (int elemento : arreglo) {
	            System.out.printf("%d ", elemento);
	        }

	        System.out.println();
	    }
}
