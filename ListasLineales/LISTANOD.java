package ListasLineales;

import java.util.List;
import java.util.ArrayList;

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
    
 // Método para ordenar los elementos en la lista de nodos
    public void ordenarElementos() {
        if (cabeza == null || cabeza.getSiguiente() == null) {
            return; // La lista está vacía o tiene un solo elemento, no es necesario ordenar
        }

        Nodo<T> actual = cabeza;
        Nodo<T> siguiente = actual.getSiguiente();
        Nodo<T> temp;

        while (actual != null) {
            siguiente = actual.getSiguiente();
            while (siguiente != null) {
                // Compara los elementos y, si es necesario, intercámbialos
                if (((Comparable<T>) actual.getValor()).compareTo(siguiente.getValor()) > 0) {
                    temp = actual;
                    actual = siguiente;
                    siguiente = temp;
                }
                siguiente = siguiente.getSiguiente();
            }
            actual = actual.getSiguiente();
        }

        // Actualiza la cabeza de la lista
        cabeza = cabeza.getSiguiente();
    }
    
    // Método para mostrar los elementos de la lista
    public void mostrar() {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getValor());
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
    
 // Método para unir varias listas de nodos en una sola lista
    public LISTANOD<T> unirListas(List<LISTANOD<T>> listas) {
        LISTANOD<T> listaUnida = new LISTANOD<>();

        for (LISTANOD<T> lista : listas) {
            Nodo<T> actual = lista.cabeza;
            
            // Recorre la lista actual y agrega cada elemento a la lista unida
            while (actual != null) {
                listaUnida.agregarAlPrincipio(actual.getValor());
                actual = actual.getSiguiente();
            }
        }

        return listaUnida;
    }
	
 // Método para dividir la lista en sublistas
    public List<LISTANOD<T>> dividirEnSublistas(int numeroSublistas) {
        if (numeroSublistas <= 0) {
            throw new IllegalArgumentException("El número de sublistas debe ser mayor que cero.");
        }

        List<LISTANOD<T>> sublistas = new ArrayList<>();
        
        // Crear las sublistas vacías
        for (int i = 0; i < numeroSublistas; i++) {
            sublistas.add(new LISTANOD<T>());
        }

        Nodo<T> actual = cabeza;
        int sublistaActual = 0;

        while (actual != null) {
            // Agregar el nodo actual a la sublista correspondiente
            sublistas.get(sublistaActual).agregarAlPrincipio(actual.getValor());

            // Mover al siguiente nodo y cambiar de sublista si es necesario
            actual = actual.getSiguiente();
            sublistaActual = (sublistaActual + 1) % numeroSublistas;
        }

        return sublistas;
    }
}
