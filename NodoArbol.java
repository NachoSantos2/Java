package Arboles;

public class NodoArbol {
	
	int dato;
	String nombre;
	NodoArbol hijoIzquierdo, hijoDerecho;
	
	public NodoArbol(int dato, String nombre) {
		super();
		this.dato = dato;
		this.nombre = nombre;
		this.hijoIzquierdo = null;
		this.hijoDerecho = null;
	}
	@Override
	public String toString() {
		return nombre + "El dato es: " + dato;
	}

}
