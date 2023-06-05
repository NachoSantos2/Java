package Biblioteca;

import java.util.*;

public class SistemaAdministracionLibros {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Biblioteca libro = new Biblioteca();
		
		int opcion = 0;
		
		do {
			System.out.println("1.Dar de alta un libro");
			System.out.println("2.Dar de baja un libro");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.print("Ingrese opcion: ");
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				System.out.print("Ingrese titulo del libro: ");
				String titulo = sc.nextLine();
				sc.nextLine();
				libro.alta(titulo);
				System.out.println("------------------");
				break;
				
			case 2:
				System.out.print("Ingrese el titulo del libro: ");
				sc.nextLine();
				String titulo2 = sc.nextLine();
				
				libro.baja(titulo2);				
				System.out.println("-------------------");
				break;
				
			case 3:
				System.out.println("Ingrese el titulo del libro: ");
				String titulo3 = sc.nextLine();
				
				Libro mostrarLibro = libro.buscaLibro(titulo3);
				
				if(mostrarLibro != null) {
					System.out.println("El titulo del libro es: " + mostrarLibro.getTitulo());
					System.out.println("El autor del libro es: " + mostrarLibro.getAutor());
					System.out.println("La editorial del libro es: " + mostrarLibro.getEditorial());
					System.out.println("El genero del libro es: " + mostrarLibro.getGenero());
					System.out.println("La cantidad de paginas es de: " + mostrarLibro.getPaginas());
					System.out.println("El numero ISBN: " + mostrarLibro.getNumISBN());
					System.out.println("El año de edicion es: " + mostrarLibro.getEdicion());
				}
				else {
					System.out.println("El libro no esta en la biblioteca");
				}
				System.out.println("-----------------------------");
				
			case 4:
				System.out.print("Ingrese un titulo a modificar: ");
				String tituloAModificar = sc.nextLine();
				libro.modificarLibro(tituloAModificar);
				break;
			
			case 5:
				libro.listarTodos();
				System.out.println("-------------------");
				break;
			}	
			
			
		}while(opcion != 10);
		sc.close();
		
		
	}

}
