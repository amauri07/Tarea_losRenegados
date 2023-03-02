package unidad4;

import java.util.Scanner;
    //Ejercicio 4.20
public class Sueldo {
	
	
Scanner input = new Scanner(System.in);
	
	int horasBase = 40;
	
	private double pesosXHora;
	private int horasTrabajadas;

	public double obtenerPesosXHora() {
		return pesosXHora;
	}

	public void establecerPesosXHora(double pesosXHora) {
		if(pesosXHora >= 0){
			this.pesosXHora = pesosXHora;
		}
		else{
			this.recurPesosXHora();
		}
	}
	
	public int obtenerHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void establecerHorasTrabajadas(int horasTrabajadas) {
		if(horasTrabajadas >= 0 && horasTrabajadas <= 168){ 
			this.horasTrabajadas = horasTrabajadas;
		}
		else{
			this.recurHorasTrabajadas();
		}
	}

	public void datosSalario(){
		
		System.out.print("Cuantas horas trabajo el empleado: ");
		int horas = input.nextInt();
		this.establecerHorasTrabajadas(horas);
		
		System.out.print("Ingrese la cuota normal por hora trabajada del empleado: ");
		double cuota = input.nextDouble();
		this.establecerPesosXHora(cuota);
		
	}
	
	public void calculoSalario(){
		
		if(this.obtenerHorasTrabajadas() <= 40){
			System.out.printf("---->El salario bruto del trabajador es: $%.2f", 
this.obtenerHorasTrabajadas()*this.obtenerPesosXHora());
			System.out.println();
		}
		else{
			System.out.printf("---->El salario bruto del trabajador es: $%.2f",
	(this.obtenerHorasTrabajadas()-horasBase)*(this.obtenerPesosXHora()*1.5) + (horasBase*this.obtenerPesosXHora()));
			System.out.println();
		}
		
	}
	
	public void recurHorasTrabajadas(){
		
		System.out.println("\n***VALOR ERRONEO, VUELVA A INGRESAR EL VALOR***");
		System.out.print("\nCuantas horas trabajo el empleado: ");
		int horas = input.nextInt();
		this.establecerHorasTrabajadas(horas);
		
	}
	
	public void recurPesosXHora(){
		
		System.out.println("\n***VALOR ERRONEO, VUELVA A INGRESAR EL VALOR***");
		System.out.print("\nIngrese la cuota normal por hora trabajada del empleado: ");
		double cuota = input.nextInt();
		this.establecerPesosXHora(cuota);
		
	}
}
