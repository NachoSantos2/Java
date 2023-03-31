package arreglos;

// Leer 5 numeros, guardarlos en un arreclo y mostrarlos en el orden inverso al introducido

import java.util.*;

public class Ejercicio_2 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int [] numeros = new int [5];
		
		for (int i=0; i<numeros.length; i++) {
			
			System.out.print((i+1) +". Digite un numero: ");
			numeros[i] = teclado.nextInt();
			
		}
		
		for (int i=4; i>=0; i--) {
			
			System.out.println("Los numeros invertidos son: " + (i+1));
		}
		
		// otra forma
		
		for (int i = numeros.length -1; i >= 0; i--) {
			
			System.out.println(numeros[i]);
		}
	}
}
