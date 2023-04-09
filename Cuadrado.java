package figurasPlanas;

public class Cuadrado extends Rectangulo{

	private int lado;
	
	public Cuadrado(String n, int lado) {
		
		super(n, lado,lado);
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	
}
