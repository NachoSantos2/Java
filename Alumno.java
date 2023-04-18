package polimorfismo;

public class Alumno extends Universidad{

	// ATRIBUTOS DEL ALUMNO
	private String carrera;
	private double cuota;
	private int matricula;
	
	// CONSTRUCTOR
	public Alumno(String nombre, int dni, int edad, String carrera, double cuota, int matricula) {
		super(nombre, dni, edad);
		this.carrera = carrera;
		this.cuota = cuota;
		this.matricula = matricula;
	}

	// GETTERS Y SETTERS
	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String toString() {
		
		return nombre + ", " + carrera + ", cuota: "+ pago();
	}

	@Override
	public double pago() {
		
		return cuota;
	}
	
	
}
