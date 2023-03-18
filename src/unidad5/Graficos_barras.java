package unidad5;

// Ejercicio_5.16
import java.util.Scanner;

public class Graficos_barras {
	
	public void Imprime()
	  {  
	  System.out.print("\nIntroduzca cinco enteros entre 1 y 30");
	  System.out.println(" y se imprimira un histograma horizontal.\n");  

	  Scanner entrada = new Scanner(System.in);

	  int numero;
	  int contador = 1;

	  while ( contador <= 5 )
	  {  
	  System.out.printf("\nPor favor introduzca el numero %d:\n ", contador);
	  numero = entrada.nextInt();

	  if ((1 <= numero) && ( 30 >= numero))
	  { 
	  for ( int i = 1; i <= numero; i++ )
	  System.out.print("*");

	  System.out.println();

	  contador++;
	  }  
	  }  
	  

	  }      
} 
