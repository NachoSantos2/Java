package polimorfismo;

public abstract class Universidad {

	// ATRIBUTOS COMPARTIDOS
	protected String nombre;
	protected int dni;
	protected int edad;
	
	// CONSTRUCTOR 
	public Universidad(String nombre, int dni, int edad) {
		super(); // desiende de la clase base object
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}

	// GET Y SETTERS
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// TOSTRING
	public String toString() {
		
		return nombre+ ", " +dni+", "+edad+"\n";
	}
	
	public abstract double pago();
	
}
