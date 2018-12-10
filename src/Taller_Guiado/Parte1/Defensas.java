
package Taller_Guiado;


public class Defensas extends Jugadores_Futbol{
    public int pases;
    public int recuperaciones;

    public Defensas() {
    }

    public Defensas(int pases, int recuperaciones, String dorsal, int nro_Camiseta, int nro_goles,String posicion) {
        super(dorsal, nro_Camiseta, nro_goles,posicion);
        this.pases = pases;
        this.recuperaciones = recuperaciones;
    }

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getRecuperaciones() {
        return recuperaciones;
    }

    public void setRecuperaciones(int recuperaciones) {
        this.recuperaciones = recuperaciones;
    }
    @Override
    public int valoracionGoles(){
        int valor=super.valoracionGoles();
        valor=valor+(getPases())+(getRecuperaciones()*4);
        return  valor;
    }
    
}
