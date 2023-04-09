package figurasPlanas;

public class Main {

	public static void main(String[] args) {
		
		Figura f[] = {new Rectangulo("Rectangulo 1",1,2), new Cuadrado("Cuadrado 1",5),
				new Cuadrado("Cuadrado 2", 5)};
		
		for(int i=0; i<f.length; i++) {
			
			System.out.println(f[i]);
		}
	}
}
