package cd;

public class DVD {
	
	// Atributos de los DVD
	private String titulo;
	private String genero;
	private String director;
	private int duracion;
	private boolean tener;
	private String comentario;
	
	// Constructor DVD
	/**
	 * 
	 * @param titulo
	 * @param genero
	 * @param duracion
	 * @param tener
	 * @param comentario
	 */
	public DVD(String titulo, String genero,String director, int duracion, boolean tener, String comentario) {
		this.titulo = titulo;
		this.genero = genero;
		this.director = director;
		this.duracion = duracion;
		this.tener = tener;
		this.comentario = comentario;
	}
	
	public DVD(String titulo,String comentario) {
		
		this.titulo = titulo;
		this.comentario = comentario;
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
	    return "DVD [titulo=" + titulo + ", genero=" + genero + ", director=" + director + ", duracion=" + duracion
	            + ", tener=" + tener + ", comentario=" + comentario + "]";
	}
}
