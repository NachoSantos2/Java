package arreglos;

// Leer 5 elementos numericos que se introduciran ordenados de forma creciente
// Los guardaremos en una tabla de tamaño 10. Leer un mumero N, e insertarlo en el 
// lugar adecuado

import java.util.*;

public class Ejercicio_11 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int arreglo [] = new int [10];
		
		//Numero que le pediremos para insertar
		int numero, sitio_num = 0, j = 0;
		// para det si estan ordenados usamos variable booleana
		boolean creciente = true;
		
		// Para determinar si esta ordenado o no, usamos un do While.
		
		do {
			// Llenando el arreglo
			for( int i = 0; i < 5; i++) { // 5 xq es la cantidad que se introducira en un principio
				
				System.out.print((i+1) + ". Digite un numero: ");
				arreglo[i] = teclado.nextInt();	
			}
			
			// Comprobar si esta ordenado de forma creciente
			for(int i = 0; i < 4; i++) {
				if (arreglo[i] < arreglo[i+1] ) // Creciente: 1-2-3
				{
					creciente = true;
				}
				
				if(arreglo[i] > arreglo[i+1]) // Decreciente: 3-2-1 
				{
					creciente = false;
				}
			}
			
			if(creciente == false) {
				System.out.println("\nEl arreglo no esta de forma creciente: ");
			}
			
		}while(creciente == false);
		
		System.out.print("Digite un elemento a insertar: ");
		numero = teclado.nextInt();
		
		while(arreglo[j] < numero && j<5) {
			sitio_num++;
			j++;
		}
		
		// Trasladamos una posicion en el arreglo a los elementos que van detras del numero
		for(int i=4; i>=sitio_num; i--) {
			
			arreglo[i+1] = arreglo[i];
		}
		
		// insertamos el numero que el usuario puso
		arreglo[sitio_num] = numero;
		
		// imprimimos todo
		System.out.println("El arreglo queda: ");
		for(int i=0; i<6;i++) {
			
			System.out.print(arreglo[i]+" - ");
			
		}
		System.out.println();
	}
}
