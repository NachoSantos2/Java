package Ejercicio_5_Herencia;

import java.util.ArrayList;


public class CD extends Discos{
	
	// ATRIBUTOS ADICIONALES DE CD
	private String interprete;
	private int temas;
	
	// CONSTRUCTOR CD
	public CD(String titulo, String genero, String comentario, int duracion, boolean tenemos, String interprete, int temas) {
		super(titulo, genero, duracion, tenemos, comentario);
		this.interprete = interprete;
		this.temas = temas;
	}
	
	public CD() {
		
	}

	protected String getInterprete() {
		return interprete;
	}

	protected void setInterprete(String interprete) {
		this.interprete = interprete;
	}

	protected int getTemas() {
		return temas;
	}

	protected void setTemas(int temas) {
		this.temas = temas;
	}

	@Override
	public String toString() {
		return "CD [interprete=" + interprete + ", temas=" + temas + ", titulo=" + titulo + ", genero=" + genero
				+ ", duracion=" + duracion + ", tenemos=" + tenemos + ", comentario=" + comentario + "]";
	}
	
	// Listar por interprete
		public ArrayList<Discos> listarInterprete(String interprete){
				
			ArrayList<Discos> inter = new ArrayList<>();
				
			for (int i=0; i< listaCds.size(); i++) {
					
				if (((CD) listaCds.get(i)).getInterprete().equals(interprete)) {
						
					inter.add(listaCds.get(i));
						
					System.out.println(listaCds.get(i).toString());
					
				}
			}
			return listaCds;
		}

		//12.METODO EXCLUSIVO CD - MOSTRAR CANTIDAD DE TEMAS DE UN CD 
		
		public void temasCd(String título){
			 int cantidadTemas = 0;
			 System.out.println("El título ingresado es: " + título);
			 
			 for (int i = 0; i < listaCds.size(); i++) { //Ciclo for para recorrer el arrays de cds
				 CD cd = (CD) listaCds.get(i); // "Crea una variable llamada 'cd' de tipo 'CdHerencia' y asigna a esa variable el valor del objeto en la posición 'i' del ArrayList 'lista_cds' usando el método 'get'".
			     if (cd.getTitulo().equalsIgnoreCase(título)) { 
			            cantidadTemas = ((CD) cd).getTemas();
			            System.out.println("La cantidad de temas del CD es de : " + cantidadTemas);
			        }
			    }
			    if (cantidadTemas == 0) { //Si la cantidad de temas es = 0, el cd no existe 
			        System.out.println("CD inexistente"); 
			    }
			}

}
