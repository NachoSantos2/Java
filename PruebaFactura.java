package ferreteria;

public class PruebaFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creamos un objeto
		Factura f1 = new Factura(1111, 2222, "Destornillador", 0, 0);
		
		System.out.println("El numero de la factura es: " + f1.getnFactura());
		System.out.println("El numero de articulo es: " + f1.getnArt());
		System.out.println("La descripcion del articulo es: " + f1.getDescArt());
		System.out.println("La cantidad de ariculos es: " + f1.getCantArt());
		System.out.println("El precio por aticulo es: " + f1.getPrecioXArt());
		
		// Nos devuelve el total de la factura, cant x precio
		f1.obtenerMontoFactura();
		
	}

}
