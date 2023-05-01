package Ejercicio_7;

import java.util.*;

public abstract class Discos {
	
	// ATRIBUTOS COMPARTIDOS
	protected String titulo;
	protected String genero;
	protected int duracion;
	protected boolean tenemos;
	protected String comentario;
	
	// CONSTRUCTOR DE LA SUPER
	public Discos(String titulo, String genero, int duracion, boolean tenemos, String comentario) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.tenemos = tenemos;
		this.comentario = comentario;
	}
	
	public Discos() {
		
	}
	
	// GETTERS Y SETTERS
	public String getTitulo() {
		return titulo;
	}			

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean isTenemos() {
		return tenemos;
	}

	public void setTenemos(boolean tenemos) {
		this.tenemos = tenemos;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Titulo = " + titulo + "\nGenero = " + genero + "\nDuracion = " + duracion + "\nTenemos = " + tenemos
				+ "\nComentario = " + comentario + "]";
	}
	
	// CREACION DE ARRAYLIST
	public static ArrayList<Discos> listaDiscos = new ArrayList<>();
	public  ArrayList<Discos> listaDvds = new ArrayList<>();
	public static ArrayList<Discos> listaCds = new ArrayList<>();
	
	// CREACION DE SCANNER
	public static Scanner sc = new Scanner(System.in);
	
	
	// METODO PARA ABRSTRACTO AGREGAR UN DVD O CD
	// Metodo para agregar discos (lo agrega al final del array)
	public abstract void agregarDisco();
	
	
	// METODO PARA ELIMINAR UN DISCO, no hace falta ser abstracto xq se eliminan del array global(discos)
	public boolean eliminarDiscos(String titulo) {
		for (int i = 0; i < listaDiscos.size(); i++) {
	        if (listaDiscos.get(i).getTitulo().equals(titulo.trim())) {
	            listaDiscos.remove(i);
	            System.out.println("Disco eliminado correctamente");
	            return true;
	        }
	    }
	    return false;
	}
	
	
	// METODO ABSTRACTO QUE MODIFICA LOS VALORES DE LOS ATRIBUTOS CONOCIENDO EL TITULO
	public abstract void modificarDiscos(String titulo);
	

	// METODO ABSTRACTO QUE LISTA TODOS AMBOS DISCOS 
	public abstract void listarTodos();
	
	
	// METODO ABSTRACTO QUE LISTA DISCOS QUE TENGO
	public abstract void listarTengo();
	
	
	// METODO PARA LISTAR POR DURACION MAXIMA
	public abstract ArrayList<Discos> listaDuracion(int duracionMaxima);
		
	
	// METODO PARA LISTAR POR TITULO
	public void listarDiscosAlfabeticamente() {
		   List<String> titulosDiscos = new ArrayList<String>(); //
		    for (Discos disco : listaDiscos) {
		        titulosDiscos.add(disco.getTitulo());
		    }
		    titulosDiscos.sort(null); // Ordena la lista alfabéticamente
		    for (String titulo : titulosDiscos) {
		        for (Discos disco : listaDiscos) {
		            if (disco.getTitulo().equals(titulo)) {
		                System.out.println(disco.toString()); // Imprime todos los atributos del Disco
		                System.out.println("------------------------------");
		                break;
		            }
		        }
		    }
	}

	public void listarCDsInterprete(String interprete) {
	    ArrayList<CD> CdsInterprete = new ArrayList<>(); //Creacion de nuevo array solo para cds de un mismo interprete
	     		
	    for (Discos cd: listaCds) { //Para cada cd dentro del arraylist de cds 
	        if (((CD) cd).getInterprete().trim().equalsIgnoreCase(interprete.trim())) { //Si el valor del interprete de un cd es igual al valor del titulo del cd ingresado anteriormente por el usuario
	            CdsInterprete.add((CD) cd); 
	        }
	    }
	  
	    if (CdsInterprete.isEmpty()) {
	        System.out.println("No se encontraron CDs del interprete:  " + interprete);
	    } else {
	        System.out.println("Lista de CDs del interprete " + interprete + ":");
	        for (CD cd : CdsInterprete) {
	            System.out.println(cd);
	            System.out.println("----------");
	        }
	    }
	}

	// METODO PARA MOSTRAR LA CANTIDAD TOTAL DE DISCOS 
	public int cantidadTotal() {
			
		return listaDiscos.size();
	}
	
	// METODO PARA MOSTRAR LA CANTIDAD QUE TENGO
	public int cantidadTengo() {
		
		int cantidaTengo = 0;
		for(int i=0; i<listaDiscos.size(); i++) {
			
			if(listaDiscos.get(i).isTenemos()) {
				
				cantidaTengo++;
			}
		}
		return cantidaTengo;
	}
	
}