package ListasLineales;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class Main {

	static int op;
	static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.println("Bienvenido al producto Listas Lineales!!");
            System.out.println("Menu: ");
            System.out.println("1. Implementar una lista lineal con linkedList");
            System.out.println("2. Implementar una lista lineal con nodos");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            while (op > 3 || op < 1) {
                System.out.print("Ingrese una opcion nuevamente: ");
                op = sc.nextInt();
            }
            if (op == 1) {
                listaTot();
            } else if (op == 2) {
                listaNod();
            } else if (op == 3) {
                System.out.println("Saliendo del programa.");
                break;
				
			}
		} while(true);
		
	}
	
	public static <S> void listaTot() {
		
		LISTATOT<String> listaTot = new LISTATOT<>();
		
		do {
			System.out.println("Menú:");
			System.out.println("1. Insertar un elemento");
			System.out.println("2. Insertar un elemento en una posicion especifica");
            System.out.println("3. Localizar un elemento");
            System.out.println("4. Eliminar un elemento");
            System.out.println("5. Eliminar elemento de una determinada posicion");
            System.out.println("6. Ordenar los elementos");
            System.out.println("7. Copiar la lista");
            System.out.println("8. Unir varias listas");
            System.out.println("9. Dividir en sublistas");
            System.out.println("10. Lista vacia?");
            System.out.println("11. Mostrar lista");
            System.out.println("12. Volver al menu principal");
            
			System.out.print("Seleccione una opción: ");
			op = sc.nextInt();
			
			while(op > 12 || op < 1) {
            	System.out.print("Ingrese una opcion nuevamente: ");
            	op = sc.nextInt();
            }
			
			switch(op) {
			
				case 1: 
					System.out.print("Ingrese elemento a agregar: ");
					sc.nextLine();
					String elemento = sc.nextLine();					
					listaTot.agregarElemento(elemento);
					System.out.println("Elemento " + elemento + " agregado con exito");
					break;
				
				case 2:
					System.out.print("Ingrese elemento a agregar: ");
					sc.nextLine();
					String elemento1 = sc.nextLine();
					System.out.print("Ingrese posicion donde agregar el elemento: ");
					int posicion = sc.nextInt();
					sc.nextLine();
					listaTot.agregarElementoEnPosicion(posicion, elemento1);
					System.out.println("Elemento: " + elemento1 + " agregado en la posicion: " + posicion + " con exito" );
					break;
					
				case 3:
					System.out.print("Ingrese elemento a localizar: ");
					sc.nextLine();
					String localizar = sc.nextLine();
					int localizado = listaTot.localizarElemento(localizar);
					System.out.println("Elemento localizado en la posicion: " + localizado);
					break;
				
				case 4:
					System.out.print("Ingrese elemento a eliminar: ");
					sc.nextLine();
					String eliminar = sc.nextLine();
					listaTot.eliminarElemento(eliminar);
					System.out.println("Elemento " + eliminar + " eliminado con exito");
					break;
					
				case 5:
					System.out.println("Ingrese la posicion del elemento que desea eliminar: ");
					int posicionEliminar = sc.nextInt();
					listaTot.eliminarElementoEnPosicion(posicionEliminar);
					System.out.println("Posicion y elemento eliminadas con exito");
					break;
					
				case 6:
					listaTot.ordenarElementos();
					System.out.println("Lista ordenada: ");
					listaTot.mostrarLista();
					break;
				
				case 7:
					listaTot.copiar();
					System.out.println("Lista copiada");
					break;
					
				case 8:
				    LISTATOT<String> otraLista = new LISTATOT<>();
				    boolean seguirAgregando = true;				    
				    while (seguirAgregando) {
				        System.out.print("Ingrese elemento para la nueva lista (o F para finalizar): ");
				        sc.nextLine();
				        String elementoNuevo = sc.nextLine();
				        
				        if (elementoNuevo.equals("F")) {
				            seguirAgregando = false;
				        } else {
				            otraLista.agregarElemento(elementoNuevo);
				        }
				    }
				    
				    listaTot.unirListas(otraLista.copiar()); // Unir otraLista a listaTot
				    System.out.println("Listas unidas con éxito.");
				    break;
				    
				case 9:
				    System.out.print("Ingrese el tamaño de las sublistas: ");
				    int tamanoSublista = sc.nextInt();
				    
				    if (tamanoSublista <= 0 || tamanoSublista > listaTot.copiar().size()) {
				        System.out.println("Tamaño de sublista no válido.");
				    } else {
				        LinkedList<LinkedList<String>> sublistas = listaTot.dividirEnSublistas(tamanoSublista);
				        
				        for (int i = 0; i < sublistas.size(); i++) {
				            System.out.println("Sublista " + (i + 1) + ":");
				            LinkedList<String> sublista = sublistas.get(i);
				            for (String subelemento : sublista) {
				                System.out.println(subelemento);
				            }
				        }
				    }
				    break;
				case 10:
					if(listaTot.esVacia()) {
						
						System.out.println("La lista esta vacia");
					}
					else {
						System.out.println("La lista contiene elementos");
					}
					break;
				case 11:
					System.out.println("Lista: ");
					listaTot.mostrarLista();
					break;
				case 12:
					op = 0;
                    return; // Salir de listaTot() y volver al menú principal
			}
			
		}while(op !=12);	
		
	}
	
	public static void listaNod() {
		LISTANOD<String> lista = new LISTANOD<>();
		
		do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar elemento al principio");
            System.out.println("2. Insertar elemento en posición");
            System.out.println("3. Localizar un elemento");
            System.out.println("4. Eliminar elemento");
            System.out.println("5. Mostrar lista");
            System.out.println("6. Copiar la lista");
            System.out.println("7. Verificar si la lista está vacía");
            System.out.println("8. Ordenar lista");
            System.out.println("9. Unir varias listas");
            System.out.println("10. Dividir en sublistas");
            System.out.println("11. Salir");
            System.out.print("Seleccione una opción: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar: ");
                    sc.nextLine(); // Consumir el salto de línea anterior
                    String elementoAlPrincipio = sc.nextLine();
                    lista.agregarAlPrincipio(elementoAlPrincipio);
                    System.out.println("Elemento agregado al principio.");
                    break;
                case 2:
                    System.out.print("Ingrese el elemento a insertar: ");
                    sc.nextLine(); // Consumir el salto de línea anterior
                    String elementoInsertar = sc.nextLine();
                    System.out.print("Ingrese la posición donde insertar: ");
                    int posicionInsertar = sc.nextInt();
                    lista.insertarElemento(elementoInsertar, posicionInsertar);
                    System.out.println("Elemento insertado en la posición " + posicionInsertar + ".");
                    break;
                case 3:
                    System.out.print("Ingrese el elemento a localizar: ");
                    sc.nextLine(); // Consumir el salto de línea anterior
                    String elementoLocalizar = sc.nextLine();
                    boolean encontrado = lista.localizarElemento(elementoLocalizar);
                    if (encontrado) {
                        System.out.println("Elemento encontrado en la lista.");
                    } else {
                        System.out.println("Elemento no encontrado en la lista.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el elemento a eliminar: ");
                    sc.nextLine(); // Consumir el salto de línea anterior
                    String elementoEliminar = sc.nextLine();
                    lista.eliminarElemento(elementoEliminar);
                    System.out.println("Elemento eliminado de la lista.");
                    break;
                case 5:
                    System.out.println("Elementos de la lista:");
                    lista.mostrar();
                    break;
                case 6:
                    LISTANOD<String> copia = lista.copiar();
                    System.out.println("Lista copiada.");
                    System.out.println("Elementos de la lista copiada:");
                    copia.mostrar();
                    break;
                case 7:
                    if (lista.listaVacia()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        System.out.println("La lista no está vacía.");
                    }
                    break;
                case 8:
                	lista.ordenarElementos();
                    System.out.println("Lista ordenada correctamente.");
                    break;
                case 9:
                	LinkedList<LISTANOD<String>> listas = new LinkedList<>();

            	    System.out.print("Ingrese la cantidad de listas a unir: ");
            	    int cantidadListas = sc.nextInt();
            	    sc.nextLine();

            	    for (int i = 0; i < cantidadListas; i++) {
            	        System.out.print("Ingrese un nombre para la lista " + (i + 1) + ": ");
            	        String nombreLista = sc.nextLine();
            	        LISTANOD<String> lista2 = new LISTANOD<>();
            	        
            	        // Usar un do-while para permitir al usuario ingresar elementos
            	        do {
            	            System.out.print("Ingrese un elemento para la lista " + (i + 1) + " (o escriba 'fin' para finalizar): ");
            	            String elementoLista = sc.nextLine();
            	            if (!elementoLista.equalsIgnoreCase("fin")) {
            	                lista.agregarAlPrincipio(elementoLista);
            	            } else {
            	                break; // Salir del bucle cuando se escriba 'fin'
            	            }
            	        } while (true);
            	        
            	        listas.add(lista);
            	    }
            	    
            	    lista.unirListas(listas);
            	    
            	    lista.mostrar();
            	    
            	    break;
                case 10:
                	System.out.print("Ingrese el numero de sublistas: ");
                	int nSublistas = sc.nextInt();
                	
                	List<LISTANOD<String>> sublistas = lista.dividirEnSublistas(nSublistas);

                    // Mostrar las sublistas resultantes
                    for (int i = 0; i < nSublistas; i++) {
                        System.out.println("Sublista " + (i + 1) + ":");
                        sublistas.get(i).mostrar();
                    }
                    
                	break;
                case 11:
                	op = 0; // Restablece op a 0 antes de volver al menú principal
                    return; // Salir de listaNod() y volver al menú principal
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (true);

	}
}