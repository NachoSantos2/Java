package ferreteria;

public class Factura {
	
	// Variables de instancia
	private int nFactura;
	private int nArt;
	private String descArt;
	private int cantArt;
	private double precioXArt;
	
	// Constructor con el que harcodearemos los datos
	public Factura(int nFactura, int nArt, String descArt, 
			int cantArt, double precioXArt) {
		
		this.nFactura = nFactura;
		this.nArt = nArt;
		this.descArt = descArt;
		this.cantArt = cantArt;
		this.precioXArt = precioXArt;
		
	}
	
	// Numero de Factura
	public int getnFactura() {
		return nFactura;
	}

	public void setnFactura(int nFactura) {
		this.nFactura = nFactura;
	}
	// Numeros de articulo
	public int getnArt() {
		return nArt;
	}

	public void setnArt(int nArt) {
		this.nArt = nArt;
	}
	// Descripcion del articulo
	public String getDescArt() {
		return descArt;
	}

	public void setDescArt(String descArt) {
		this.descArt = descArt;
	}
	// Cantidad de articulos
	public int getCantArt() {
		return cantArt;
	}

	public void setCantArt(int cantArt) {
		
		if (cantArt > 0) {
			
			this.cantArt = cantArt;	
		}else {
			
			this.cantArt = 0;
		}
		
	}
	// Precio por articulo
	public double getPrecioXArt() {
		return precioXArt;
	}

	public void setPrecioXArt(double precioXArt) {
		
		if (precioXArt > 0) {
			
			this.precioXArt = precioXArt;
			
		}else {
			
			this.precioXArt = 0.0;
			
		}
		
	}
	
	// Metodo para obtener el monto de la factura
	public double obtenerMontoFactura() {
		
		double montoFactura = cantArt * precioXArt;
		
		System.out.println("El monto de la factura es: " + montoFactura);
		
		return montoFactura;
		
		
	}
	
}
