package craps;

public class Craps {
	
	// Generacion Dados
	int dado1 = (int)(Math.random()*6+1);
	int dado2 = (int)(Math.random()*6+1);
	
	int sumaDados = dado1 + dado2;
	
	
	// Metodo
	public void juego() {
		
		while (true)  {
	
		if (sumaDados == 7 || sumaDados == 11) {
			
			System.out.println("La suma es: " + sumaDados);
			
			System.out.println("Ha GANADO!!!");
			
			break;
			
		}
		if (sumaDados == 2 || sumaDados == 3 || sumaDados == 12) {
			
			System.out.println("La suma es: " + sumaDados);
			
			System.out.println("Ha PERDIDO!!!");
			
			break;
		}
		// 4, 5, 6, 8, 9 o 10 
		else {
			
			System.out.println("La suma es: " + sumaDados);
			
			int punto = 0;
			//punto != sumaDados
			while (punto != sumaDados) {
				
				int nuevodado1 = (int)(Math.random()*6+1);
				int nuevodado2 = (int)(Math.random()*6+1);
				
				punto = nuevodado1 + nuevodado2;
				
				System.out.println("La nueva suma es: " + punto);
				
				if (punto == 4 || punto == 5 || punto == 6 || punto == 8 || punto == 9 || punto == 10 && punto != 7) {
					
					System.out.println("Ha GANADO!!! nas");
					break;
				}
				if (punto == 7) {
					
					System.out.println("Ha perdido");
					break;
				}
				
			}
			
		}
		break;
		}
		
	}
}