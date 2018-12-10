
package Semana3.Deber;


public class Factura {

    //Declaracion de las variables de instancia.
    public String numPieza;
    public String descripPieza;
    public int cantArticulo;
    public double precioArticulo;
    //Creacion del metodo constructor para la inicilizacion de los atributos
    public Factura(String numPieza, String descripPieza, int cantArticulo, double precioArticulo) {
        this.numPieza = numPieza;
        this.descripPieza = descripPieza;
        this.setCantArticulo(cantArticulo);
        this.setPrecioArticulo(precioArticulo);
    }
    //Creacion de un contructor de manera obligatoria por la existencia de un conturctor de recibe parametros
    public Factura() {
    }
    
    //Obtiene el numero de pieza 
    public String getNumPieza() {
        return numPieza;     
    }//Fin del metodo getNumPieza
    
    //Asigna el numero de Pieza a una Factura
    public void setNumPieza(String numPieza) {
        this.numPieza = numPieza;
    }//fin del metodo setNumPieza
    
    // Obtiene la descripcion de la pieza 
    public String getDescripPieza() {
        return descripPieza;
    }//Fin del metodo getDescripcionPieza.

    // Asigna la descripcion de la pieza a una Factura
    public void setDescripPieza(String descripPieza) {
        this.descripPieza = descripPieza;
    }//Fin del metodo setDescripcionPieza;

    //Obtiene la cantidad de artiuclos comprados
    public int getCantArticulo() {
        return cantArticulo;
    }// Fin del Metodo getCantArticuclo.

    //Establece la cantidad de artiuclos a una factura cumpliendo con una restriccion
    public void setCantArticulo(int cantArticulo) {
        //No pueden haber cantidades negativas.Se le asigna automaticamente 0.
        this.cantArticulo = (cantArticulo < 0) ? 0 : cantArticulo; 
    }//Fin del metodo setCantArticulo

    //Se obtiene el precio del Articulo
    public double getPrecioArticulo() {
        return precioArticulo;
    }// fin del metodo getPrecioArtiuclo.

    //Establece el precio  del  articulos cumpliendo con una restriccion
    public void setPrecioArticulo(double precioArticulo) {
        //No pueden haber precios negativos .Se le asigna automaticamente 0.
        this.precioArticulo = (precioArticulo < 0) ? 0.0 : precioArticulo;
    }//Fin del metodo setPrecioArticulo

    //Metodo toString para presentar los valores de los objetos.
    @Override
    public String toString() {
        return "Factura" + "\nNúmero de factura: " + numPieza + "\nDescripcion : " + descripPieza + "\nCantidad:" + cantArticulo + "\nPrecio del Producto : " + precioArticulo + '}';
    }//Fin del metodo toString

    // Metodo MontoFactura para obtener la cantidad total de los producto
    public double MontoFactura() {
        //Se multiplica la cantida obtenida * el precio del articulo obtenido.
        double montoTotal;
        montoTotal = getCantArticulo() * getPrecioArticulo();
        //Se devuelve el valor de tipo double
        return montoTotal;
    }

}
