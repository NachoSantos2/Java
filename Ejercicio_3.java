package arreglos;

import java.util.*;

public class Ejercicio_3 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int [] numeros = new int [5];
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print((i+1)+ ". Digite un numero: ");
			numeros[i] = teclado.nextInt();
			
		}
		
		// Realizar media de los numeros positivos, negativod y contar numero de ceros
		
		
		float suma_positivos = 0, suma_negativos = 0, conteo_Positivos = 0, conteo_Negativos = 0;
		float mediaPositivos = 0,contadorCeros = 0,mediaNegativos = 0;
		
		for(int i = 0; i<numeros.length; i++) {
			
			if (numeros[i] > 0) {
				
				suma_positivos += numeros[i];
				conteo_Positivos++; 
				
			}else if(numeros[i] == 0) {
				
				contadorCeros += 1;
				
			}else {
				suma_negativos += numeros[i];
				conteo_Negativos++;
			}
		}
		// media de los numeros
		
		mediaPositivos = suma_positivos / conteo_Positivos;
		mediaNegativos = suma_negativos / conteo_Negativos;
		
		System.out.println("La media de positivos es: "+ mediaPositivos);
		System.out.println("La media de negativos es: "+ mediaNegativos);
		System.out.println("Los ceros son: "+ contadorCeros);
	}

}
