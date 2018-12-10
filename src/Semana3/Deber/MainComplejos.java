/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3.Deber;

/**
 *
 * @author Usuario
 */
public class MainComplejos {
     public static void main(String[] args) {

        Complejo n1 = new Complejo(2, 8);
        Complejo n2 = new Complejo(8, 9);

        System.out.print("Suma de numeros Complejos: " + n1   + " + " + n2 + " = ");
        n1.suma(n2);
        System.out.println(n1 + "\n");

        System.out.print("Resta de números complejos: " + n1 + " - " + n2 + " = ");
        n1.resta(n2);
        System.out.println(n1 + "\n");

    }
}
