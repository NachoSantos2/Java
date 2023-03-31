package arreglos;

public class For_each {
	
	public static void main(String[] args) {
		
		String[] nombres = {"nacho", "ignacio", "nachotaxx"};
		
		/*
		for(int i = 0; i<nombres.length; i++) {
			
			System.out.println(nombres[i]);
		}
		*/
		
		for(String i:nombres) {
			System.out.println("Nombres: " +i);
		}
	}

}
