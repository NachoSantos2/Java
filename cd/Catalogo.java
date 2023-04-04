package cd;

// Importamos Arraylist
import java.util.ArrayList;

import java.util.*;

public class Catalogo {

	private ArrayList<DVD> listaDvds;
	
	// Constructor, inicializa campo listaDvds como un arrayList
	public Catalogo() {
		
		this.listaDvds = new ArrayList<DVD>();
	}
	
	// Metodo para agregar dvd (lo agrega al final del array)
	public void agregarDVD(String titulo, String genero, String director, int duración, boolean tenemos, String comentario) {
		this.listaDvds.add(new DVD(titulo,genero,director, duración, tenemos,comentario)); //Asi creo y añado parametros a un nuevo dvd 
	}
	
	// Metodo para eliminar un dvd
	public boolean eliminarDVD(String titulo) {
		
		for(int i=0; i < listaDvds.size(); i++) {
			
			if(listaDvds.get(i).getTitulo().equals(titulo)) { // Comparacion de cadenas de texto
				/*
				 * listaDvds.get(i) obtiene el objeto en la posicion i de la lista
				 * getTitulo() obtiene el titulo del obj DVD, devuelve cadena con el titulo
				 * equals(titulo) compara cadena de getTitulo con el parametro recibido(titulo)
				 */
				
				listaDvds.remove(i);
				
				return true;
			}
		}
		return false;
	}
	
	/*
	 * 	public ArrayList<DVD> listarTodos() { // Metodo de retorno es ArrayList<DVD>, devuelve lista de objetos DVD
		
		for(int i=0; i< listaDvds.size(); i++) {
			
			System.out.println("Título: " + listaDvds.get(i).getTitulo());
		    System.out.println("Comentario: " + listaDvds.get(i).getComentario());
			System.out.println(listaDvds.get(i).toString());
		}
		
		return listaDvds;
	}
	
	 */
	
	public void listarDVDs() {
        for (DVD dvd : listaDvds) {
            System.out.println(dvd);
        }
    }
	// Devuelve lista de todos los DVDs del catalogo

	public void listarTodosDvd() {
		for(DVD dvd_a_mostrar : this.listaDvds) { //De un lado se escribe el objeto y dsp de que lista extraer los objetos 
			System.out.println(dvd_a_mostrar.toString() + "\n");
		}
		
		
	}
	// Metodo para imprimir el titulo y comentario de un DVD especifico
	public void imprimirTitulosYComentarios() {
	    for (DVD dvd : listaDvds) {
	        System.out.println("Título: " + dvd.getTitulo());
	        System.out.println("Comentario: " + dvd.getComentario() + "\n");
	    }
	}
	/*
	 *public void listarTodosDvd() {
		for(DVD dvd_a_mostrar : this.listaDvds) { //De un lado se escribe el objeto y dsp de que lista extraer los objetos 
			System.out.println(dvd_a_mostrar.toString() + "\n");
		}
	}
	 
	 public void listarTodosDvd() {
	    ArrayList<DVD> listaDvds = listarTodos();
	    if (listaDvds.isEmpty()) {
	        System.out.println("No hay DVDs en el catálogo.");
	    } else {
	        for (DVD dvd_a_mostrar : listaDvds) {
	            System.out.println(dvd_a_mostrar.toString());
	        }
	    }
	}
	 */
	
	// Modificar los valores de los atributos conociendo el titulo
	public void modificarDVD(String titulo) {
		
		for(int i=0; i<listaDvds.size(); i++) {
			
			if (listaDvds.get(i).getTitulo().equals(titulo)) {
				
				DVD dvd = listaDvds.get(i); // permite obtener el objeto DVD para su modificacion
				
				System.out.println("Desea modificar el titulo ");
				System.out.print("Ingrese el nuevo titulo: ");
				Scanner teclado = new Scanner(System.in);
				String tit = teclado.nextLine();
				dvd.setTitulo(tit);
				
				System.out.print("Ingrese genero a modificar: ");
				String genero = teclado.nextLine();
				dvd.setGenero(genero);
				
				System.out.println("Ingrese director a modificar: ");
				String director = teclado.nextLine();
				dvd.setDirector(director);
				
				System.out.print("Ingrese duracion a modificar: ");
				int duracion = teclado.nextInt();
				dvd.setDuracion(duracion);
				
				System.out.print("Quiere modificar si lo tenemos o no? [true/false] ");
				boolean tengo = teclado.nextBoolean();
				teclado.nextLine();
				dvd.setTener(tengo);
				
				System.out.print("Ingrese comentario a modificar: ");
				String comentario = teclado.nextLine();
				dvd.setComentario(comentario);
				
			}
		}
		
	}

	// Mostrar dvds que tengo
	public ArrayList<DVD> listaTengo(){
		// Creamos una lista para almacenar Dvds que tengo
		ArrayList<DVD> tengo = new ArrayList<>();
					
		for (int i=0; i<listaDvds.size(); i++) {
			
			if(listaDvds.get(i).isTener()) {
				
				tengo.add(listaDvds.get(i));
				
				System.out.println(listaDvds.get(i).toString());
			}
		}
		return tengo;
	}
	
	
	// Mostrar DVDs que duran menos de un tiempo dado
	public ArrayList<DVD> listaDuracion(int duracionMaxima){
		
		ArrayList<DVD> duracion = new ArrayList<>();
		
		for (int i=0; i<listaDvds.size(); i++) {
			
			if(listaDvds.get(i).getDuracion() <= duracionMaxima) {
				
				duracion.add(listaDvds.get(i));
				System.out.println(listaDvds.toString());
			}
		}
		return duracion;
	}
	
	
	// DVDs de un determinado director
	public void listarTodosDvdDeUnDirector(String director) {
		for(DVD dvd_a_mostrar : this.listaDvds) { //De un lado se escribe el objeto y dsp de que lista extraer los objetos 
			if(dvd_a_mostrar.getDirector().equals(director)) {
				System.out.println(dvd_a_mostrar.toString() + "\n");
			
			}
		}			
	} 
	
	// Ordenados por titulo
	
	public ArrayList<DVD> listarPorTitulo() {
	    ArrayList<DVD> titulos = new ArrayList<>(listaDvds);
	    Collections.sort(titulos, new Comparator<DVD>() {
	        public int compare(DVD dvd1, DVD dvd2) {
	            return dvd1.getTitulo().compareTo(dvd2.getTitulo());
	        }
	    });
	    return titulos;
	}
	
	
	// Cantidad total de dvds 
	public int cantidadTotal() {
		
		return listaDvds.size();
	}
	
	// Cantidad de dvds que tengo
	public int cantidadTengo() {
		
		return listaTengo().size();
	}
	
	
}
