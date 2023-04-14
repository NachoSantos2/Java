package Ejercicio_5_Discos;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
	}
	
	// Metodo para elegir Dvd o Cd
	public char elegirOpcion1(Scanner teclado) {

		char opcionDC;
		System.out.println("Desea visualizar un DVD o un CD?");
		System.out.print("Ingrese ---d--- para DVD y ---c--- para CD: ");
		opcionDC = teclado.next().charAt(0);
		
		while (opcionDC != 'd' && opcionDC != 'c') {
			
			System.out.println("Ingrese una opcion: ");
			System.out.print("---d--- para DVD y ---c--- para CD: ");
			opcionDC = teclado.next().charAt(0);
		}
		
		return opcionDC;
	}

}
