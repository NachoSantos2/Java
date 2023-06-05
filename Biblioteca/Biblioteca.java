package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	
	//CREACION DE ARRAYLIST CON LOS ATRIBUTOS DE LA CLASE DISCO
	protected ArrayList<Libro> libros;
		
	//CREACION METODO SCANNER
	Scanner sc= new Scanner(System.in);
	
	//CONSTRUCTOR
	public Biblioteca(){
		this.libros= new ArrayList<>();
	}

	//GETTERS Y SETTERS
	protected ArrayList<Libro> getLibros() {
		return libros;
	}

	protected void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	

	//METODO PARA DAR DE ALTA UN LIBRO(VER SI YA EXSISTE)
	public void alta(String titulos) {
		
		for(int i = 0; i<libros.size(); i++) {
			Libro l = libros.get(i);
			if(l.getTitulo().equals(titulos) ) {
				
				System.out.println("El libro ya exsiste");
				return;
			}
		}
		//fijarse si despues se imprime el titulo al listar los libros
		System.out.print("Ingrese un titulo para el libro: ");
    	String titulo = sc.nextLine();
    	System.out.print("Ingrese el autor del libro: ");
		String autor = sc.nextLine();
		System.out.print("Ingrese el nombre de la editorial: ");
		String editorial = sc.nextLine();
		System.out.print("Ingrese el genero del libro: ");
		String genero = sc.nextLine();
		System.out.print("Cuantas paginas tiene? ");
		int paginas = sc.nextInt();
		System.out.print("Ingrese el numero ISBN: ");
		int numISBN = sc.nextInt();
		System.out.print("Ingrese el año de edicion: ");
		int edicion = sc.nextInt();
		//CREACION OBJETO LIBRO Y AÑADO A ARRAY
		libros.add(new Libro(titulo,autor,editorial,genero,paginas,numISBN, edicion));
		System.out.println("Libro ingresado correctamente");
		
	}

	//METODO PARA DAR DE BAJA UN LIBRO
	public void baja(String titulo) {
		boolean eliminado = false; 
		for(int i = 0; i<libros.size();i++) {
			Libro d = libros.get(i);
			if(d.getTitulo().equals(titulo)) {
				libros.remove(i);
				System.out.println("Libro eliminado correctamente! ");
				eliminado = true; 
			}
		}
		if(!eliminado) {
			System.out.println("Libro inexistente");
		}
	}
	
	// METODO PARA BUSCARLO EN EL ARRAYLIST
	public Libro buscaLibro(String codigo) {
		
		for (int i = 0; i < libros.size(); i++) {
			
			Libro a = libros.get(i);
			
			if (a.getTitulo().equalsIgnoreCase(codigo)) { // SI EL TITULO DE LA LISTA DE LIBROS ES IGUAL AL TITULO
														  // INGRESADO POR EL USUARIO, DEVUELVE EL ELEMENTO EN EL ARRAY										  // CASO CONTRARIO NO DEVUELVE NADA				
				return a;
			}
		}
		return null;
	}
		
	//METODO PARA MODIFICAR LOS ATRIBUTOS DE UN LIBRO
	public void modificarLibro(String tituloModificar) {
		boolean modificado = false; 
		System.out.print("Ingrese un titulo a modificar: ");
		String tituloAModificar = sc.nextLine();
		for(int i = 0; i < libros.size(); i++) {
			Libro d= libros.get(i);
			if(d.getTitulo().equals(tituloAModificar)) {
				System.out.print("Ingrese el título del libro: ");
                String titulo = sc.nextLine();
                System.out.print("Ingrese el autor del libro: ");
                String autor = sc.nextLine();
                System.out.print("Ingrese la editorial del libro: ");
                String editorial = sc.nextLine();
                sc.nextLine(); // Limpiar el buffer de entrada
                System.out.print("Ingrese le genero del libro: ");
                String genero = sc.nextLine();
                System.out.print("Ingrese la cantidad de paginas: ");
                int paginas = sc.nextInt();
                System.out.print("Ingrese el numero ISBN: ");
                int numISBN = sc.nextInt();
                System.out.print("Ingrese el año de edicion:");
                int edicion = sc.nextInt();
                // Realizar los cambios
                d.setTitulo(titulo);
                d.setGenero(autor);
                d.setEditorial(editorial);
                d.setGenero(genero);
                d.setPaginas(paginas);
                d.setNumISBN(numISBN);
                d.setEdicion(edicion);
                // Si lo encontró y modificó cambiar el booleano a true y salir del for
                modificado = true;
                break;
            }
        }
		 if (modificado) {
	            System.out.println("Libro modificado correctamente.");
	        } else {
	            System.out.println("No se encontró un libro con el título ingresado.");
	        }
	    }
	
	
	//METODOS ABSTRACTOS DE LISTADOS
	//METODO PARA LISTAR AUTORES
	// public abstract void listarAutores();
	
	//
	
	public void listarTodos() {
		if(libros.size() > 0) {
			System.out.println("Lista de Libros: ");
		}
		else {
			System.out.println("No hay ningun libro");
		}
		for(int i = 0; i<libros.size();i++) {
			Libro d = libros.get(i);
			if(d instanceof Libro) {
				System.out.println(d);
			}
		}
		
	}
	
}