package Ejercicio_8;

import java.util.*;

public class Alimentos extends Transporte{
	
	// ATRIBUTOS DE LOS ALIMENTOS
	private String tipo;
	private int cantidad;
	private double peso;
	
	private ArrayList<Transporte> tipos;
	
	
	// CONSTRUCTOR DE LOS ALIMENTOS
	public Alimentos(int patente, String descripcion, String localidadSalida, String localidadLlegada, String tipo,
			int cantidad, double peso) {
		super(patente, descripcion, localidadSalida, localidadLlegada);
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.peso = peso;
		this.tipos = new ArrayList<Transporte>();
	}
	
	/*
	 * public Alimentos() {
		
		this.tipos = new ArrayList<Transporte>();
	}
	 */
	

	// GETTERS Y SETTERS
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
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
	
	// METODO TOSTRING
	@Override
	public String toString() {
		return "Tipo = " + tipo + "\ndescripcion = " + descripcion + "\nLocalidad de Salida = "
				+ localidadSalida + "\nLocalidad de Llegada = " + localidadLlegada + "\nCantidad: "+ cantidad;
	}
	
	// METODO PARA METER LOS TIPOS DE ALIMENTOS EN EL ARRAYLIST 
	public void agregarTipo(Transporte tipo) {
		this.tipos.add(tipo); //Asi creo y añado parametros a un nuevo dvd 
	}

	@Override
	public double costoTransporte() {
		
		return precioTransporte(peso);
	}
	
	
	
}
