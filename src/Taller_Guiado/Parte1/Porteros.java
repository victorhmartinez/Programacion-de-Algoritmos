
package Taller_Guiado;


public class Porteros extends Jugadores_Futbol{
    public int paradas;

    public Porteros() {
    }

    public Porteros(int paradas, String nombre, int nro_Camiseta, int nro_goles,String posicion) {
        super(nombre, nro_Camiseta, nro_goles,posicion);
        this.paradas = paradas;
    }

    public int getParadas() {
        return paradas;
    }

    public void setParadas(int paradas) {
        this.paradas = paradas;
    }
    @Override
    public  int valoracionGoles(){
    int valor = super.valoracionGoles();
    valor = valor*(getParadas()*5);
    return valor;
}
    
}
