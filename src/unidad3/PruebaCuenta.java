package unidad3;
//Ejercicio 3.15
import java.util.Scanner;

public class PruebaCuenta {

	public static void main(String[] args) {
		
		cuenta cuenta1 = new cuenta("Jane Green", 50.00);
    	cuenta cuenta2 = new cuenta("John Blue", -7.53);

        mostrarcuenta(cuenta1);
        mostrarcuenta(cuenta2);

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el monto a depositar para cuenta1: ");
        double montoDeposito = entrada.nextDouble();
        System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n", montoDeposito);
        cuenta1.depositar(montoDeposito);

        mostrarcuenta(cuenta1);
        mostrarcuenta(cuenta2);

        System.out.print("Escriba el monto a depositar para cuenta2: ");
        montoDeposito = entrada.nextDouble(); 
        System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n", montoDeposito);
        cuenta2.depositar(montoDeposito);

        mostrarcuenta(cuenta1);
        mostrarcuenta(cuenta2);
    }

    public static void mostrarcuenta(cuenta cuentaAMostrar) {
        System.out.printf("Saldo de %s: $%.2f%n", cuentaAMostrar.obtenerNombre(), cuentaAMostrar.obtenerSaldo());
    }

	}

