package arreglos;

import java.util.*;

// Leer x teclado 2 tablas de 10 numeros enteros y mezclarlas en una tercera
// deforma que: la 1° de A, el 1° de B, el 2° de A, el 2° de B, etc

public class Ejercicio_5 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int a[], b[], c[];
		
		a = new int [10];
		b = new int [10];
		c = new int [20];
		
		// Pedimos arreglo a
		System.out.println("\nDigite el primer arreglo: ");
		for (int i = 0; i < 10; i++) {
			System.out.print((i+1) +". Digite un numero: ");
			a[i] = teclado.nextInt();
			
		}
		
		// Pedimos arreglo b
		System.out.println("\nDigite el segundo arreglo: ");
		for (int i = 0; i < 10; i++) {
			System.out.print((i+1) +". Digite un numero: ");
			b[i] = teclado.nextInt();
			
		}
		
		// Mezclamos arreglos
		// utilizamos iterador i para a y b
		// y el iterador j para c
		
		int j = 0;
		
		for (int i = 0; i<10; i++) {
			
			c[j] = a[i];
			j++;
			c[j] = b[i];
			j++;
			
		}
		
		// Mostramos resultados por pantalla
		System.out.println("El tercer arreglo es: ");
		for (int i = 0; i < 20; i++) {
			
			System.out.print(c[i]+ "");
		}
	}
}
