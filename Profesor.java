package polimorfismo;

public class Profesor extends Universidad{
	
	// ATRIBUTOS DEL PROFESOR
	private String materia;
	private int horasCatedra;
	private double valorHora;
	
	// CONSTRUCTOR DE LA SUPERCLASE
	public Profesor(String nombre, int dni, int edad, String materia, int horasCatedra, double valorHora) {
		super(nombre, dni, edad);
		this.materia = materia;
		this.horasCatedra = horasCatedra;
		this.valorHora = valorHora;
	}

	// GET Y SETTERS
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getHorasCatedra() {
		return horasCatedra;
	}

	public void setHorasCatedra(int horasCatedra) {
		this.horasCatedra = horasCatedra;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public String toString() {
		
		return nombre + ", "+ materia + ", Sueldo: "+ pago();
	}

	// el abstract ya no va por sobre escritura de metodos
	@Override
	public double pago() {
		
		return horasCatedra * valorHora;
	}

	
}
