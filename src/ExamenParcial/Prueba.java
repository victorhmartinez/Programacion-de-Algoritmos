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
public class Prueba {
    public static void main(String[] args) {
        Pez peces = new Pez("Dulce","Globo", 60.0);
        Perro perro = new Perro("Lata", "Runa", 60.0);
        Gato gato = new Gato("Con Garras", "Nose", 60.0);
        System.out.println("El precio del Pez"+peces.calcular());
        System.out.println("El precio del perro es"+perro.calcular());
        System.out.println("El precio dl gato es "+gato.calcular());
    }
}
