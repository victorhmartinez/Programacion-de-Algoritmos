/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenParcial;

/**
 *
 * @author Usuario
 */
public class Animales_Domesticos {
    public String raza;
    public double  precio;

    public Animales_Domesticos(String raza, double precio) {
        this.raza = raza;
        this.precio = precio;
    }

    public Animales_Domesticos() {
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
