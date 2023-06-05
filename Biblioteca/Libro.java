package Biblioteca;

public class Libro {
	// ATRIBUTOS
	protected String titulo, autor, editorial, genero; 
	protected int paginas, numISBN, edicion;
	//CONSTRUCTOR
	public Libro(String titulo, String autor, String editorial, String genero, int paginas, int numISBN, int edicion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.genero = genero;
		this.paginas = paginas;
		this.numISBN = numISBN;
		this.edicion = edicion;
	}
	
	public Libro() {
		
	}
	//GETTERS Y SETTERS
	protected String getTitulo() {
		return titulo;
	}
	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	protected String getAutor() {
		return autor;
	}
	protected void setAutor(String autor) {
		this.autor = autor;
	}
	protected String getEditorial() {
		return editorial;
	}
	protected void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	protected String getGenero() {
		return genero;
	}
	protected void setGenero(String genero) {
		this.genero = genero;
	}
	protected int getPaginas() {
		return paginas;
	}
	protected void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	protected int getNumISBN() {
		return numISBN;
	}
	protected void setNumISBN(int numISBN) {
		this.numISBN = numISBN;
	}
	protected int getEdicion() {
		return edicion;
	}
	protected void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", genero=" + genero
				+ ", paginas=" + paginas + ", numISBN=" + numISBN + ", edicion=" + edicion + "]";
	}
	
	
}
