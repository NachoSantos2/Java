package Ejercicio_7;

import java.util.ArrayList;

import java.util.*;

public class DVD extends Discos{
	
	// ATRITUTO ADICIONAL DE DVD
	private String director;
	
	public DVD(String titulo, String genero,String director, int duracion, boolean tenemos, String comentario) {
		super(titulo, genero, duracion, tenemos, comentario);
		this.director = director;
	}
	
	public DVD() {
		
	}

	protected String getDirector() {
		return director;
	}

	protected void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Titulo = " + titulo + "\nGenero = " + genero + "\nDirector = " + director +"\nDuracion = " + duracion
				+ "\nTenemos = " + tenemos + "\nComentario = " + comentario;
	}
	
	// METODO PARA AGRGAR UN DVD
	public void agregarDisco(){
		
		//TRABAJAREMOS CON DVDS
  
    	System.out.print("Ingrese un titulo para el dvd: ");
		String título= sc.nextLine();
		System.out.print("Ingrese el genero del dvd: ");
		String género= sc.nextLine();
		System.out.print("Ingrese el nombre del director: ");
		String director= sc.nextLine();
		System.out.print("Ingrese la duracion en minutos del dvd: ");
		int duracion= sc.nextInt();
		sc.nextLine();
		System.out.print("¿Tiene el dvd?");
		String respuesta = sc.nextLine();
		boolean tenemos = respuesta.equalsIgnoreCase("S") || respuesta.equalsIgnoreCase("Si");
		System.out.print("Ingrese un comentario: ");
		String comentario= sc.nextLine();
    	
		DVD dvd= new DVD(título, género, director, duracion, tenemos, comentario); //CREACION DE OBJETO DVD
		listaDiscos.add(dvd); //AÑADO DISCO A ARRAYLIST DE DISCOS
		listaDvds.add(dvd); //AÑADO DISCO A ARRAYLIST DE DVDS PARA FUTURO USO
		System.out.println("");
		System.out.println("Dvd ingresado correctamente");
		System.out.println("----------------------------------");
    
	}
	
	// METODO PARA MODIFICAR UN DVD
	public void modificarDiscos(String titulo) {
		
		for(int i=0; i<listaDvds.size(); i++) {
			
			if (listaDvds.get(i).getTitulo().equals(titulo)) {
				
				Discos dvd = listaDvds.get(i); // permite obtener el objeto DVD para su modificacion
				
				System.out.println("Desea modificar el titulo ");
				System.out.print("Ingrese el nuevo titulo: ");
				Scanner teclado = new Scanner(System.in);
				String tit = teclado.nextLine();
				dvd.setTitulo(tit);
				
				System.out.print("Ingrese genero a modificar: ");
				String genero = teclado.nextLine();
				dvd.setGenero(genero);
				
				System.out.print("Ingrese nuevo director: ");
				String director = teclado.nextLine();
				((DVD) dvd).setDirector(director);
				
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
	
	// LISTAR TODOS DVDS
	public void listarTodos() {
		    
        for (Discos dvd : listaDvds) {
            System.out.println(dvd.toString());
        }
	        if(listaDvds.size() == 0) {
	        	System.out.println("No hay ningun dvd");
	        }
		    
	}
	
	// LISTAR TODOS LOS DVDS QUE TENGO
	public void listarTengo() {
		
		ArrayList<Discos> tengo = new ArrayList<>();
		
		for (int i=0; i<listaDvds.size(); i++) {
			
			if(listaDvds.get(i).isTenemos()) {
				
				tengo.add(listaDvds.get(i));
				
				System.out.println(listaDvds.get(i).toString());
			}
			else {
				System.out.println("No lo tiene");
			}
		}
		if(listaDvds.size() == 0) {
			System.out.println("No hay ningun dvd");
		}
		
	}
	
	// METODO PARA LISTAR DVDS POR DURACION MAXIMA
	public ArrayList<Discos> listaDuracion(int duracionMaxima){
		
		ArrayList<Discos> duracion = new ArrayList<>();
		
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
		for(Discos dvd_a_mostrar : this.listaDvds) { // objeto(iterador) y lista donde se extraen los dvds
			if(((DVD) dvd_a_mostrar).getDirector().equals(director)) {
				System.out.println(dvd_a_mostrar.toString() + "\n");
			
			}
		}			
	}
		
	
}
