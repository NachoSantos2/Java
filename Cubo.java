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

public int valor(int fila, int columna, int profundidad) {
        if (fila < 0 || fila >= cubo.length || columna < 0 || columna >= cubo[0].length || profundidad < 0 || profundidad >= cubo[0][0].length) {
            throw new IllegalArgumentException("Coordenadas fuera de rango.");
        }
        return cubo[fila][columna][profundidad];
    }

    public void mostrarNulos() {
        System.out.println("Posiciones anuladas:");
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    if (cubo[i][j][k] == 0) {
                        System.out.printf("(%d, %d, %d)%n", i, j, k);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        int columnas = scanner.nextInt();
        System.out.print("Ingrese la cantidad de profundidad: ");
        int profundidad = scanner.nextInt();

        Cubo cubo = new Cubo(filas, columnas, profundidad);

        int opcion;
        do {
            System.out.println("\nOperaciones disponibles:");
            System.out.println("1. Cargar valor");
            System.out.println("2. Modificar valor");
            System.out.println("3. Anular posición");
            System.out.println("4. Obtener valor");
            System.out.println("5. Mostrar posiciones anuladas");
            System.out.println("6. Recargar valores aleatorios");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese fila: ");
                    int fila = scanner.nextInt();
                    System.out.print("Ingrese columna: ");
                    int columna = scanner.nextInt();
                    System.out.print("Ingrese profundidad: ");
                    int prof = scanner.nextInt();
                    System.out.print("Ingrese valor: ");
                    int valor = scanner.nextInt();
                    cubo.cargar(fila, columna, prof, valor);
                    break;
                case 2:
                    System.out.print("Ingrese fila: ");
                    fila = scanner.nextInt();
                    System.out.print("Ingrese columna: ");
                    columna = scanner.nextInt();
                    System.out.print("Ingrese profundidad: ");
                    prof = scanner.nextInt();
                    System.out.print("Ingrese nuevo valor: ");
                    int nuevoValor = scanner.nextInt();
                    cubo.modificar(fila, columna, prof, nuevoValor);
                    break;
                case 3:
                    System.out.print("Ingrese fila: ");
                    fila = scanner.nextInt();
                    System.out.print("Ingrese columna: ");
                    columna = scanner.nextInt();
                    System.out.print("Ingrese profundidad: ");
                    prof = scanner.nextInt();
                    cubo.anular(fila, columna, prof);
                    break;
                case 4:
                    System.out.print("Ingrese fila: ");
                    fila = scanner.nextInt();
                    System.out.print("Ingrese columna: ");
                    columna = scanner.nextInt();
                    System.out.print("Ingrese profundidad: ");
                    prof = scanner.nextInt();
                    int valorObtenido = cubo.valor(fila, columna, prof);
                    System.out.println("Valor obtenido: " + valorObtenido);
                    break;
                case 5:
                    cubo.mostrarNulos();
                    break;
                case 6:
                    cubo.cargarAleatoriamente();
                    System.out.println("Valores aleatorios recargados.");
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
