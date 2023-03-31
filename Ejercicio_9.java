package arreglos;

import java.util.*;

// Leer x teclado tabla de 10 numeros enteros y la desplace una posicion hacia abajo
// 1° pasa a ser el 2°, 2° pasa a ser el 3° etc.

public class Ejercicio_9 {
	 
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int arreglo [] = new int [10];
		
		for (int i=0; i<10; i++) {
			
			System.out.print((i+1)+ " .Ingrese un numero: ");
			arreglo[i] = teclado.nextInt();
			
		}
		
		int ultimo = arreglo[9]; // Guardamos el ultimo elemento del arreglo
		
		for (int i=8; i>=0; i--) { // Abanza una posicion abajo en el arreglo
			
			arreglo[i+1] = arreglo[i];
		}
		
		/*
		 * Otra forma de escribir lo de arriba
		 * 
		 * for (int i = 0; i < 9; i++) {
    		arreglo[i] = arreglo[i+1];
			}
		 */
		
		arreglo[0] = ultimo; // ponemos el ultimo elemento como el primero
		
		System.out.println("El nuevo arreglo es: ");
		
		for (int i=0; i<10; i++) {
			
			System.out.println(i+"Numero: "+ arreglo[i]);
		}
	}
}
