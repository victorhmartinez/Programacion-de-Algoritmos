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
public class Perro  extends Animales_Domesticos{
    public String comida;

    public Perro(String comida, String raza, double precio) {
        super(raza, precio);
        this.comida = comida;
    }

    public Perro() {
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
    public double calcular(){
        double precioBase=this.precio;
        if (comida.equals("Lata")) {
            precioBase+=((precioBase*10)/100);
            return precioBase;
        }else{
            return precioBase;
        }
    }
}
