package unidad4;

import java.util.Scanner;
    //Ejercicio 4.18
public class LimiteCrédito {
	

	private int cuenta;
	private double saldoInicioMes;
	private double cargos;
	private double creditos;
	private double limiteCredito;
	
	Scanner input = new Scanner(System.in);
	
	public int obtenerCuenta() {
		return cuenta;
	}
	public void establecerCuenta(int cuenta) {
		
			if(cuenta >= -1){
				this.cuenta = cuenta;
			}
			else{
				System.out.println("***NUMERO INVALIDO***\n");
				this.recursividadCuenta();
			}
			
	}
	
	public double obtenerSaldoInicioMes() {
		return saldoInicioMes;
	}
	public void establecerSaldoInicioMes(double saldoInicioMes) {
		this.saldoInicioMes = saldoInicioMes;
	}
	
	public double obtenerCargos() {
		return cargos;
	}
	public void establecerCargos(double cargos) {
		
		if(cargos >= 0){
			this.cargos = cargos;
		}
		else{
			this.recursividadCargos();
		}
		
	}
	
	public double obtenerCreditos() {
		return creditos;
	}
	public void establecerCreditos(double creditos) {
		
		if(creditos >= 0){
			this.creditos = creditos;
		}
		else{
			this.recursividadCreditos();
		}
		
	}
	
	public double obtenerLimiteCredito() {
		return limiteCredito;
	}
	public void establecerLimiteCredito(double limiteCredito) {
		
		if(limiteCredito >= 0){
			this.limiteCredito = limiteCredito;
		}
		else{
			this.recursividadMaxCred();
		}
		
	}
	
	public void Recibe(){
		
		int cuenta = 0;
		
		System.out.println("Ingrese numero de cuenta o -1 para terminar");
		System.out.print("----> ");
		cuenta = input.nextInt();
		this.establecerCuenta(cuenta);
			
		while(this.obtenerCuenta() != -1){
			
			System.out.printf("No. de cuenta: %d\n", this.obtenerCuenta());
			
			System.out.println("Ingrese el saldo al inicio del mes");
			System.out.print("----> $ ");
			double saldoInicioMes_ = input.nextDouble();
			this.establecerSaldoInicioMes(saldoInicioMes_);
			System.out.printf("Saldo inicial: $%.2f\n", this.obtenerSaldoInicioMes());
			
			System.out.println("Introduzca el valor total de los depositos hechos en el Mes por el cliente");
			System.out.print("----> $ ");
			double depositos_ = input.nextDouble();
			this.establecerCargos(depositos_);
			System.out.printf("Total de los depositos: $%.2f\n", this.obtenerCargos());
			
			System.out.println("Introduzca el valor total de los cargos hechos en el Mes al cliente");
			System.out.print("----> $ ");
			double creditos_ = input.nextDouble();
			this.establecerCreditos(creditos_);
			System.out.printf("Total de los cargos: $%.2f\n", this.obtenerCreditos());
			
			System.out.println("Ingrese el credito maximo de la cuenta");
			System.out.print("----> $ ");
			double maxCred = input.nextDouble();
			this.establecerLimiteCredito(maxCred);
			System.out.printf("Limite de credito: $%.2f\n", this.obtenerLimiteCredito());
			
			double nvoSaldo = Retorna(this.saldoInicioMes, this.cargos, this.creditos);
			System.out.printf("Nuevo saldo: $%.2f\n", nvoSaldo);
			
			if(nvoSaldo + this.obtenerLimiteCredito() < 0){
				System.out.println("***LIMITE DE CREDITO EXCEDIDO***");
			}
			
			System.out.println("\nIngrese numero de cuenta o -1 para terminar");
			System.out.print("----> ");
			cuenta = input.nextInt();
			this.establecerCuenta(cuenta);
			
		}
		
		System.out.println("PROGRAMA FINALIZADO");
		
	}
	
	public double Retorna(double saldoInicioMes, double cargos, double creditos){
		
		return saldoInicioMes + cargos - creditos;
		
	}
	
	public void recursividadCuenta(){
		
		System.out.println("Ingrese numero de cuenta o -1 para Finalizar");
		System.out.print("----> ");
		int cuenta_ = input.nextInt();
		this.establecerCuenta(cuenta_);
		
	}
	
	public void recursividadCargos(){
		
		System.out.println("Introduzca el valor total de los depositos hechos por el cliente");
		System.out.print("----> $ ");
		double depositos_ = input.nextDouble();
		this.establecerCargos(depositos_);
		
	}
	
	public void recursividadCreditos(){
		
		System.out.println("Introduzca el valor total de los cargos hechos en el Mes al cliente");
		System.out.print("----> $ ");
		double cargos_ = input.nextDouble();
		this.establecerCreditos(cargos_);
		
	}
	
	public void recursividadMaxCred(){
		
		System.out.println("Ingrese el credito maximo de la cuenta");
		System.out.print("----> $ ");
		double maxCred = input.nextDouble();
		this.establecerLimiteCredito(maxCred);
		
	}

}
