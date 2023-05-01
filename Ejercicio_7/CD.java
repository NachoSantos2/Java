package Ejercicio_7;

import java.util.ArrayList;

import java.util.*;

public class CD extends Discos{
	
	// ATRIBUTOS ADICIONALES DE CD
	private String interprete;
	private int temas;
	
	// CONSTRUCTOR CD
	public CD(String titulo, String genero, String comentario, int duracion, boolean tenemos, String interprete, int temas) {
		super(titulo, genero, duracion, tenemos, comentario);
		this.interprete = interprete;
		this.temas = temas;
	}
	
	public CD() {
		
	}

	protected String getInterprete() {
		return interprete;
	}

	protected void setInterprete(String interprete) {
		this.interprete = interprete;
	}

	protected int getTemas() {
		return temas;
	}

	protected void setTemas(int temas) {
		this.temas = temas;
	}

	@Override
	public String toString() {
		return "Titulo = " + titulo + "\nGenero = " + genero + "\nComentario = " + comentario
				+ "\nDuracion = " + duracion + "\nTenemos = " + tenemos  + "\nInterprete = " + interprete + "\nTemas = " + temas;
	}
	
	
	// METODO PARA AGREGAR UN CD
	public void agregarDisco(){
		
		// TRABAJAREMOS CON CDS
		
		System.out.print("Ingrese un titulo para el CD: ");
		String título= sc.nextLine();
		System.out.print("Ingrese el genero del CD: ");
		String género= sc.nextLine();
		System.out.print("Ingrese el nombre del interprete: ");
		String interprete= sc.nextLine();
		System.out.print("Ingrese la duracion en minutos del CD: ");
		int duración= sc.nextInt();
		sc.nextLine();
		System.out.print("Ingrese la cantidad de temas que tiene el CD: ");
		int cantidadTemas = sc.nextInt();
		sc.nextLine();
		System.out.print("¿Tiene el CD?");
		String respuesta = sc.nextLine();
		boolean tenemos = respuesta.equalsIgnoreCase("S") || respuesta.equalsIgnoreCase("Si");
		System.out.print("Ingrese un comentario: ");
		String comentario= sc.nextLine();
		
		CD cd = new CD(título, género, comentario , duración, tenemos, interprete, cantidadTemas); //CREACION DE OBJETO CD
    
		listaDiscos.add(cd);
		listaCds.add(cd);
		
		System.out.println("Cd ingresado correctamente");
		System.out.println("----------------------------------");
  
    }
	
	// METODO PARA MODIFICAR UN CD
	public void modificarDiscos(String titulo) {
		
		for(int i=0; i<listaCds.size(); i++) {
			
			if (listaCds.get(i).getTitulo().equals(titulo)) {
					
				Discos cd = listaCds.get(i); // permite obtener el objeto DVD para su modificacion
					
				System.out.println("Desea modificar el titulo ");
				System.out.print("Ingrese el nuevo titulo: ");
				Scanner teclado = new Scanner(System.in);
				String tit = teclado.nextLine();
				cd.setTitulo(tit);
				
				System.out.print("Ingrese el interprete: ");
				String interprete = teclado.nextLine();
				((CD) cd).setInterprete(interprete);
					
				System.out.print("Ingrese el tema a modificar (cantidad de temas): ");
				int tema = teclado.nextInt();
				((CD) cd).setTemas(tema);
				
				System.out.print("Ingrese duracion a modificar: ");
				int duracion = teclado.nextInt();
				cd.setDuracion(duracion);
					
				System.out.print("Quiere modificar si lo tenemos o no? [true/false] ");
				boolean tengo = teclado.nextBoolean();
				teclado.nextLine();
				cd.setTenemos(tengo);
					
				System.out.print("Ingrese comentario a modificar: ");
				String comentario = teclado.nextLine();
				cd.setComentario(comentario);
				
				System.out.print("Ingrese genero a modificar: ");
				String genero = teclado.nextLine();
				cd.setGenero(genero);
					
				}
		}
	}
	
	// LISTAR TODOS CDS
	public void listarTodos() {
		
		for(int i=0; i< listaCds.size(); i++) {
			
			System.out.println(listaCds.get(i).toString());
		}
		if (listaCds.size() == 0) {
			System.out.println("No hay ningun cd");
		}
	}
	
	// LISTAR TODOS LOS CDS QUE TENGO
	public void listarTengo() {
		
		ArrayList<Discos> tengo = new ArrayList<>();
		
		for (int i=0; i< listaCds.size(); i++) {
				
			if (listaCds.get(i).isTenemos()) {
					
				tengo.add(listaCds.get(i));
					
				System.out.println(listaCds.get(i).toString());
			}
			else {
				System.out.println("No lo tiene");
			}
		}
		if (listaCds.size() == 0) {
			System.out.println("No tiene nada");
		}
	}
	
	// METODO PARA LISTAR CDS POR DURACION MAXIMA
	public ArrayList<Discos> listaDuracion(int duracionMaxima){
		
		ArrayList<Discos> duracion = new ArrayList<>();
		
		for (int i=0; i<listaCds.size(); i++) {
				
			if(listaCds.get(i).getDuracion() <= duracionMaxima) {
					
				duracion.add(listaCds.get(i));
				System.out.println(listaCds.toString());
			}
		}
		return duracion;
	}
	
	
	
	//12.METODO EXCLUSIVO CD - MOSTRAR CANTIDAD DE TEMAS DE UN CD 
	public void temasCd(String título){
		 int cantidadTemas = 0;
		 System.out.println("El título ingresado es: " + título);
		 
		 for (int i = 0; i < listaCds.size(); i++) { //Ciclo for para recorrer el arrays de cds
			 CD cd = (CD) listaCds.get(i); // "Crea una variable llamada 'cd' de tipo 'CdHerencia' y asigna a esa variable el valor del objeto en la posición 'i' del ArrayList 'lista_cds' usando el método 'get'".
		     if (cd.getTitulo().equalsIgnoreCase(título)) { 
		            cantidadTemas = ((CD) cd).getTemas();
		            System.out.println("La cantidad de temas del CD es de : " + cantidadTemas);
		        }
		    }
		    if (cantidadTemas == 0) { //Si la cantidad de temas es = 0, el cd no existe 
		        System.out.println("CD inexistente"); 
		    }
		}

}
