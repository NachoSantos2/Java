package cd;

import java.util.*;

public class Main {
	public static void main(String[]args) {
		
		Scanner teclado= new Scanner(System.in);
		
		// Creamos el objeto dvd de la clase catalogo
		Catalogo dvds = new Catalogo();
		
		Catalogo2 cd = new Catalogo2();
		
		String titulo, genero, director, comentario;
		int duracion;
		boolean tengo;
		char si_tenemos;
		
		String interprete;
		int temas;
		
		int op1 = elegirOpcion1(teclado);
		
		int op = elegirOpcion(teclado);
		
		int op2 = elegirOpcion3(teclado);
		
		while(op != 11) {
			
			switch(op) {
			
				case 1: 
					System.out.print("Ingrese el titulo del dvd: ");
					teclado.nextLine();
					titulo = teclado.nextLine();
					//Limpiamos buffer
					
					
					System.out.print("Ingrese el genero: ");
					genero = teclado.nextLine();
					
					System.out.print("Ingrese el director: ");
					director = teclado.nextLine();
					
					System.out.print("Ingrese la duracion: ");
					duracion = teclado.nextInt();
					
					System.out.print("Tenemos el dvd? [Y/N] ");
					si_tenemos = teclado.next().charAt(0);
					
					System.out.print("Ingrese un comentario: ");
					teclado.nextLine();
					comentario = teclado.nextLine();
					
					
					dvds.agregarDVD(titulo, genero, director, duracion, si_tenemos == 'Y', comentario);
					break;
					
				case 2:
					System.out.print("Ingrese titulo a eliminar: ");
					titulo = teclado.nextLine();
					teclado.nextLine();
					
					if(dvds.eliminarDVD(titulo)) {
						System.out.println("El titulo se elimino con exito");
					}
					else {
						System.out.println("Titulo invalido");
					}
					break;
				
				case 3: 
					System.out.println("Ingrese titulo a modificar: ");
					titulo = teclado.nextLine();
					teclado.nextLine();
					
					dvds.modificarDVD(titulo);
					break;
				
				case 4:
					// Listar todos los dvds
					dvds.listarDVDs();
					//dvds.listarTodosDvd();
					
					break; 
					
				case 5:
					// Listar los que tengo
					dvds.listaTengo();
					break;
				case 6:
					// que duran menos de un tiempo dado
					System.out.println("Ingrese la duracion maxima: ");
					int durMax = teclado.nextInt();
					
					dvds.listaDuracion(durMax);
					break;
				case 7:
					// Dvds de un determinado director
					System.out.println("Ingrese el director del dvd: ");
					String dir = teclado.nextLine();
					
					dvds.listarTodosDvdDeUnDirector(dir);
					break;
				case 8:
					System.out.println(dvds.listarPorTitulo()); 
					break;
				case 9:
					System.out.println(dvds.cantidadTotal()+ " dvds");
					break;
				case 10:
					System.out.println(dvds.cantidadTengo()+ " dvds que tengo");
					break;
				case 11:
					break;
			}
			
			System.out.println("\n");
			op= elegirOpcion(teclado);
		}
		
		while(op2 != 11) {
			
			switch(op2) {
			
				case 1: 
					System.out.print("Ingrese el titulo del cd: ");
					teclado.nextLine();
					titulo = teclado.nextLine();
					//Limpiamos buffer
					
					System.out.println("Ingrese el interprete: ");
					interprete = teclado.nextLine();
					
					System.out.println("Ingrese la cantidad de temas: ");
					temas = teclado.nextInt();
					
					System.out.print("Ingrese la duracion: ");
					duracion = teclado.nextInt();
					
					System.out.print("Tenemos el cd? [Y/N] ");
					si_tenemos = teclado.next().charAt(0);
					
					System.out.print("Ingrese un comentario: ");
					teclado.nextLine();
					comentario = teclado.nextLine();
					
					System.out.print("Ingrese el genero: ");
					genero = teclado.nextLine();
					
					cd.agregarCd(titulo,interprete,temas, duracion, si_tenemos == 'Y', comentario,genero);
					break;
					
				case 2:
					System.out.print("Ingrese titulo a eliminar: ");
					titulo = teclado.nextLine();
					teclado.nextLine();
					
					if(cd.eliminarDVD(titulo)) {
						System.out.println("El titulo se elimino con exito");
					}
					else {
						System.out.println("Titulo invalido");
					}
					break;
				
				case 3: 
					System.out.println("Ingrese titulo a modificar: ");
					titulo = teclado.nextLine();
					teclado.nextLine();
					
					cd.modificarDVD(titulo);
					break;
				
				case 4:
					// Listar todos los cd
					cd.listarTodos();
					//dvds.listarTodosDvd();
					
					break; 
					
				case 5:
					// Listar los que tengo
					cd.listarTengo();
					break;
				case 6:
					// que duran menos de un tiempo dado
					System.out.println("Ingrese la duracion maxima: ");
					int durMax = teclado.nextInt();
					
					cd.listaDuracion(durMax);
					break;
				case 7:
					// Dvds de un determinado interprete
					System.out.println("Ingrese el interprete del cd: ");
					String inter = teclado.nextLine();
					
					cd.listarInterprete(inter);
					break;
				case 8:
					System.out.println(cd.listarPorTitulo()); 
					break;
				case 9:
					System.out.println(cd.cantidadTotal()+ " cds");
					break;
				case 10:
					System.out.println(cd.cantidadTengo()+ " cds que tengo");
					break;
				case 11:
					break;
			}
			
			System.out.println("\n");
			op2= elegirOpcion3(teclado);
		}
		
		teclado.close();
	}
	
	public static int elegirOpcion1(Scanner teclado) {

		int opcionDC;
		System.out.println("Desea visualizar un DVD o un CD?");
		System.out.print("Ingrese ---d--- para DVD y ---c--- para CD: ");
		opcionDC = teclado.nextInt();
		
		while (opcionDC != 'd' && opcionDC != 'c') {
			
			System.out.println("Ingrese una opcion: ");
			System.out.print("---d--- para DVD y ---c--- para CD: ");
			opcionDC = teclado.nextInt();
		}
		
		if(opcionDC == 'd') {
			
			elegirOpcion(teclado);
				
		}
		if (opcionDC == 'c' ) {
				
			elegirOpcion3(teclado);
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
		
		while(opcion < 1 || opcion > 11) {
			System.out.println("Ingrese una opcion valida: ");
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
		System.out.println("11. Salir.\n");
		System.out.print("Elija una opcion: ");
		opcion= teclado.nextInt();
		
		while(opcion < 1 || opcion > 11) {
			System.out.println("Ingrese una opcion valida: ");
			opcion= teclado.nextInt();
		}
		return opcion;
		}
	
}