package Ejercicio_5_Herencia;

import java.util.ArrayList;

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
		return "Titulo = " + titulo + "/nGenero = " + genero + "/nDirector = " + director +"/nDuracion = " + duracion
				+ "/nTenemos = " + tenemos + "/nComentario = " + comentario + "]";
	}
	
	// DVDs de un determinado director
		public void listarTodosDvdDeUnDirector(String director) {
			for(Discos dvd_a_mostrar : this.listaDvds) { //De un lado se escribe el objeto y dsp de que lista extraer los objetos 
				if(((DVD) dvd_a_mostrar).getDirector().equals(director)) {
					System.out.println(dvd_a_mostrar.toString() + "\n");
				
				}
			}			
		}
		
	
}
