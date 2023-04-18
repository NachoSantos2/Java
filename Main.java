package polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		// arranco de la clase base(universidad), no se pueden instanciar objetos de una clase abstracta
		Universidad ub = new Profesor("Juan Perez", 12345678, 34, "programacion", 12, 5000);
		
		// ub es el objeto polimormico
		// diferentes objetos corresponden al mismo mensaje
		System.out.println("sueldo profesor: " + ub.pago());
		System.out.println(ub);
		
		ub = new Alumno("Franco", 765678987, 20, "ing.informatica", 80000, 2387583);
		System.out.println("Cuota alumno: " + ub.pago());
		System.out.println(ub);
		
		ub = new Administrador("victor", 2343211, 50, 43421);
		System.out.println("Sueldo administrador: "+ ub.pago());
		System.out.println(ub);
		
	}
}
