package unidad3;
//Ejercicio 3.15
public class cuenta {
	
	 private String Nombre;
	 private double saldo;
	 
	 public cuenta(String Nombre, double saldo) {
	 this.Nombre = Nombre;

	 if (saldo > 0.0)
	 this.saldo = saldo;
	 }
	
	 public void depositar(double montoDeposito)
	 {
	 if (montoDeposito > 0.0)
	 saldo = saldo + montoDeposito; 
	 }
	
	 public double obtenerSaldo()
	 {
	 return saldo;
	 }
	
	 public void establecerNombre(String nombre)
	 {
	 this.Nombre = nombre;
	 }
	 public String obtenerNombre() {
		 return Nombre;
		 }
}

