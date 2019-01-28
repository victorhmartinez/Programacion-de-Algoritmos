/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenParcialV1_2;

/**
 *
 * @author Usuario
 */
public class Candidatos {
    public String nombre;
    public int sumaL;
    public int sumaM;
    public int sumaZ;

    public Candidatos() {
    }

    public Candidatos(String nombre, int sumaL, int sumaM, int sumaZ) {
        this.nombre = nombre;
        this.sumaL = sumaL;
        this.sumaM = sumaM;
        this.sumaZ = sumaZ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSumaL() {
        return sumaL;
    }

    public void setSumaL(int sumaL) {
        this.sumaL = sumaL;
    }

    public int getSumaM() {
        return sumaM;
    }

    public void setSumaM(int sumaM) {
        this.sumaM = sumaM;
    }

    public int getSumaZ() {
        return sumaZ;
    }

    public void setSumaZ(int sumaZ) {
        this.sumaZ = sumaZ;
    }
    
    
}
