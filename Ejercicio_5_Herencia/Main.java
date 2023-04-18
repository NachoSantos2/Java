package Ejercicio_5_Herencia;

//Autor: Ignacio Santos

import java.util.*;

public class Main {
	public static void main(String[]args) {
		
		Scanner teclado= new Scanner(System.in);
		
		// Creamos el objeto dvd de la clase catalogo
		DVD dvds = new DVD();
		
		CD cd = new CD();
		
		String titulo, genero, director, comentario;
		int duracion;
		boolean tengo;
		char si_tenemos;
		
		String interprete;
		int temas;
		
		char op1;
		
		 op1 = elegirOpcion1(teclado);
		
		if (op1 == 'd') {
			
			int op = elegirOpcion(teclado);
			
			while(op != 11) {
				
				switch(op) {
				
					case 1: 
						
						dvds.agregarDisco();
						System.out.println("----------------------------------");
						
						break;
						
					case 2:
						System.out.print("Ingrese titulo a eliminar: ");
						titulo = teclado.nextLine();
						teclado.nextLine();
						
						dvds.eliminarDiscos(titulo);
						/*
						 * if(dvds.eliminarDiscos(titulo)) {
							System.out.println("El titulo se elimino con exito");
						}
						else {
							System.out.println("Titulo invalido");
						}
						 */
						
						System.out.println("----------------------------------");
						break;
					
					case 3: 
						System.out.print("Ingrese titulo a modificar: ");
						teclado.nextLine();
						titulo = teclado.nextLine();
						
						dvds.modificarDiscos(titulo);
						System.out.println("----------------------------------");
						break;
					
					case 4:
						// Listar todos los dvds
						dvds.listarTodos();
						//dvds.listarTodosDvd();
						System.out.println("----------------------------------");
						break; 
						
					case 5:
						// Listar los que tengo
						dvds.listarTengo();
						System.out.println("----------------------------------");
						break;
					case 6:
						// que duran menos de un tiempo dado
						System.out.println("Ingrese la duracion maxima: ");
						int durMax = teclado.nextInt();
						
						dvds.listaDuracion(durMax);
						System.out.println("----------------------------------");
						break;
					case 7:
						// Dvds de un determinado director
						System.out.println("Ingrese el director del dvd: ");
						String dir = teclado.nextLine();
						
						dvds.listarTodosDvdDeUnDirector(dir);
						System.out.println("----------------------------------");
						break;
					case 8:
						// Lista dvds por titulo
						dvds.listarDiscosAlfabeticamente();
						
						System.out.println("----------------------------------");
						break;
					case 9:
						// Cantidad de dvds totales
						System.out.println(dvds.cantidadTotal()+ " dvds");
						System.out.println("----------------------------------");
						break;
					case 10:
						// Cantidad que tiene
						System.out.println(dvds.cantidadTengo()+ " dvds que tengo");
						System.out.println("----------------------------------");
						break;
					case 11:
						break;
				}
				
				System.out.println("\n");
				op= elegirOpcion(teclado);
			}
		}
		
		if(op1 == 'c') {
			
			int op2 = elegirOpcion3(teclado);	
		
			while(op2 != 11) {
				
				switch(op2) {
				
					case 1: 
						// Añadir cd
						cd.agregarDisco();
						
						System.out.println("----------------------------------");
						
						break;
						
					case 2:
						// Eliminacion de cd
						System.out.print("Ingrese titulo a eliminar: ");
						titulo = teclado.nextLine();
						teclado.nextLine();
						
						/*
						 * if(cd.eliminarDVD(titulo)) {
							System.out.println("El titulo se elimino con exito");
						}
						else {
							System.out.println("Titulo invalido");
						}
						 */
						
						System.out.println("----------------------------------");
						break;
					
					case 3: 
						// Modificacion de cd
						System.out.println("Ingrese titulo a modificar: ");
						teclado.nextLine();
						titulo = teclado.nextLine();
						
						cd.modificarDiscos(titulo);
						
						System.out.println("----------------------------------");
						
						break;
					
					case 4:
						// Listar todos los cd
						cd.listarTodos();
						System.out.println("----------------------------------");
						break; 
						
					case 5:
						// Listar los que tengo
						cd.listarTengo();
						
						System.out.println("----------------------------------");
						break;
					case 6:
						// Que duran menos de un tiempo dado
						System.out.println("Ingrese la duracion maxima: ");
						int durMax = teclado.nextInt();
						
						cd.listaDuracion(durMax);
						System.out.println("----------------------------------");
						break;
					case 7:
						// Dvds de un determinado interprete
						System.out.println("Ingrese el interprete del cd: ");
						String inter = teclado.nextLine();
						
						cd.listarInterprete(inter);
						System.out.println("----------------------------------");
						break;
					case 8:
						// Listado por titulo
						cd.listarDiscosAlfabeticamente(); 
						System.out.println("----------------------------------");
						break;
					case 9:
						// Cantidad total de cds
						System.out.println(cd.cantidadTotal()+ " cds");
						System.out.println("----------------------------------");
						break;
					case 10:
						// Cds que tengo
						System.out.println(cd.cantidadTengo()+ " cds que tengo");
						System.out.println("----------------------------------"); 
						break;
					case 11:
						System.out.println("Ingrese titulo a mostrar cantidad de temas: ");
						teclado.nextLine();
						titulo = teclado.nextLine();
						
						cd.temasCd(titulo);
						break;
					case 12:
						break;
				}
				
				System.out.println("\n");
				op2= elegirOpcion3(teclado);
			}
		}
		
		
		teclado.close();
	}
	
