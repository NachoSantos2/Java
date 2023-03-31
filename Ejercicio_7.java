package arreglos;

// Leer x teclado una serie de 10 numeros enteros. la aplicacion debe indicarnos si los numeros estan ordenados
// de forma creciente, decreciente, o si estan desordenados

import java.util.*;

public class Ejercicio_7 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int arreglo[] = new int [10]; // Creamos el arreglo de 10 elementos
		
		boolean creciente = false, decreciente = false;
		
		System.out.println("Llene el arreglo");
		
		for (int i = 0; i < arreglo.length; i++) {
			
			System.out.print((i+1) +". Digite el numero: ");
			
			arreglo[i] = teclado.nextInt();
			
		}
		
		for (int i = 0; i < 9; i++) {
			
			if (arreglo[i] < arreglo[i+1]) {
				
				creciente = true;
			}
			if (arreglo[i] > arreglo[i+1]) {
				
				decreciente = true;
			}
		}
		
		if (creciente == true && decreciente == false) {
			
			System.out.println("El arreglo esta en forma creciente");
		}
		else if (creciente == false && decreciente == true) {
			
			System.out.println("El arreglo esta de forma decreciente");
		}
		else if (creciente == true && decreciente == true) {
			
			System.out.println("El arreglo esta desordenado");
		}
		else if (creciente == false && decreciente == false) {
			
			System.out.println("El arreglo es igual");
		}
	}

}
