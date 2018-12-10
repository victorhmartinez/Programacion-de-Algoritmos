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
public class Gato extends Animales_Domesticos {
    public String garras;

    public Gato(String garras, String raza, double precio) {
        super(raza, precio);
        this.garras = garras;
    }

    public String getGarras() {
        return garras;
    }

    public void setGarras(String garras) {
        this.garras = garras;
    }
    public double calcular(){
        double precioB = this.precio;
        if(garras.equals("Con Garras")){
            precioB-=((precioB*5)/100);
        return precioB;
        }
        
        return precioB;
    }
}
