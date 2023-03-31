
package arreglos;

import java.util.*;
// Leer 10 numeros mostrarlos en orden del 1ero, ultimo, 2do, penultimo, tercero.
public class Ejercicio_4 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int [] numeros = new int [10];
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println((i+1) +". Digite un numero: ");
			numeros[i] = teclado.nextInt();
			
		}
		
		// Mostrarlo en ese orden
		
		int p = 0; // primero
		int q = 9; //
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println(numeros[p]);
			System.out.println(numeros[q]);
			
			p +=1;//suma la siguiente posición respecto del primero

			q -=1;//resta una posición respecto del último
			
		}
		
	}

}
