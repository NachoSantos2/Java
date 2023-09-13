package ListasLineales;

import java.util.ArrayList;
// IMPORTAMOS LA LIBRERIA LINKEDLIST
import java.util.LinkedList;

public class LISTATOT<S>{
	
	// ATRIBUTO, LA LISTA 
	private LinkedList<S> listaTot;
	
	// CONSTRUCTOR CREA LA LISTA
	public LISTATOT() {
		
		listaTot = new LinkedList<>();
	}

	// Función para agregar un elemento al final de la lista
    public void agregarElemento(S elemento) {
        listaTot.add(elemento);
    }

    // Función para agregar un elemento en una posición específica
    public void agregarElementoEnPosicion(int posicion, S elemento) {
        listaTot.add(posicion, elemento);
    }
	
	// LOCALIZAR UN ELEMENTO
    public int localizarElemento(S elemento) {
        if (!listaTot.isEmpty()) {
            for (int i = 0; i < listaTot.size(); i++) {
                if (listaTot.get(i).equals(elemento)) {
                    return i; // Elemento encontrado, devuelve su índice
                }
            }
        }
        return -1; // Elemento no encontrado, devuelve -1
    }
    
    // ELIMINAR UN ELEMENTO DE LA LISTA
    public void eliminarElemento(S elemento) {
        if (!listaTot.isEmpty() && listaTot.contains(elemento)) {
            listaTot.remove(elemento);
        }
    }
    
    // ELIMINAR ELEMENTO DADA UNA POSICION DETERMINADA
    public void eliminarElementoEnPosicion(int posicion) {
        if (!listaTot.isEmpty() && posicion >= 0 && posicion < listaTot.size()) {
            listaTot.remove(posicion);
        }
    }
    
    // ORDENAR LOS ELEMENTOS
    public void ordenarElementos() {
    	
    	listaTot.sort(null);
    	
    }
    
    // COPIAR LA LISTA
    public LinkedList<S> copiar() {
    	
        LinkedList<S> copia = new LinkedList<>(listaTot);
        // Ahora 'copia' es una copia independiente de 'listaTot'
		return copia;
    }
    
    // SI LA LISTA ESTA VACIA
    public boolean esVacia() {
    	
    	return listaTot.isEmpty();
    }
    
    // METODO PARA MOSTRAR LA LISTA 
    public void mostrarLista() {
    	if(!listaTot.isEmpty()) {
    		for(int i = 0; i < listaTot.size(); i++) {
        		S elemento = listaTot.get(i);
        		System.out.println(elemento);
        	}
    	}
    	
    }
    
    // falta el de unir listas y dividir en sublistas
    
    public LinkedList<S> unir(LISTATOT<S>listaNueva) {
    	
    	LinkedList <S> resultado = new LinkedList<>(listaTot);
    	
    	for(S listaE : listaNueva.listaTot) {
    		
    		 if (!resultado.contains(listaE)) { // si el elemento no esta en la lista final se lo agrega
                 resultado.add(listaE);
             }
    	}
    	
    	return resultado;
    	
    }
    
}