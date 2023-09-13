package ListasLineales;

public class LISTANOD<T> {

	private Nodo<T> cabeza;
	
	// CONSTRUCTOR INICIALIZA LA CABEZA EN 0
	public LISTANOD() {
		
		cabeza = null;
	}
	
	// METODO PARA LOCALIZAR UN ELEMENTO
	public boolean localizarElemento(T valor) {
		
		Nodo<T> actual = cabeza;
		while(actual != null) {
			if(actual.getValor().equals(actual)) {
				return true; // Elemento encontrado
			}
			
			actual = actual.getSiguiente();
		}
		return false; // Elemento no encontrado
	}
	
	// Método para agregar un elemento al principio de la lista
    public void agregarAlPrincipio(T valor) {
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        nuevoNodo.setSiguiente(cabeza);
        cabeza = nuevoNodo;
    }
    
	// METODO PARA INSERTAR UN ELEMENTO
	public void insertarElemento(T valor, int posicion) {
		if (posicion < 0) {
            System.out.println("Posición inválida.");
            return;
        }

        Nodo<T> nuevoNodo = new Nodo<>(valor);

        if (posicion == 0) {
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
            return;
        }

        Nodo<T> actual = cabeza;
        int contador = 0;

        while (actual != null && contador < posicion - 1) {
            actual = actual.getSiguiente();
            contador++;
        }

        if (actual != null) {
            nuevoNodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevoNodo);
        } else {
            System.out.println("Posición fuera de rango.");
        }
		
	}
	
	// Método para eliminar un elemento
    public void eliminarElemento(T valor) {
        if (cabeza == null) {
            return; // La lista está vacía
        }

        if (cabeza.getValor().equals(valor)) {
            cabeza = cabeza.getSiguiente();
            return;
        }

        Nodo<T> actual = cabeza;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getValor().equals(valor)) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                return;
            }
            actual = actual.getSiguiente();
        }
    }
    
    // Método para mostrar los elementos de la lista
    public void mostrar() {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getValor()+"-");
            actual = actual.getSiguiente();
        }
    }
	
 // Método para copiar la lista
    public LISTANOD<T> copiar() {
        LISTANOD<T> copia = new LISTANOD<>();
        Nodo<T> actual = cabeza;
        while (actual != null) {
            copia.agregarAlPrincipio(actual.getValor());
            actual = actual.getSiguiente();
        }
        return copia;
    }

    // Método para verificar si la lista está vacía
    public boolean listaVacia() {
        return cabeza == null;
    }
	
}