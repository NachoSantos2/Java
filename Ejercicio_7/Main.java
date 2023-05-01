package Ejercicio_7;

//Autor: Ignacio Santos

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Discos discoObjetoDVD = new DVD();
		Discos discoObjetoCD = new CD();
		int opcion = 0;
		
		do {
			System.out.println("Elija una opcion: ");
			System.out.println("1. Añadir un nuevo disco");
			System.out.println("2. Eliminar un disco por titulo");
			System.out.println("3. Modificar los valores de un disco por titulo");
			System.out.println("4. Listar todos los discos");
			System.out.println("5. Listar todos los discos que tienes");
			System.out.println("6. Listar todos los discos que duran menos de un tiempo determinado");
			System.out.println("7. Listar todos los discos ordenados alfabeticamente");
			System.out.println("8. Cantidad total de Discos");
			System.out.println("9. Cuantos discos tienes");
			System.out.println("10. Listar por director");
			System.out.println("11. Listar por interprete");
			System.out.println("12. Listar cuantos temas tiene un determinado CD");
			System.out.println("13. Salir");
			System.out.print("Elija una opcion: ");
			opcion = teclado.nextInt();
			switch(opcion) {
				case 1: 
					System.out.print("Ingrese 1 para DVD y 2 para CD: ");
					int opcionIngresada= teclado.nextInt();
					if (opcionIngresada == 1) {
						discoObjetoDVD.agregarDisco();
					}
					else if (opcionIngresada == 2) {
						discoObjetoCD.agregarDisco();
					}
					else {
						System.out.println("Opcion Invalida!!");
					}
					System.out.println("----------------------------------");
					break;
				case 2:
					System.out.print("Ingrese el nombre del disco a eliminar: ");
					teclado.nextLine();
					String eliminarTitulo = teclado.nextLine();
					discoObjetoDVD.eliminarDiscos(eliminarTitulo);
					discoObjetoCD.eliminarDiscos(eliminarTitulo);
					System.out.println("----------------------------------");
					break;
				case 3: 
					System.out.print("Ingrese titulo a modificar: ");
					teclado.nextLine();
					String titulo = teclado.nextLine();
					System.out.println("Ingrese el tipo de disco que desea modificar:");
				    System.out.println("Ingrese 1 para DVD");
				    System.out.println("Ingrese 2 para CD");
				    int modificar = teclado.nextInt(); //declaracion e inicializacion de variable a modificar
						
				    while (modificar < 1 || modificar > 2) {
							
						System.out.println("Opción inválida, vuelve a ingresar (1/2): ");
						modificar = teclado.nextInt();
							 
					}
				    if(modificar == 1) {
				    	
				    	discoObjetoDVD.modificarDiscos(titulo);
				    }
				    else if(modificar == 2) {
				    	
				    	discoObjetoCD.modificarDiscos(titulo);
				    }
					System.out.println("----------------------------------");
					break;
				case 4:
					System.out.println("Ingrese el tipo de disco que desea modificar:");
				    System.out.println("Ingrese 1 para DVD");
				    System.out.println("Ingrese 2 para CD");
				    int listarTodos = teclado.nextInt();
						
				    while (listarTodos < 1 || listarTodos > 2) {
							
						System.out.println("Opción inválida, vuelve a ingresar (1/2): ");
						listarTodos = teclado.nextInt();
							 
					}
					if(listarTodos == 1 ) {
						
						discoObjetoDVD.listarTodos();
					}
					else if(listarTodos == 2 ) {
						
						discoObjetoCD.listarTodos();
					}
					
					System.out.println("----------------------------------");
					break;
				case 5: 
					// Listar los que tengo
					System.out.println("Ingrese el tipo de disco que desea modificar:");
				    System.out.println("Ingrese 1 para DVD");
				    System.out.println("Ingrese 2 para CD");
				    int listarTengo = teclado.nextInt();
						
				    while (listarTengo < 1 || listarTengo > 2) {
							
						System.out.println("Opción inválida, vuelve a ingresar (1/2): ");
						listarTengo = teclado.nextInt();
							 
					}
					if(listarTengo == 1) {
						
						discoObjetoDVD.listarTengo();
					}
					else if(listarTengo == 2) {
						
						discoObjetoCD.listarTengo();
					}
				    
					System.out.println("----------------------------------");
					break;
				case 6:
					System.out.println("Ingrese la duración máxima en minutos:");
					int duracionMaxima = 0;
					if (teclado.hasNextInt()) { //Verifica si el usuario a ingresado un numero entero
						duracionMaxima = teclado.nextInt();
						System.out.println("Ingrese el tipo de disco que desea modificar:");
					    System.out.println("Ingrese 1 para DVD");
					    System.out.println("Ingrese 2 para CD");
					    int durMax = teclado.nextInt();
							
					    while (durMax < 1 || durMax > 2) {
								
							System.out.println("Opción inválida, vuelve a ingresar (1/2): ");
							durMax = teclado.nextInt();
								 
						}
					    if(durMax == 1) {
					    	
					    	discoObjetoDVD.listaDuracion(duracionMaxima);
					    }
					    else if(durMax == 2) {
					    	
					    	discoObjetoCD.listaDuracion(duracionMaxima);
					    }
					} else {
						System.out.println("Entrada inválida. Por favor ingrese un número entero.");
					}
					System.out.println("----------------------------------");
					break;
				case 7:
					System.out.println("Discos ordenados alfabeticamente: ");
					System.out.println("------------------------------");
					discoObjetoDVD.listarDiscosAlfabeticamente();
					break;
				case 8:
					System.out.println(discoObjetoDVD.cantidadTotal()); 
					System.out.println("----------------------------------");
					break;
				case 9: 
					int cantidadTengo = discoObjetoDVD.cantidadTengo();
					System.out.println("Tienes: " + cantidadTengo + " discos");
					System.out.println("----------------------------------");
					break;
				case 10: 
					System.out.println("Ingrese el nombre del director a listar sus dvds: ");
					teclado.nextLine();
					String DVDsDirector = teclado.nextLine().trim();
					DVD objDvd = new DVD();
					objDvd.listarTodosDvdDeUnDirector(DVDsDirector);
					System.out.println("--------------");
					break;
				case 11: 
					System.out.println("Ingrese el nombre del interprete a listar sus Cd: ");
					teclado.nextLine();
					String CDsInterprete= teclado.nextLine().trim();
					discoObjetoCD.listarCDsInterprete(CDsInterprete);
					System.out.println("--------------");
					break;
				case 12:
					System.out.println("Ingrese el titulo del disco a ver su cantidad de temas: ");
		 		    teclado.nextLine();
					String tituloCantidadTemas = teclado.nextLine();
					CD objCd = new CD();
		 		   	objCd.temasCd(tituloCantidadTemas);
		 		   System.out.println("--------------");
		 		   break;
				case 13: 
					break;
				default:
					System.out.println("");
					System.out.println("OPCION NO VALIDA");
					System.out.println("");
					
			}
			
		}while(opcion != 13);
		teclado.close();
	}
	
}