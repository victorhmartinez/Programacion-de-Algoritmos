package proyectoprogramaciondealgoritmo;

public class Producto {

	// Attributos
	private String nombre;
	private double precioUnit;
	private int cantStock;
	private boolean disponible = false;
	public static int dimensioArray;

	// Constructor vacio
	public Producto() {
	}
        //Constructor q recibe parametros
	public Producto(String nombre, double precioUnit, int cantStock,
			boolean disponible) {
		this.nombre = nombre;
		this.precioUnit = precioUnit;
		this.cantStock = cantStock;
		this.disponible = disponible;

		dimensioArray++;
	}

	//Metodos especiales  get and set
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioUnit() {
		return this.precioUnit;
	}

	public void setPrecioUnit(double precioUnit) {
		this.precioUnit = precioUnit;
	}

	public int getCantStock() {
		return this.cantStock;
	}

	public void setCantStock(int cantStock) {
		this.cantStock = cantStock;
	}

	public boolean isDisponible() {
            //Usamos un if para ver si la cantidad disponible es maoyr q cerp
		if (getCantStock() > 0){
                    this.disponible = true; // le asignamos true
                }			
		return this.disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
// Metodo toString
	@Override
	public String toString() {
		return "\nNombre: " + this.getNombre() + "\n" + "Precio unidad: "
				+ this.getPrecioUnit() + " $ \n" + "En Stock: "
				+ this.getCantStock();
	}

   
}
