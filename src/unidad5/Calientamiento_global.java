package unidad5;
//Ejercicio_5.31
import java.util.Scanner;

public class Calientamiento_global {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);

 
        String[] preguntas = {
                "¿Que es el calentamiento global?",
                "¿Cual es la principal causa del calentamiento global?",
                "¿Cuales son algunos de los efectos del calentamiento global?",
                "¿Que se puede hacer para reducir el calentamiento global?",
                "¿Cual es la temperatura promedio que se espera que aumente en el siglo XXI debido al calentamiento global?"
        };
        System.out.println("***Respuestas: seleccione su respues usando los numero 1,2,3,4***");
        String[][] opciones = {
        		   
{"Aumento de la temperatura de la Tierra", "Aumento de la humedad de la Tierra", "Aumento de la presión atmosférica", "Aumento del oxígeno en la atmósfera"},
{"Emisiones de gases de efecto invernadero", "La actividad solar", "Los volcanes", "El viento solar"},
{"Derretimiento de los glaciares", "Aumento del nivel del mar", "Cambios en los patrones climáticos", "Todas las anteriores"},
 {"Usar mas energia renovable", "Conducir menos", "Comprar productos locales", "Todas las anteriores"},
{"1-2 °C", "3-4 °C", "5-6 °C", "7-8 °C"}
        };  
        int[] respuestasCorrectas = {1, 1, 4, 4, 2};
        
 
        int numPreguntas = preguntas.length;
        int numRespuestasPosibles = opciones[0].length;
        int respuestasCorrectasCount = 0;
        for (int i = 0; i < numPreguntas; i++) {
            System.out.println("Pregunta " + (i+1) + ": " + preguntas[i]);
            for (int j = 0; j < numRespuestasPosibles; j++) {
                System.out.println((j+1) + ". " + opciones[i][j]);
            }
            int respuesta = sc.nextInt();
            if (respuesta == respuestasCorrectas[i]) {
                respuestasCorrectasCount++;
            }
        }

        if (respuestasCorrectasCount == 5) {
            System.out.println("Excelente");
        } else if (respuestasCorrectasCount == 4) {
            System.out.println("Muy bien");
        } else {
System.out.println("Es tiempo de aprender mas sobre el calentamiento global");
System.out.println("Aquí hay algunos sitios web donde puede encontrar más información:");
 System.out.println("- https://www.nationalgeographic.com/especiales/calentamiento-global/");
System.out.println("https://www.manosunidas.org/observatorio/cambio-climatico/calentamiento-global");
        }
    }
}
