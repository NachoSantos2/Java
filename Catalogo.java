package dvd;

// Importamos Arraylist
import java.util.ArrayList;

public class Catalogo {

	private ArrayList<DVD> listaDvds;
	
	// Constructor, inicializa campo listaDvds como un arrayList
	public Catalogo() {
		
		listaDvds = new ArrayList<>();
	}
	
	// Metodo para agregar dvd (lo agrega al final del array)
	public void agregarDVD(DVD dvd) {
		
		listaDvds.add(dvd);
		
	}
	
	// Metodo para eliminar un dvd
	public void eliminarDVD(String titulo) {
		
		for(int i=0; i < listaDvds.size(); i++) {
			
			if(listaDvds.get(i).getTitulo().equals(titulo)) { // Comparacion de cadenas de texto
				/*
				 * listaDvds.get(i) obtiene el objeto en la posicion i de la lista
				 * getTitulo() obtiene el titulo del obj DVD, devuelve cadena con el titulo
				 * equals(titulo) compara cadena de getTitulo con el parametro recibido(titulo)
				 */
				
				listaDvds.remove(i);
				
			}
		}
	}
	
	// Modificar los valores de los atributos conociendo el titulo
	public void modificarDVD(String titulo, String genero, int duracion, boolean tengo, String comentario) {
		
		for(int i=0; i<listaDvds.size(); i++) {
			
			if (listaDvds.get(i).getTitulo().equals(titulo)) {
				
				DVD dvd = listaDvds.get(i); // permite obtener el objeto DVD para su modificacion
				
				dvd.setGenero(genero);
				dvd.setDuracion(duracion);
				dvd.setTener(tengo);
				dvd.setComentario(comentario);
				
			}
		}
		
	}
	
	
	
}
