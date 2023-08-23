package TP2;

import java.util.ArrayList;

public class Conjunto {

	// CREACION DE ARRAYLIST
	private ArrayList<Integer> elementos;
	
	// CONSTRUCTOR
	public Conjunto() {
		
		elementos = new ArrayList<>();
	}
	
	// VERIFICAR SI EL CONJUNTO ESTA VACIO
	public void conjuntoVacio() {
		
		if(elementos.isEmpty()) {
			System.out.println("El conjunto esta vacio!!");
		}
		else {
			System.out.println("El conjunto no esta vacio!!");
		}
	}
	
	// AÑADIR ELEMENTOS AL ARREGLO
	public void agregarElementos(int elemento) {
		
		if(!elementos.contains(elemento)) {
			elementos.add(elemento);
		}
	}
	
	// SI UN ELEMENTO PERTENECE
	public void perteneceElemento(int elemento) {
		
		if(elementos.contains(elemento)) {
			System.out.println("El elemento " + elemento + " esta en el arreglo");
		}
		else {
			System.out.println("El elemento " + elemento + " no esta en el arreglo");
		}
	}
	
	// RETIRAR UN ELEMENTO DEL ARREGLO
	public void eliminarElemento(int elemento) {
		
		if(elementos.contains(elemento)) {
			elementos.remove(elemento);
			System.out.println("Elemento eliminado con exito");
		}
		else {
			System.out.println("El elemento no esta en el arreglo");
		}
	}
	
	// METODO PARA UNIR 2 CONJUNTOS A UNO SIN DUPLICADOS
	public ArrayList<Integer> union(Conjunto otroConjunto) {
        ArrayList<Integer> resultado = new ArrayList<>(elementos); // crea arrayList, y lo inicializa con los elementos del conjunto actual(´elementos´)
        for (int elemento : otroConjunto.elementos) { // recorre la nueva lista comparandola con la original para q no haya duplicados
            if (!resultado.contains(elemento)) { // si el elemento no esta en la lista final se lo agrega
                resultado.add(elemento);
            }
        }
        return resultado; // devuelve el arraylist
    }
	
	// INTERSECCION, ARRAY DEVUELVE ELEMENTOS COMUNES ENTRE LOS CONJUNTOS
	public ArrayList<Integer> interseccion(Conjunto conjunto2){
		
		ArrayList<Integer> inter = new ArrayList<>();
		for(int elemento : elementos) {
			if(conjunto2.elementos.contains(elemento)) {
				inter.add(elemento);
				
			}
		}
		return inter;
		
	}
	
	// INCLUSION DEVUELVE TRUE SI CONJ1 ESTA CONTENIDO EN EL CONJ2
	public boolean inclusion(Conjunto conj2) {
		
		if(elementos.size() > conj2.elementos.size()) { // verifica que los elementos del conjunto original
			return false;									// no sea mayor que la cantidad en el conj2
		}
		
		for(int i = 0; i < elementos.size(); i++) { // verifica si los elemementos del conjunto actual estan
														// presentes en el conj2
			int elemento = elementos.get(i);
			if(!conj2.elementos.contains(elemento)) {
				
				return false;
			}
		}
		return true; // si no se encontraron elementos que falten, el conj actual esta incluido en el conj2
	}
	
}
