package Ejercicio_5_Herencia;

import java.util.*;

public class Discos {
	
	// ATRIBUTOS COMPARTIDOS
	protected String titulo;
	protected String genero;
	protected int duracion;
	protected boolean tenemos;
	protected String comentario;
	
	// CONSTRUCTOR DE LA SUPER
	public Discos(String titulo, String genero, int duracion, boolean tenemos, String comentario) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.tenemos = tenemos;
		this.comentario = comentario;
	}
	
	public Discos() {
		
	}
	
	// GETTERS Y SETTERS
	public String getTitulo() {
		return titulo;
	}			

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean isTenemos() {
		return tenemos;
	}

	public void setTenemos(boolean tenemos) {
		this.tenemos = tenemos;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Titulo = " + titulo + "/nGenero = " + genero + "/nDuracion = " + duracion + "/nTenemos = " + tenemos
				+ "/nComentario = " + comentario + "]";
	}

	// CREACION DE ARRAYLIST
	public static ArrayList<Discos> listaDiscos = new ArrayList<>();
	public  ArrayList<Discos> listaDvds = new ArrayList<>();
	public static ArrayList<Discos> listaCds = new ArrayList<>();
	
	// CREACION DE SCANNER
	public static Scanner sc = new Scanner(System.in);
	
	
	// METODO PARA AGREGAR UN DVD O CD
	// Metodo para agregar dvd (lo agrega al final del array)
	public void agregarDisco(){
		System.out.println("Ingrese el tipo de disco que desea añadir:");
		System.out.println("1. DVD");
		System.out.println("2. CD");
		int opcion = sc.nextInt();
		while (opcion < 1 || opcion > 2) {
			
			 System.out.println("Opción inválida, vuelve a ingresar (1/2): ");
			 opcion = sc.nextInt();
			 
		}

		        if (opcion == 1) { //TRABAJAREMOS CON DVDS
		      
		        	System.out.print("Ingrese un titulo para el dvd: ");
					sc.nextLine();
					String título= sc.nextLine();
					System.out.print("Ingrese el genero del dvd: ");
					String género= sc.nextLine();
					System.out.print("Ingrese el nombre del director: ");
					String director= sc.nextLine();
					System.out.print("Ingrese la duracion en minutos del dvd: ");
					int duracion= sc.nextInt();
					sc.nextLine();
					System.out.print("¿Tiene el dvd?");
					String respuesta = sc.nextLine();
					boolean tenemos = respuesta.equalsIgnoreCase("S") || respuesta.equalsIgnoreCase("Si");
					System.out.print("Ingrese un comentario: ");
					String comentario= sc.nextLine();
		        	
					DVD dvd= new DVD(título, género, director, duracion, tenemos, comentario); //CREACION DE OBJETO DVD
					listaDiscos.add(dvd); //AÑADO DISCO A ARRAYLIST DE DISCOS
					listaDvds.add(dvd); //AÑADO DISCO A ARRAYLIST DE DVDS PARA FUTURO USO
					
					System.out.println("Dvd ingresado correctamente");
		        
		        } else if (opcion == 2) { //TRABAJAREMOS CON CDS
		        	
		        	System.out.print("Ingrese un titulo para el CD: ");
					sc.nextLine();
					String título= sc.nextLine();
					System.out.print("Ingrese el genero del CD: ");
					String género= sc.nextLine();
					System.out.print("Ingrese el nombre del interprete: ");
					String interprete= sc.nextLine();
					System.out.print("Ingrese la duracion en minutos del CD: ");
					int duración= sc.nextInt();
					sc.nextLine();
					System.out.print("Ingrese la cantidad de temas que tiene el CD: ");
					int cantidadTemas = sc.nextInt();
					sc.nextLine();
					System.out.print("¿Tiene el CD?");
					String respuesta = sc.nextLine();
					boolean tenemos = respuesta.equalsIgnoreCase("S") || respuesta.equalsIgnoreCase("Si");
					System.out.print("Ingrese un comentario: ");
					String comentario= sc.nextLine();
					
					CD cd = new CD(título, comentario, género, duración, tenemos, interprete, cantidadTemas); //CREACION DE OBJETO CD
		        
					listaDiscos.add(cd);
					listaCds.add(cd);
					
					System.out.println("Cd ingresado correctamente");
		      
		        } else {
		            System.out.println("Opción inválida, vuelve a ingresar (1/2): ");
		        }
		        
			}
	/*
	 * 
	 * public void agregarDiscos(String titulo, String genero, int duración, boolean tenemos, String comentario) {
		Discos.listaDiscos.add(new Discos(titulo,genero, duración, tenemos,comentario)); //Asi creo y añado parametros a un nuevo dvd 
	}
	 * 
	 */
	
	
	
	// Metodo para eliminar un dvd
		public boolean eliminarDiscos(String titulo) {
			
			for(int i=0; i < listaDiscos.size(); i++) {
				
				if(listaDiscos.get(i).getTitulo().equals(titulo)) { // Comparacion de cadenas de texto
					/*
					 * listaDvds.get(i) obtiene el objeto en la posicion i de la lista
					 * getTitulo() obtiene el titulo del obj DVD, devuelve cadena con el titulo
					 * equals(titulo) compara cadena de getTitulo con el parametro recibido(titulo)
					 */
					
					listaDiscos.remove(i);
					System.out.println("El titulo se elimino con exito");
					
					return true;
				}
				else {
					System.out.println("Titulo invalido");
				}
			}
			return false;
		}
		
		/*
		 * otro metodo de eliminacion de disco
		 * 
		 * 	public void eliminarDisco(String título) { //Es estatico pues no retorna nada 
			boolean eliminado= false; //Variable booleana que se utiliza para indicar si se ha eliminado algo
			for(int i= 0; i< lista_discos.size(); i++) { //Para i=0, menor a largo del array, aumentar i en cada vuelta
				DiscoHerencia disco= lista_discos.get(i); //Se obtiene la posicion i del objeto dvd en el array 
				if(disco.getTítulo().equals(título)) { //Se compara el titulo del objeto dvd con el titulo que se paso como parametro
					lista_discos.remove(i); //Si lo encuentra lo elimina
					eliminado= true; //Eliminado= true
					System.out.println("Titulo eliminado correctamente");
					break;	
				}
			}
			if(!eliminado) { //"Si es verdadero que no esta eliminado" Si dsp del ciclo for eliminado sigue =false, significa que no existe el titulo 
				System.out.println("Disco inexistente"); //Con esto te ahorras poner un if y else. En el if iria - eliminado correctamente-  y en el else - no se encontro disco - 
			}
		}
		
		 */

		// Modificar los valores de los atributos conociendo el titulo
	public void modificarDiscos(String titulo) {
			
		System.out.println("Ingrese el tipo de disco que desea modificar:");
	    System.out.println("Ingrese 1 para DVD");
	    System.out.println("Ingrese 2 para CD");
	    int modificar = sc.nextInt(); //declaracion e inicializacion de variable a modificar
			
	    while (modificar < 1 || modificar > 2) {
				
			System.out.println("Opción inválida, vuelve a ingresar (1/2): ");
			modificar = sc.nextInt();
				 
		}
			
		if (modificar == 1) {
				
			
			for(int i=0; i<listaDvds.size(); i++) {
				
				if (listaDvds.get(i).getTitulo().equals(titulo)) {
					
					Discos dvd = listaDvds.get(i); // permite obtener el objeto DVD para su modificacion
					
					System.out.println("Desea modificar el titulo ");
					System.out.print("Ingrese el nuevo titulo: ");
					Scanner teclado = new Scanner(System.in);
					String tit = teclado.nextLine();
					dvd.setTitulo(tit);
					
					System.out.print("Ingrese genero a modificar: ");
					String genero = teclado.nextLine();
					dvd.setGenero(genero);
					
					System.out.println("Ingrese nuevo director: ");
					String director = teclado.nextLine();
					((DVD) dvd).setDirector(director);
					
					System.out.print("Ingrese duracion a modificar: ");
					int duracion = teclado.nextInt();
					dvd.setDuracion(duracion);
					
					System.out.print("Quiere modificar si lo tenemos o no? [true/false] ");
					boolean tengo = teclado.nextBoolean();
					teclado.nextLine();
					dvd.setTenemos(tengo);
					
					System.out.print("Ingrese comentario a modificar: ");
					String comentario = teclado.nextLine();
					dvd.setComentario(comentario);
					
				}
			}
		}
		
		if (modificar == 2) {
			
			
		
			for(int i=0; i<listaCds.size(); i++) {
				
				if (listaCds.get(i).getTitulo().equals(titulo)) {
						
					Discos cd = listaCds.get(i); // permite obtener el objeto DVD para su modificacion
						
					System.out.println("Desea modificar el titulo ");
					System.out.print("Ingrese el nuevo titulo: ");
					Scanner teclado = new Scanner(System.in);
					String tit = teclado.nextLine();
					cd.setTitulo(titulo);
						
					System.out.print("Ingrese el interprete: ");
					String interprete = teclado.nextLine();
					((CD) cd).setInterprete(interprete);
						
					System.out.print("Ingrese el tema a modificar (cantidad de temas): ");
					int tema = teclado.nextInt();
					((CD) cd).setTemas(tema);
					
					System.out.print("Ingrese duracion a modificar: ");
					int duracion = teclado.nextInt();
					cd.setDuracion(duracion);
						
					System.out.print("Quiere modificar si lo tenemos o no? [true/false] ");
					boolean tengo = teclado.nextBoolean();
					teclado.nextLine();
					cd.setTenemos(tengo);
						
					System.out.print("Ingrese comentario a modificar: ");
					String comentario = teclado.nextLine();
					cd.setComentario(comentario);
					
					System.out.print("Ingrese genero a modificar: ");
					String genero = teclado.nextLine();
					cd.setGenero(genero);
						
					}
			}
				
		}
	}
	

		// LISTA TODOS AMBOS DISCOS 
		public void listarTodos() {
			System.out.println("Ingrese el tipo de disco que desea modificar:");
		    System.out.println("Ingrese 1 para DVD");
		    System.out.println("Ingrese 2 para CD");
		    int listarTodos = sc.nextInt();
				
		    while (listarTodos < 1 || listarTodos > 2) {
					
				System.out.println("Opción inválida, vuelve a ingresar (1/2): ");
				listarTodos = sc.nextInt();
					 
			}
		    
		    if(listarTodos == 1) {
		    
		        for (Discos dvd : listaDvds) {
		            System.out.println(dvd);
		        }
			        if(listaDvds.size() == 0) {
			        	System.out.println("No hay ningun dvd");
			        }
		    }
		    
		    if(listarTodos == 2) {
		    	
		        for(int i=0; i< listaCds.size(); i++) {
					
					System.out.println(listaCds.get(i).toString());
				}
				if (listaCds.size() == 0) {
					System.out.println("No hay ningun cd");
				}
		    }
	    }
		
		
		// LISTA QUE TENGO
		public void listarTengo() {
			System.out.println("Ingrese el tipo de disco que desea modificar:");
		    System.out.println("Ingrese 1 para DVD");
		    System.out.println("Ingrese 2 para CD");
		    int listarTengo = sc.nextInt();
				
		    while (listarTengo < 1 || listarTengo > 2) {
					
				System.out.println("Opción inválida, vuelve a ingresar (1/2): ");
				listarTengo = sc.nextInt();
					 
			}
		    
		    if(listarTengo == 1) {
		    	
		    	ArrayList<Discos> tengo = new ArrayList<>();
				
				for (int i=0; i<listaDvds.size(); i++) {
					
					if(listaDvds.get(i).isTenemos()) {
						
						tengo.add(listaDvds.get(i));
						
						System.out.println(listaDvds.get(i).toString());
					}
					else {
						System.out.println("No lo tiene");
					}
				}
				if(listaDvds.size() == 0) {
					System.out.println("No hay ningun dvd");
				}
		    }
		    
		    if(listarTengo == 2) {
		    	
		    	ArrayList<Discos> tengo = new ArrayList<>();
				
				for (int i=0; i< listaCds.size(); i++) {
						
					if (listaCds.get(i).isTenemos()) {
							
						tengo.add(listaCds.get(i));
							
						System.out.println(listaCds.get(i).toString());
					}
					else {
						System.out.println("No lo tiene");
					}
				}
				if (listaCds.size() == 0) {
					System.out.println("No tiene nada");
				}
		    }
		}
		
	// METODO PARA LISTAR POR DURACION MAXIMA
		public ArrayList<Discos> listaDuracion(int duracionMaxima){
			System.out.println("Ingrese el tipo de disco que desea modificar:");
		    System.out.println("Ingrese 1 para DVD");
		    System.out.println("Ingrese 2 para CD");
		    int durMax = sc.nextInt();
				
		    while (durMax < 1 || durMax > 2) {
					
				System.out.println("Opción inválida, vuelve a ingresar (1/2): ");
				durMax = sc.nextInt();
					 
			}
		    if(durMax == 1) {
		    	
				ArrayList<Discos> duracion = new ArrayList<>();
				
				for (int i=0; i<listaDvds.size(); i++) {
					
					if(listaDvds.get(i).getDuracion() <= duracionMaxima) {
						
						duracion.add(listaDvds.get(i));
						System.out.println(listaDvds.toString());
					}
				}
				return duracion;
		    }
		    
		    if(durMax == 2) {
		    	ArrayList<Discos> duracion = new ArrayList<>();
				
				for (int i=0; i<listaCds.size(); i++) {
						
					if(listaCds.get(i).getDuracion() <= duracionMaxima) {
							
						duracion.add(listaCds.get(i));
						System.out.println(listaCds.toString());
					}
				}
				return duracion;
		    }
			return null;
		   
		}
		
	// METODO PARA LISTAR POR TITULO
		public void listarDiscosAlfabeticamente() {
			   List<String> titulosDiscos = new ArrayList<String>(); //
			    for (Discos disco : listaDiscos) {
			        titulosDiscos.add(disco.getTitulo());
			    }
			    titulosDiscos.sort(null); // Ordena la lista alfabéticamente
			    for (String titulo : titulosDiscos) {
			        for (Discos disco : listaDiscos) {
			            if (disco.getTitulo().equals(titulo)) {
			                System.out.println(disco.toString()); // Imprime todos los atributos del Disco
			                System.out.println("------------------------------");
			                break;
			            }
			        }
			    }
		}
	
				
	// METODO PARA MOSTRAR LA CANTIDAD TOTAL DE DISCOS 
	public int cantidadTotal() {
			
		return listaDiscos.size();
	}
	
	// METODO PARA MOSTRAR LA CANTIDAD QUE TENGO
	public int cantidadTengo() {
		
		int cantidaTengo = 0;
		for(int i=0; i<listaDiscos.size(); i++) {
			
			if(listaDiscos.get(i).isTenemos()) {
				
				cantidaTengo++;
			}
		}
		return cantidaTengo;
	}
	
}