package arreglos;

import java.util.*;
import javax.swing.JOptionPane;

public class Arreglos {
	// Como llenar una arreglo
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int nElementos;
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo:"));
		
		char [] letras = new char [nElementos];
		
		System.out.println("Digite los elementos del areglo: ");
		for(int i = 0; i < nElementos; i++) {
			
			System.out.println((i+1) + ", Digite un caracter: ");
			letras[i] = teclado.next().charAt(0);
			
		}
		
		System.out.println("\nLos caracteres del arreglo son: ");
		for(int i = 0; i < nElementos; i++) {
			
			System.out.print(letras[i]+" ");
		}
	}

}
