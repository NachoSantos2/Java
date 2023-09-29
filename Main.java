package Arboles;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int opcion = 0, dato;
		Scanner sc = new Scanner(System.in);
		String nombre;
		ArbolBinario arbol = new ArbolBinario();
		do {
			System.out.println("Menu:");
			System.out.println("1. Agregar nodo");
			System.out.println("2. Salir");
			System.out.print("Ingrese opcion: ");
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Ingrese nombre del nuevo nodo: ");
				nombre = sc.nextLine();
				sc.nextLine();
				System.out.println("Ingrese un dato de tipo entero para almacenar en el nodo: ");
				dato = sc.nextInt();
				arbol.agregarNodo(dato, nombre);
				System.out.println("Nodo agregado con exito");
				break;
			
			case 2:
				System.out.println("Saliendo del programa");
			}
		}while(opcion!=2);
	}

}
