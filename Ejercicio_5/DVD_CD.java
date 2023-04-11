package Ejercicio_5;

import java.util.ArrayList;


// Clase padre con los atributos y metosos globales de los DVDs y CDs

public class DVD_CD {
	
	// Atributos de los DVD
		private String titulo;
		private String genero;
		private String director;
		private int duracion;
		private boolean tener;
		private String comentario;
	
	// Atributos de la clase CD
		private String titulo_Album;
		private String Interprete;
		private int temas;
		private int duracionCD;
		private boolean tenemos;
		private String comentarioCD;
		private String generoCD;
		
		// Constructor DVD
		/**
		 * 
		 * @param titulo
		 * @param genero
		 * @param duracion
		 * @param tener
		 * @param comentario
		 */
		public DVD_CD(String titulo, String genero,String director, int duracion, boolean tener, String comentario) {
			this.titulo = titulo;
			this.genero = genero;
			this.director = director;
			this.duracion = duracion;
			this.tener = tener;
			this.comentario = comentario;
		}
		
		public DVD_CD(String titulo,String comentario) {
			
			this.titulo = titulo;
			this.comentario = comentario;
		}
		
		public DVD_CD(String titulo) {
			
			this.titulo = titulo;
		}
		
		public DVD_CD() {
			
			
		}
		
		/**
		 * 
		 * @param titulo_Album
		 * @param Interprete
		 * @param temas
		 * @param duracion
		 * @param tenemos
		 * @param comentario
		 * @param genero
		 */
		// Constructor CD
		public DVD_CD(String titulo_Album,String Interprete,int temas,int duracionCD,boolean tenemos,String comentarioCD,String generoCD) {
			
			this.titulo_Album = titulo_Album;
			this.Interprete = Interprete;
			this.temas = temas;
			this.duracionCD = duracionCD;
			this.tenemos = tenemos;
			this.comentarioCD = comentarioCD;
			this.generoCD = generoCD;
		}
		
		private ArrayList<DVD_CD> listaDvds;
		
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
		
		// Mostrar dvds que tengo
		public ArrayList<DVD_CD> listaTengo(){
			// Creamos una lista para almacenar Dvds que tengo
			ArrayList<DVD_CD> tengo = new ArrayList<>();
						
			for (int i=0; i<listaDvds.size(); i++) {
				
				if(listaDvds.get(i).isTener()) {
					
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
			return tengo;
		}
		
		
		private ArrayList<DVD_CD> listaDVD_CD;
		
		// Metodo para eliminar un cd
		public boolean eliminarDVD_CD(String titulo) {
				
			for(int i=0; i < listaDVD_CD.size(); i++) {
					
				if(listaDVD_CD.get(i).getTitulo_Album().equals(titulo)) { // Comparacion de cadenas de texto
						/*
						 * listaDvds.get(i) obtiene el objeto en la posicion i de la lista
						 * getTitulo() obtiene el titulo del obj DVD, devuelve cadena con el titulo
						 * equals(titulo) compara cadena de getTitulo con el parametro recibido(titulo)
						 */
						
					listaDVD_CD.remove(i);
						
					return true;
					}
				}
			return false;
			}
		// Devuelve lista de todos los CDs del catalogo
		public ArrayList<DVD_CD> listarTodos() { // Metodo de retorno es ArrayList<DVD>, devuelve lista de objetos DVD
				
			for(int i=0; i< listaDVD_CD.size(); i++) {
					
				System.out.println(listaDVD_CD.get(i).toString());
			}
			if (listaDVD_CD.size() == 0) {
				System.out.println("No hay nada");
			}
				
			return listaDVD_CD;
			}
		// Lista cd que tengo
		public ArrayList<DVD_CD> listarTengo(){
				
			ArrayList<DVD_CD> tengo = new ArrayList<>();
				
			for (int i=0; i< listaDVD_CD.size(); i++) {
					
				if (listaDVD_CD.get(i).isTenemos()) {
						
					tengo.add(listaDVD_CD.get(i));
						
					System.out.println(listaDVD_CD.get(i).toString());
				}
				else {
					System.out.println("No lo tiene");
				}
			}
			if (listaDVD_CD.size() == 0) {
				System.out.println("No tiene nada");
			}
			return listaDVD_CD;
		}
		// Cantidad total de dvds 
				public int cantidadTotal() {
					
					return listaDVD_CD.size();
				}
				
				// Cantidad de dvds que tengo
				public int cantidadTengo() {
					
					return listarTengo().size();
				}
		
		// Titulo
		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		
		// Genero
		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}
		
		// Director
		public String getDirector() {
			return director;
		}
		
		public void setDirector(String director) {
			this.director = director;
		}
		
		// Duracion
		public int getDuracion() {
			return duracion;
		}
		
		public void setDuracion(int duracion) {
			this.duracion = duracion;
		}
		
		// Tenemos el DVD
		public boolean isTener() {
			return tener;
		}

		public void setTener(boolean tener) {
			this.tener = tener;
		}
		
		// Comentario
		public String getComentario() {
			return comentario;
		}

		public void setComentario(String comentario) {
			this.comentario = comentario;
		}

		@Override
		public String toString() {
		    return "Titulo = " + titulo + "\nGenero = " + genero + "\nDirector = " + director + "\nDuracion = " + duracion
		            + "\nTener = " + tener + "\nComentario = " + comentario;
		}
		
		// Titulo CD
		public String getTitulo_Album() {
			return titulo_Album;
		}

		public void setTitulo_Album(String titulo_Album) {
			this.titulo_Album = titulo_Album;
		}

		// Interprete CD
		public String getInterprete() {
			return Interprete;
		}

		public void setInterprete(String interprete) {
			Interprete = interprete;
		}

		// Temas CD
		public int getTemas() {
			return temas;
		}

		public void setTemas(int temas) {
			this.temas = temas;
		}

		// Duracion CD
		public int getDuracionCD() {
			return duracionCD;
		}

		public void setDuracionCD(int duracion) {
			this.duracionCD = duracion;
		}

		// Si lo Tenemos CD
		public boolean isTenemos() {
			return tenemos;
		}

		public void setTenemos(boolean tenemos) {
			this.tenemos = tenemos;
		}

		// Comentario CD
		public String getComentarioCD() {
			return comentarioCD;
		}

		public void setComentarioCD(String comentario) {
			this.comentarioCD = comentario;
		}

		// Genero CD
		public String getGeneroCD() {
			return generoCD;
		}

		public void setGeneroCD(String genero) {
			this.generoCD = genero;
		}

		public void mostrarCD() {
			System.out.println("Titulo del CD = " + titulo_Album + "\nInterprete = " + Interprete + "\nTemas = " + temas + "\nDuracion =  "
					+ duracion + "\nTenemos = " + tenemos + "\nComentario = " + comentario + "\nGenero = " + genero); 
		}
		

}
