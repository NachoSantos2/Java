package Ejercicio_8;

public class Ganado extends Transporte{
	
	// ATRIBUTOS
	private int cantidadCabezas;
	private double peso;
	
	// COSTRUCTOR DEL GANADO
	public Ganado(int patente, String descripcion, String localidadSalida, String localidadLlegada, int cantidadCabezas,
			double peso) {
		super(patente, descripcion, localidadSalida, localidadLlegada);
		this.cantidadCabezas = cantidadCabezas;
		this.peso = peso;
	}

	public int getCantidadCabezas() {
		return cantidadCabezas;
	}

	public void setCantidadCabezas(int cantidadCabezas) {
		this.cantidadCabezas = cantidadCabezas;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void pesoPromedioXCabeza() {
		
		double pesoPromedio;
		
		pesoPromedio = peso/ cantidadCabezas;
	}

	@Override
	public double costoTransporte() {
		
		return precioTransporte(peso);
	}
	
	
	
}
