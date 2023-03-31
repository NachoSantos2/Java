
// Leer 5 numero, guardarlos en un arreglo y mostrarlos en el mismo orden introducido

package arreglos;

import java.util.*;

public class Ejercicio_1 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int[] numeros = new int [5];
		
		for(int i = 0; i < numeros.length; i++) {
			
			System.out.print((i+1) +". Ingrese un numero: ");
			numeros[i] = teclado.nextInt();
			
		}
		
		for(int i:numeros) {
			
			System.out.println("Los numeros son: " + i);
		}
	}

}
