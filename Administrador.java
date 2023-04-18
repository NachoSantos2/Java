package polimorfismo;

public class Administrador extends Universidad{

	private double sueldoFijo;

	public Administrador(String nombre, int dni, int edad, double sueldoFijo) {
		super(nombre, dni, edad);
		this.sueldoFijo = sueldoFijo;
	}

	public double getSueldoFijo() {
		return sueldoFijo;
	}

	public void setSueldoFijo(double sueldoFijo) {
		this.sueldoFijo = sueldoFijo;
	}
	
	public String toString() {
		
		return nombre + ", Sueldo: " +pago();
	}

	@Override
	public double pago() {
		
		return sueldoFijo;
	}
	
}
