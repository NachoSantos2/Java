package Ejercicio_1;

// IMPORTAMOS RAMNDOM Y SCANNER
import java.util.Scanner;
import java.util.Random;

public class Cubo {

	// ATRIBUTO CUBO TRIDIMENSIONAL	
	private int cubo [][][];

	// CONSTRUCTOR
	public Cubo(int filas, int columnas, int profundidad) {
		if (filas <= 0 || columnas <= 0 || profundidad <=0) {
			  throw new IllegalArgumentException("Las dimensiones del cubo deben ser mayores a 0.");
			}
		cubo = new int [filas][columnas][profundidad];
		cargarAleatoriamente();
		}
	
	// CARGA ALEATORIA 
	public void cargarAleatoriamente() {
		Random random = new Random();
		for(int i = 0; i < cubo.length; i++) {
			for(int j = 0; j < cubo.length; j++) {
				for(int k = 0; k < cubo.length; k++) {
					cubo[i][j][k] = random.nextInt(101); // valores de 0 a 100
				}
			}
		}
	}
	
	// CARGAR
	public void cargar(int fila, int columna, int profundidad, int valor) {
		if (fila < 0 || fila >= cubo.length || columna < 0 || columna >= cubo[0].length || profundidad < 0 || profundidad >= cubo[0][0].length) {
			throw new IllegalArgumentException("Coordenadas fuera de rango.");
		}
		
		if(valor == 0) {
			//funcion anular
		}else if (cubo[fila][columna][profundidad] == 0){
			cubo[fila][columna][profundidad] = valor;
			
		}else {
			//funcion modificar
		}
	}
	
	// ANULAR
	public void anular(int fila, int columna, int profundidad) {
		if (fila < 0 || fila >= cubo.length || columna < 0 || columna >= cubo[0].length || profundidad < 0 || profundidad >= cubo[0][0].length) {
			throw new IllegalArgumentException("Coordenadas fuera de rango.");
		}
		cubo[fila][columna][profundidad] = 0;
	}
	
	// MODIFICAR
	public void modificar(int fila, int columna, int profundidad, int nuevoValor) {
		if (fila < 0 || fila >= cubo.length || columna < 0 || columna >= cubo[0].length || profundidad < 0 || profundidad >= cubo[0][0].length) {
			throw new IllegalArgumentException("Coordenadas fuera de rango.");
	    }
		if(cubo[fila][columna][profundidad] != 0) {
			cubo[fila][columna][profundidad] = nuevoValor;
		}else {
			cargar(fila,columna, profundidad, nuevoValor);
		}
	}
	
	// funcion que devuelve valor, 
	public int valor(int fila, int columna, int profundidad) {
		if (fila < 0 || fila >= cubo.length || columna < 0 || columna >= cubo[0].length || profundidad < 0 || profundidad >= cubo[0][0].length) {
			throw new IllegalArgumentException("Coordenadas fuera de rango.");
	    }
		return cubo[fila][columna][profundidad];
	}
	
	// mostrar nulos bucles y luego if con iteradores = 0 print numeors
	
	// main
}
