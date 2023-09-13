package ListasLineales;

import java.util.Scanner;

public class Main {

	static int op;
	static Scanner sc = new Scanner(System.in);
    static int menuActual = 0; // 0 para el menú principal, 1 para el menú secundario de LISTATOT, 2 para el menú secundario de LISTANOD

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
                menuActual = 1;
                listaTot();
            } else if (op == 2) {
                menuActual = 2;
                listaNod();
            } else if (op == 3) {
                System.out.println("Saliendo del programa.");
                break;
				
			}
		} while(true);
		
	}
	
	public static void listaTot() {
		
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
					LISTATOT<String> listaTot2 = new LISTATOT<>();
					do{
						System.out.println("Menú:");
						System.out.println("1. Insertar un elemento");
						System.out.println("2. Insertar un elemento en una posicion especifica");
			            System.out.println("3. Localizar un elemento");
			            System.out.println("4. Eliminar un elemento");
			            System.out.println("5. Eliminar elemento de una determinada posicion");
			            System.out.println("6. Ordenar los elementos");
			            System.out.println("7. Lista vacia?");
			            System.out.println("8. Mostrar lista");	          
			            System.out.println("9. Unirlas");
			            System.out.println("10. Salir");
			            System.out.println("Ingese opcion: ");
			            op = sc.nextInt();
			            
			            while(op > 10 || op < 1) {
			            	System.out.print("Ingrese una opcion nuevamente: ");
			            	op = sc.nextInt();
			            }
						
						switch(op) {
						
							case 1: 
								System.out.print("Ingrese elemento a agregar: ");
								sc.nextLine();
								String elemento2 = sc.nextLine();					
								listaTot2.agregarElemento(elemento2);
								System.out.println("Elemento " + elemento2 + " agregado con exito");
								break;
							
							case 2:
								System.out.print("Ingrese elemento a agregar: ");
								sc.nextLine();
								String elemento3 = sc.nextLine();
								System.out.print("Ingrese posicion donde agregar el elemento: ");
								int posicion2 = sc.nextInt();
								sc.nextLine();
								listaTot2.agregarElementoEnPosicion(posicion2, elemento3);
								System.out.println("Elemento: " + elemento3 + " agregado en la posicion: " + posicion2 + " con exito" );
								break;
								
							case 3:
								System.out.print("Ingrese elemento a localizar: ");
								sc.nextLine();
								String localizar2 = sc.nextLine();
								int localizado2 = listaTot2.localizarElemento(localizar2);
								System.out.println("Elemento localizado en la posicion: " + localizado2);
								break;
							
							case 4:
								System.out.print("Ingrese elemento a eliminar: ");
								sc.nextLine();
								String eliminar2 = sc.nextLine();
								listaTot2.eliminarElemento(eliminar2);
								System.out.println("Elemento " + eliminar2 + " eliminado con exito");
								break;
								
							case 5:
								System.out.println("Ingrese la posicion del elemento que desea eliminar: ");
								int posicionEliminar2 = sc.nextInt();
								listaTot2.eliminarElementoEnPosicion(posicionEliminar2);
								System.out.println("Posicion y elemento eliminadas con exito");
								break;
								
							case 6:
								listaTot2.ordenarElementos();
								System.out.println("Lista ordenada: ");
								listaTot2.mostrarLista();
								break;
								
							case 7:
								if(listaTot2.esVacia()) {
									
									System.out.println("La lista esta vacia");
								}
								else {
									System.out.println("La lista contiene elementos");
								}
								break;
							
							case 8:
								System.out.println("Lista: ");
								listaTot2.mostrarLista();
								break;
							case 9:
								listaTot.unir(listaTot2);
								break;
							case 10:
								System.out.println("Lista: ");
								listaTot.mostrarLista();
								break;
						}
					}while(op != 12);
				case 9:
					
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
					menuActual = 0; // Restablece op a 0 antes de volver al menú principal
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
            System.out.println("8. Salir");
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
                	op = 0; // Restablece op a 0 antes de volver al menú principal
                    return; // Salir de listaNod() y volver al menú principal
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (true);

	}
}