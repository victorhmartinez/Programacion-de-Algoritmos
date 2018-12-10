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
public class Pez extends Animales_Domesticos{
    public String agua;

    public Pez(String agua, String raza, double precio) {
        super(raza, precio);
        this.agua = agua;
    }

    public Pez() {
    }

    public String getAgua() {
        return agua;
    }

    public void setAgua(String agua) {
        this.agua = agua;
    }
    public double calcular(){
        double precioFinal=precio;
        if (agua.equals("Dulce")) {
            precioFinal+=((precioFinal*20)/100);
            return  precioFinal;
        }
        return precioFinal;
    }
}
