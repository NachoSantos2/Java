package cd;

/*
 * La funcionalidad que queremos que nos brinde el catálogo debe incluir como mínimo lo siguiente:  Permitir ingresar información sobre los DVD.  Permitir eliminar un DVD conociendo el título.  Permitir modificar los valores de uno o más atributos conociendo el título.  Listar:
 todos los DVD
 los DVD que tengo
 los DVD que duran menos de un tiempo dado en minutos.  los DVD de un determinado director.  todos los DVD ordenados por título
 Informar:
 la cantidad total de DVD.  la cantidad de DVD que tengo
 */

// listados por interprete y saber cuantos temas tiene el CD

import java.util.ArrayList;

import java.util.*;

public class Catalogo2 {
	
	private ArrayList<CD> listaCd;
	
	//Constructor catalogo
	public Catalogo2() {
		
		this.listaCd = new ArrayList<CD>();
	}
	
	//Metodo para agrgar cd
	public void agregarCd(String titulo_Album,String Interprete,int temas,int duracion,boolean tenemos,String comentario,String genero) {
		
		this.listaCd.add(new CD(titulo_Album,Interprete,temas,duracion,tenemos,comentario,genero));
	}
	
	// Metodo para eliminar un cd
	public boolean eliminarDVD(String titulo) {
			
		for(int i=0; i < listaCd.size(); i++) {
				
			if(listaCd.get(i).getTitulo_Album().equals(titulo)) { // Comparacion de cadenas de texto
					/*
					 * listaDvds.get(i) obtiene el objeto en la posicion i de la lista
					 * getTitulo() obtiene el titulo del obj DVD, devuelve cadena con el titulo
					 * equals(titulo) compara cadena de getTitulo con el parametro recibido(titulo)
					 */
					
				listaCd.remove(i);
					
				return true;
				}
			}
		return false;
		}
		
	// Modificar los valores de los atributos conociendo el titulo
	public void modificarDVD(String titulo) {
			
		for(int i=0; i<listaCd.size(); i++) {
				
			if (listaCd.get(i).getTitulo_Album().equals(titulo)) {
					
				CD cd = listaCd.get(i); // permite obtener el objeto DVD para su modificacion
					
				System.out.println("Desea modificar el titulo ");
				System.out.print("Ingrese el nuevo titulo: ");
				Scanner teclado = new Scanner(System.in);
				String tit = teclado.nextLine();
				cd.setTitulo_Album(titulo);
					
				System.out.println("Ingrese el interprete: ");
				String interprete = teclado.nextLine();
				cd.setInterprete(interprete);
					
				System.out.println("Ingrese el tema a modificar (cantidad de temas): ");
				int tema = teclado.nextInt();
				cd.setTemas(tema);
				
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
		
	// Devuelve lista de todos los CDs del catalogo
	public ArrayList<CD> listarTodos() { // Metodo de retorno es ArrayList<DVD>, devuelve lista de objetos DVD
			
		for(int i=0; i< listaCd.size(); i++) {
				
			System.out.println(listaCd.get(i).toString());
		}
		if (listaCd.size() == 0) {
			System.out.println("No hay ningun cd");
		}
			
		return listaCd;
		}
		
		
	// Lista cd que tengo
	public ArrayList<CD> listarTengo(){
			
		ArrayList<CD> tengo = new ArrayList<>();
			
		for (int i=0; i< listaCd.size(); i++) {
				
			if (listaCd.get(i).isTenemos()) {
					
				tengo.add(listaCd.get(i));
					
				System.out.println(listaCd.get(i).toString());
			}
			else {
				System.out.println("No lo tiene");
			}
		}
		if (listaCd.size() == 0) {
			System.out.println("No tengo ningun cd");
		}
		return listaCd;
	}
		
	// Lista menor duracion
	public ArrayList<CD> listaDuracion(int duracionMaxima){
			
		ArrayList<CD> duracion = new ArrayList<>();
			
		for (int i=0; i<listaCd.size(); i++) {
				
			if(listaCd.get(i).getDuracion() <= duracionMaxima) {
					
				duracion.add(listaCd.get(i));
				System.out.println(listaCd.toString());
			}
		}
		return duracion;
	}
		
	// Listar por interprete
	public ArrayList<CD> listarInterprete(String interprete){
			
		ArrayList<CD> inter = new ArrayList<>();
			
		for (int i=0; i< listaCd.size(); i++) {
				
			if (listaCd.get(i).getInterprete().equals(interprete)) {
					
				inter.add(listaCd.get(i));
					
				System.out.println(listaCd.get(i).toString());
			}
		}
		return listaCd;
	}
		
	// Ordenados por titulo
	public ArrayList<CD> listarPorTitulo() {
		ArrayList<CD> titulos = new ArrayList<>(listaCd);
		Collections.sort(titulos, new Comparator<CD>() {
			public int compare(CD dvd1, CD dvd2) {
				return dvd1.getTitulo_Album().compareTo(dvd2.getTitulo_Album());
		        }
		    });
		    return titulos;
		}
		
		// temas tiene cada cd
		public ArrayList<CD> temasCd(){
			
			ArrayList<CD> temas = new ArrayList<>();
			
			for(int i=0; i<listaCd.size(); i++) {
				
				if(listaCd.get(i).getTemas() != 0) {
					
					temas.add(listaCd.get(i));
					
					System.out.println(listaCd.get(i).toString());
				}
			}
			return listaCd;
		}
		
		
		// Cantidad total de dvds 
		public int cantidadTotal() {
			
			return listaCd.size();
		}
		
		// Cantidad de dvds que tengo
		public int cantidadTengo() {
			
			return listarTengo().size();
		}
		
}