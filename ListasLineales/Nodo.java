package ListasLineales;

public class Nodo<T> {
	
    private T valor; // contiene el dato del nodo 
    private Nodo<T> siguiente; // referencia al siguiente nodo de la lista 

    public Nodo(T valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}