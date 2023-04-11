package Ejercicio_5;

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

public class Catalogo2 extends DVD_CD{
	
	private ArrayList<DVD_CD> listaCd;
	
	//Constructor catalogo
	public Catalogo2(String titulo_Album,String Interprete,int temas,int duracionCD,boolean tenemos,String comentarioCD,String generoCD) {
		
		super(titulo_Album, Interprete, temas, duracionCD, tenemos, comentarioCD, generoCD);
		
		this.listaCd = new ArrayList<DVD_CD>();
	}
	
	public Catalogo2() {
		
		this.listaCd = new ArrayList<DVD_CD>();
	}
	
	//Metodo para agrgar cd
	public void agregarCd(String titulo_Album,String Interprete,int temas,int duracion,boolean tenemos,String comentario,String genero) {
		
		this.listaCd.add(new DVD_CD(titulo_Album,Interprete,temas,duracion,tenemos,comentario,genero));
	}
	
	
	// Modificar los valores de los atributos conociendo el titulo
	public void modificarDVD(String titulo) {
			
		for(int i=0; i<listaCd.size(); i++) {
				
			if (listaCd.get(i).getTitulo_Album().equals(titulo)) {
					
				DVD_CD cd = listaCd.get(i); // permite obtener el objeto DVD para su modificacion
					
				System.out.println("Desea modificar el titulo ");
				System.out.print("Ingrese el nuevo titulo: ");
				Scanner teclado = new Scanner(System.in);
				String tit = teclado.nextLine();
				cd.setTitulo_Album(titulo);
					
				System.out.print("Ingrese el interprete: ");
				String interprete = teclado.nextLine();
				cd.setInterprete(interprete);
					
				System.out.print("Ingrese el tema a modificar (cantidad de temas): ");
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
		
	// Lista menor duracion
	public ArrayList<DVD_CD> listaDuracion(int duracionMaxima){
			
		ArrayList<DVD_CD> duracion = new ArrayList<>();
			
		for (int i=0; i<listaCd.size(); i++) {
				
			if(listaCd.get(i).getDuracion() <= duracionMaxima) {
					
				duracion.add(listaCd.get(i));
				System.out.println(listaCd.toString());
			}
		}
		return duracion;
	}
		
	// Listar por interprete
	public ArrayList<DVD_CD> listarInterprete(String interprete){
			
		ArrayList<DVD_CD> inter = new ArrayList<>();
			
		for (int i=0; i< listaCd.size(); i++) {
				
			if (listaCd.get(i).getInterprete().equals(interprete)) {
					
				inter.add(listaCd.get(i));
					
				System.out.println(listaCd.get(i).toString());
			}
		}
		return listaCd;
	}
		
	// Ordenados por titulo
	public ArrayList<DVD_CD> listarPorTitulo() {
		ArrayList<DVD_CD> titulos = new ArrayList<>(listaCd);
		Collections.sort(titulos, new Comparator<DVD_CD>() {
			public int compare(DVD_CD dvd1, DVD_CD dvd2) {
				return dvd1.getTitulo_Album().compareTo(dvd2.getTitulo_Album());
		        }
		    });
		    return titulos;
		}
		
		// temas tiene cada cd
		public ArrayList<DVD_CD> temasCd(){
			
			ArrayList<DVD_CD> temas = new ArrayList<>();
			
			for(int i=0; i<listaCd.size(); i++) {
				
				if(listaCd.get(i).getTemas() != 0) {
					
					temas.add(listaCd.get(i));
					
					System.out.println(listaCd.get(i).toString());
				}
			}
			return listaCd;
		}
		
}