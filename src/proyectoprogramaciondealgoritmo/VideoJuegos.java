
package proyectoprogramaciondealgoritmo;


public class VideoJuegos extends Producto{
    //Parametors de clase video Juego
    public String categoria;
    //Creamos un constructor vacio
    public VideoJuegos() {
    }
    //Creamos constructor que recibe parametros
    public VideoJuegos(String categoria, String nombre, double precioUnit, int cantStock) {
        //Heredamos los parametros de la clase parametros
        super(nombre, precioUnit, cantStock);
        // Inicianilizamos  los parametros
        this.categoria = categoria;
    }
//Metodos especiales set y get .
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    //Metodo  toString q hereda de la clase padre para realizar sus operaciones
    public String toString() {
        String ms = super.toString();
        return  ms+ "\nCategoria : " + categoria ;
    }
    
}
