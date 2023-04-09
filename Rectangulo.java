package figurasPlanas;

public class Rectangulo extends Figura{
	
	private int base;
	private int altura;
	public Rectangulo(String nombre ,int base, int altura) {
		super(nombre);
		this.base = base;
		this.altura = altura;
	}
	
	public int area() {
		
		return base*altura;
	}

	@Override
	public String toString() {
		
		return  nombre + ", " + "area: " +area();

	}
	
	

}
