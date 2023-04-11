package Ejercicio_5;

// Importamos Arraylist
import java.util.ArrayList;

import java.util.*;

public class Catalogo extends DVD_CD{

	private ArrayList<DVD_CD> listaDvds;
	
	// Constructor, inicializa campo listaDvds como un arrayList
	public Catalogo(String titulo, String genero,String director, int duracion, boolean tener, String comentario) {
		
		super(titulo, genero, director, duracion, tener, comentario);
		
		this.listaDvds = new ArrayList<DVD_CD>();
	}
	
	public Catalogo(String titulo) {
		
		super(titulo);
		
		this.listaDvds = new ArrayList<DVD_CD>();
		
	}
	
	public Catalogo() {
		
		this.listaDvds = new ArrayList<DVD_CD>();
	}
	
	// Metodo para agregar dvd (lo agrega al final del array)
	public void agregarDVD(String titulo, String genero, String director, int duración, boolean tenemos, String comentario) {
		this.listaDvds.add(new DVD_CD(titulo,genero,director, duración, tenemos,comentario)); //Asi creo y añado parametros a un nuevo dvd 
	}
	
	// Devuelve lista de todos los DVDs del catalogo
	public void listarDVDs() {
        for (DVD_CD dvd : listaDvds) {
            System.out.println(dvd);
        }
        if(listaDvds.size() == 0) {
        	System.out.println("No hay ningun dvd");
        }
    }
	
	// Modificar los valores de los atributos conociendo el titulo
	public void modificarDVD(String titulo) {
		
		for(int i=0; i<listaDvds.size(); i++) {
			
			if (listaDvds.get(i).getTitulo().equals(titulo)) {
				
				DVD_CD dvd = listaDvds.get(i); // permite obtener el objeto DVD para su modificacion
				
				System.out.println("Desea modificar el titulo ");
				System.out.print("Ingrese el nuevo titulo: ");
				Scanner teclado = new Scanner(System.in);
				String tit = teclado.nextLine();
				dvd.setTitulo(tit);
				
				System.out.print("Ingrese genero a modificar: ");
				String genero = teclado.nextLine();
				dvd.setGenero(genero);
				
				System.out.print("Ingrese director a modificar: ");
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
	
	// Mostrar DVDs que duran menos de un tiempo dado
	public ArrayList<DVD_CD> listaDuracion(int duracionMaxima){
		
		ArrayList<DVD_CD> duracion = new ArrayList<>();
		
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
		for(DVD_CD dvd_a_mostrar : this.listaDvds) { //De un lado se escribe el objeto y dsp de que lista extraer los objetos 
			if(dvd_a_mostrar.getDirector().equals(director)) {
				System.out.println(dvd_a_mostrar.toString() + "\n");
			
			}
		}			
	} 
	
	// Ordenados por titulo
	
	public ArrayList<DVD_CD> listarPorTitulo() {
	    ArrayList<DVD_CD> titulos = new ArrayList<>(listaDvds);
	    Collections.sort(titulos, new Comparator<DVD_CD>() {
	        public int compare(DVD_CD dvd1, DVD_CD dvd2) {
	            return dvd1.getTitulo().compareTo(dvd2.getTitulo());
	        }
	    });
	    return titulos;
	}
	
}