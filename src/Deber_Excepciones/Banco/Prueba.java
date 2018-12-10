/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_Excepciones.Banco;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Prueba {

    

    public static void main(String[] args) {
        Banco cuentaAho = new Ahorro(15, "juan", 123);
       Banco cuentaCheues = new Cheques(15,"Pedro", 192);
       Banco cuentaPlatino = new Platino(12, "Ernesto", 152);
       //Cuentas de cheques
       cuentaCheues.retirar(20);
       cuentaCheues.depositar(5);
        System.out.println("Su balnce es de : "+cuentaCheues.obtenerBalanceActual());
        System.out.println(cuentaCheues);
        //Cuenta de ahorros
        cuentaAho.depositar(10);
        cuentaAho.retirar(45);
        System.out.println("su balance es de "+cuentaAho.obtenerBalanceActual());
        System.out.println(cuentaAho);
        //Cuenta Platino
        cuentaPlatino.depositar(52);
        cuentaPlatino.retirar(60);
        System.out.println("Su balnce es de "+cuentaPlatino.obtenerBalanceActual());
        System.out.println(cuentaPlatino);
    }
}
