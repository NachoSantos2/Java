package cd;

public class CD {
	// Atributos de la clase CD
	private String titulo_Album;
	private String Interprete;
	private int temas;
	private int duracion;
	private boolean tenemos;
	private String comentario;
	private String genero;
	
	// Constructor CD
	public CD(String titulo_Album,String Interprete,int temas,int duracion,boolean tenemos,String comentario,String genero) {
		
		this.titulo_Album = titulo_Album;
		this.Interprete = Interprete;
		this.temas = temas;
		this.duracion = duracion;
		this.tenemos = tenemos;
		this.comentario = comentario;
		this.genero = genero;
		
	}

	public String getTitulo_Album() {
		return titulo_Album;
	}

	public void setTitulo_Album(String titulo_Album) {
		this.titulo_Album = titulo_Album;
	}

	public String getInterprete() {
		return Interprete;
	}

	public void setInterprete(String interprete) {
		Interprete = interprete;
	}

	public int getTemas() {
		return temas;
	}

	public void setTemas(int temas) {
		this.temas = temas;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "CD [titulo_Album=" + titulo_Album + ", Interprete=" + Interprete + ", temas=" + temas + ", duracion="
				+ duracion + ", tenemos=" + tenemos + ", comentario=" + comentario + ", genero=" + genero + "]";
	}
	
	
}
