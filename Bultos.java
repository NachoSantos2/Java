package Ejercicio_8;

public class Bultos extends Transporte{
	
	// ATRIBUTOS DE LOS BULTOS
	private int cantidad;
	private double peso;
	
	
	// CONSTRUCTOR DE LOS BULTOS
	public Bultos(int patente, String descripcion, String localidadSalida, String localidadLlegada, int cantidad,
			double peso) {
		super(patente, descripcion, localidadSalida, localidadLlegada);
		this.cantidad = cantidad;
		this.peso = peso;
	}
	
	// GETTERS Y SETTERS
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	

	@Override
	public String toString() {
		return "Cantidad = " + cantidad + "\nPeso = " + peso + "\nCosto del Transporte = " + costoTransporte();
	}

	// METODO QUE CALCULA EL TAMANIO DEL BULTO
	public void tamanio() {
		
		if(peso > 0 && peso <= 20) {
			
			System.out.println("Bulto MINI");
		}
		else if (peso > 21 && peso <= 100) {
			
			System.out.println("Bulto MID");
		}
		else if (peso > 101 && peso <= 150) {
			
			System.out.println("Bulto MAX");
		}
	}

	@Override
	public double costoTransporte() {
		
		return precioTransporte(peso);
	}
	
	
	
}