	// Metodo para elegir Dvd o Cd
	public static char elegirOpcion1(Scanner teclado) {

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
	
	// Metodo catalogo Dvd
	public static int elegirOpcion(Scanner teclado) {
		int opcion;
		System.out.println("1. Añadir un dvd al catalago");
		System.out.println("2. Eliminar un dvd del catalogo");
		System.out.println("3. Modificar los datos de un dvd del catalogo");
		System.out.println("4. Listar todos los dvd del catalogo");
		System.out.println("5. Listar todos los dvd que tenemos del catalogo");
		System.out.println("6. Listar todos los dvd que duran menos de un determinado tiempo del catalogo");
		System.out.println("7. Listar todos los dvd que pertenezcan a un determinado director");
		System.out.println("8. Todos los dvds ordenados por titulo");
		System.out.println("9. Cantidad total de dvds");
		System.out.println("10. Cantidad de dvds que tengo");
		System.out.println("11. Salir.\n");
		System.out.print("Elija una opcion: ");
		opcion= teclado.nextInt();
		System.out.println("----------------------------------");
		
		while(opcion < 1 || opcion > 11) {
			System.out.print("Ingrese una opcion valida: ");
			opcion= teclado.nextInt();
		}
		
		
		return opcion;
		
		}
	
	// Metodo catalogo cd
	public static int elegirOpcion3(Scanner teclado) {
		int opcion;
		System.out.println("1. Añadir un cd al catalago");
		System.out.println("2. Eliminar un cd del catalogo");
		System.out.println("3. Modificar los datos de un cd del catalogo");
		System.out.println("4. Listar todos los cds del catalogo");
		System.out.println("5. Listar todos los cds que tenemos del catalogo");
		System.out.println("6. Listar todos los cds que duran menos de un determinado tiempo del catalogo");
		System.out.println("7. Listar todos los cds que pertenezcan a un determinado interprete");
		System.out.println("8. Todos los cds ordenados por titulo");
		System.out.println("9. Cantidad total de cds");
		System.out.println("10. Cantidad de cds que tengo");
		System.out.println("11. Cantidas de temas");
		System.out.println("12. Salir.\n");
		System.out.print("Elija una opcion: ");
		opcion= teclado.nextInt();
		System.out.println("----------------------------------");
		
		while(opcion < 1 || opcion > 12) {
			System.out.print("Ingrese una opcion valida: ");
			opcion= teclado.nextInt();
		}
		
		
		return opcion;
		}
	
}