package TP2;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		// CREACION DE CONJUNTOS
        Conjunto conjunto1 = new Conjunto();
        // AGREGAMOS ELEMENTOS CON METODO AGREGAR ELEMENTOS
        conjunto1.agregarElementos(5);
        conjunto1.agregarElementos(3);

        Conjunto conjunto2 = new Conjunto();
        conjunto2.agregarElementos(5);
        conjunto2.agregarElementos(8);

        Conjunto conjunto3 = new Conjunto(); // vacio
      
        // LLAMAMOS AL METODO CONJUNTO VACIO, VEMOS SI ESTA VACIO
        conjunto3.conjuntoVacio();
        conjunto1.conjuntoVacio();
        
        // METODO PARA PROBAR SI PERTENECE
        conjunto1.perteneceElemento(2);
        conjunto1.perteneceElemento(5);
        
        Conjunto conjunto4 = new Conjunto(); // para eliminar elementos
        conjunto4.agregarElementos(4);
        conjunto4.agregarElementos(1);
        // ELIMINACION DE ELEMENTOS
        conjunto4.eliminarElemento(10);
        conjunto4.eliminarElemento(1);
        
        // UNION DE LOS ELEMENTOS DE LOS CONJUNTOS
        ArrayList<Integer> union = conjunto1.union(conjunto2);
        System.out.println("Unión de conjuntos: " + union);
        
        // INTERSECCION DE LOS CONJUNTOS
        ArrayList<Integer> interseccion = conjunto1.interseccion(conjunto2);
        System.out.println("Interseccion de conjuntos: " + interseccion);
        
        // INCLUSION DE CONJUNTOS
        boolean inclusion = conjunto1.inclusion(conjunto2);
        if(inclusion) {
        	System.out.println("El conjunto esta incluido en el otro conjunto");
        }
        else {
        	System.out.println("El conjunto no incluye al otro conjunto");
        }
        
        // hacer caso donde se incluyan dos conjuntos
    }
}
