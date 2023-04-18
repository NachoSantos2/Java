package Ejercicio_8;

public abstract class Transporte {
	
	// ATRIBUTOS DEL TRANSPORTE
	protected int patente;
	protected String descripcion;
	protected String localidadSalida;
	protected String localidadLlegada;
	
	// CONSTRUCTOR DE LA SUPER
	public Transporte(int patente, String descripcion, String localidadSalida, String localidadLlegada) {
		super();
		this.patente = patente;
		this.descripcion = descripcion;
		this.localidadSalida = localidadSalida;
		this.localidadLlegada = localidadLlegada;
	}
	
	// GETTERS Y SETTERS
	public int getPatente() {
		return patente;
	}

	public void setPatente(int patente) {
		this.patente = patente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getLocalidadSalida() {
		return localidadSalida;
	}

	public void setLocalidadSalida(String localidadSalida) {
		this.localidadSalida = localidadSalida;
	}

	public String getLocalidadLlegada() {
		return localidadLlegada;
	}

	public void setLocalidadLlegada(String localidadLlegada) {
		this.localidadLlegada = localidadLlegada;
	}
	
	// METODO TOSTRING
	@Override
	public String toString() {
		return "Patente = " + patente + "\ndescripcion = " + descripcion + "\nLocalidad de Salida = "
				+ localidadSalida + "\nLocalidad de Llegada = " + localidadLlegada;
	}
	
	// METODO ABSTRACTO QUE TENDRA EL COSTO DEL TRANSPORTE SEGUN LA CARGA A TRANSPORTAR
	public abstract double costoTransporte();
	
	// METODO QUE DEVUELVE EL PRECIO DEL TRANPORTE
	public double precioTransporte(double peso) {
		
		double precio = 0;
		
		if (peso > 0 && peso <= 1200) {
			
			precio = 6.00 * peso;
			
		}
		else if(peso > 1200 && peso <= 2400) {
			
			precio = 5.50 * peso;
			
		}
		else if (peso > 2400 && peso <= 4000) {
			
			precio = 4.30 * peso;
			
		}
		else if (peso > 4000) {
			
			precio = 3.60 * peso;
		}
		
		return precio;
	}
	
	
}
