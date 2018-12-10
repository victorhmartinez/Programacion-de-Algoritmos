/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller_Guiado;

/**
 *
 * @author Usuario
 */
public class Atacantes extends Jugadores_Futbol{
    public int pases;
    public int recuperaciones;

    public Atacantes() {
    }

    public Atacantes(int pases, int recuperaciones, String dorsal, int nro_Camiseta, int nro_goles,String posicion) {
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
        int valoracion=super.valoracionGoles();
         valoracion=valoracion+(getPases()*2)+(getRecuperaciones()*3);
         return valoracion;
    }
    
}
