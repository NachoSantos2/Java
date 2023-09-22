package ListasLineales;

//IMPORTAMOS LA LIBRERIA LINKEDLIST
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
	 
	// Unir dos listas
		 public void unirListas(LinkedList<S> otraLista) {
		     listaTot.addAll(otraLista); // agregar todos los elementos de otraLista a la lista listaTot
		 }
		 
		 
	 // Dividir una lista en sublistas
	 public LinkedList<LinkedList<S>> dividirEnSublistas(int tamañoSublista) {
		    // Crear una lista de listas para almacenar las sublistas
		    LinkedList<LinkedList<S>> sublistas = new LinkedList<>();
		    
		    // Obtener el número total de elementos en la lista original
		    int totalElementos = listaTot.size();
		    
		    // Iterar a través de la lista original y dividirla en sublistas
		    for (int i = 0; i < totalElementos; i += tamañoSublista) {
		        // Calcular el índice de inicio de la sublista
		        int desdeIndice = i;
		        
		        // Calcular el índice de fin de la sublista (limitado por el tamaño de la lista original)
		        int hastaIndice = Math.min(i + tamañoSublista, totalElementos);
		        
		        // Crear una nueva sublista utilizando el método subList de la lista original
		        // Esto extraerá un rango de elementos desde "desdeIndice" hasta "hastaIndice"
		        LinkedList<S> sublista = new LinkedList<>(listaTot.subList(desdeIndice, hastaIndice));
		        
		        // Agregar la sublista recién creada a la lista de sublistas
		        sublistas.add(sublista);
		    }
		    
		    // Devolver la lista de sublistas
		    return sublistas;
		}
}