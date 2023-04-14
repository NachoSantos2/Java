package Ejercicio_5_Discos;

import java.util.ArrayList;

import java.util.*;

import Ejercicio_5.DVD_CD;

public class Discos {
	
	// Atributos de ambos discos
	protected String titulo;
	protected String genero;
	protected int duracion;
	protected boolean tenemos;
	protected String comentario;
	
	// Constructor de los discos
	public Discos(String titulo, String genero, int duracion, boolean tenemos, String comentario) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.tenemos = tenemos;
		this.comentario = comentario;
	}

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
		return "Discos [Titulo = " + titulo + "/nGenero = " + genero + "/nDuracion = " + duracion + "/nTenemos = " + tenemos
				+ "/nComentario=" + comentario + "]";
	}

	// ArrayList que almacenan ambos discos, otro el dvd y otro el cd
	public static ArrayList<Discos> listaDiscos = new ArrayList<>();
	public static ArrayList<Discos> listaDvds = new ArrayList<>();
	public static ArrayList<Discos> listaCds = new ArrayList<>();
	
	
	// Metodo para agregar atributos de los discos
	// Metodo para agregar dvd (lo agrega al final del array)
	public void agregarDiscos(String titulo, String genero, int duración, boolean tenemos, String comentario) {
		Discos.listaDiscos.add(new Discos(titulo,genero, duración, tenemos,comentario)); //Asi creo y añado parametros a un nuevo dvd 
	}
	
	
	// Metodo para eliminar un dvd
		public boolean eliminarDiscos(String titulo) {
			
			for(int i=0; i < listaDvds.size(); i++) {
				
				if(listaDvds.get(i).getTitulo().equals(titulo)) { // Comparacion de cadenas de texto
					/*
					 * listaDvds.get(i) obtiene el objeto en la posicion i de la lista
					 * getTitulo() obtiene el titulo del obj DVD, devuelve cadena con el titulo
					 * equals(titulo) compara cadena de getTitulo con el parametro recibido(titulo)
					 */
					
					listaDvds.remove(i);
					System.out.println("El titulo se elimino con exito");
					
					return true;
				}
				else {
					System.out.println("Titulo invalido");
				}
			}
			return false;
		}
		
		// Modificar los valores de los atributos conociendo el titulo
		public void modificarDVD(String titulo) {
			
			for(int i=0; i<listaDiscos.size(); i++) {
				
				if (listaDiscos.get(i).getTitulo().equals(titulo)) {
					
					Discos dvd = listaDiscos.get(i); // permite obtener el objeto DVD para su modificacion
					
					System.out.println("Desea modificar el titulo ");
					System.out.print("Ingrese el nuevo titulo: ");
					Scanner teclado = new Scanner(System.in);
					String tit = teclado.nextLine();
					dvd.setTitulo(tit);
					
					System.out.print("Ingrese genero a modificar: ");
					String genero = teclado.nextLine();
					dvd.setGenero(genero);
					
					
					System.out.print("Ingrese duracion a modificar: ");
					int duracion = teclado.nextInt();
					dvd.setDuracion(duracion);
					
					System.out.print("Quiere modificar si lo tenemos o no? [true/false] ");
					boolean tengo = teclado.nextBoolean();
					teclado.nextLine();
					dvd.setTenemos(tengo);
					
					System.out.print("Ingrese comentario a modificar: ");
					String comentario = teclado.nextLine();
					dvd.setComentario(comentario);
					
				}
			}
			
		}
	
}
