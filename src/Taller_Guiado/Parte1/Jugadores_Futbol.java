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
public class Jugadores_Futbol {
    public String nombre;
    public int nro_Camiseta;
    public int nro_goles;
    public String posicion;

    public Jugadores_Futbol() {
    }
    

    public Jugadores_Futbol(String nombre, int nro_Camiseta, int nro_goles,String posicion) {
        this.nombre = nombre;
        this.nro_Camiseta = nro_Camiseta;
        this.nro_goles = nro_goles;
    }
    

    public String getDorsal() {
        return nombre;
    }

    public void setDorsal(String dorsal) {
        this.nombre = dorsal;
    }

    public int getNro_Camiseta() {
        return nro_Camiseta;
    }

    public void setNro_Camiseta(int nro_Camiseta) {
        this.nro_Camiseta = nro_Camiseta;
    }

    public int getNro_goles() {
        return nro_goles;
    }

    public void setNro_goles(int nro_goles) {
        this.nro_goles = nro_goles;
    }
    public int valoracionGoles(){
        int valoracion;
        valoracion=getNro_goles()*30;
        return valoracion;
    }
}
