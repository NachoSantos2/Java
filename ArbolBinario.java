package Arboles;

public class ArbolBinario {

	NodoArbol raiz;
	
	public ArbolBinario() {
		raiz = null;
	}
	
	//Metodo para agregar un nodo
	public void agregarNodo(int dato, String nombre) {
		NodoArbol nuevo = new NodoArbol (dato, nombre);
		if (raiz == null) {
			raiz = nuevo;
		}else {
			NodoArbol auxiliar = raiz;
			NodoArbol padre;
			while(true) {
				padre = auxiliar;
				if(dato<auxiliar.dato) {
					auxiliar = auxiliar.hijoIzquierdo;
					if (auxiliar == null) {
						padre.hijoIzquierdo = nuevo;
						return;
					}
				}else {
					auxiliar = auxiliar.hijoDerecho;
					if (auxiliar == null) {
						padre.hijoDerecho = nuevo;
						return;
					}
				}
			}
		}
	}
	
}
