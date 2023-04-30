package Ejercicio_8;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Transporte vehiculo1 = new Alimentos(4567565, "paquete de cereales", "Palermo", "Belgrano", "Cereales", 5, 10);
		
		ArrayList<Transporte> listaAlimentos= new ArrayList <Transporte>();
		
		listaAlimentos.add(vehiculo1);
		
		for (int i=0; i<listaAlimentos.size();i++) {
			
			System.out.println(listaAlimentos.get(i));
		}
		
		System.out.println("El precio del transporte es: " + vehiculo1.costoTransporte());
		
		System.out.println("");
		
		Transporte vehiculo2 = new Bultos(345389, "paquetes de yerba", "Puerto Madero", "China", 1000, 6000);
		
		System.out.println(vehiculo2);
		
		System.out.println("El precio del transporte es: " + vehiculo2.costoTransporte());
		
		
	}
}
