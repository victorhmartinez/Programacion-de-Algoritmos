/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_Excepciones.Banco;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public abstract class Banco {
    Scanner leer = new Scanner(System.in);
    public String nombre;
    public int nroCuenta;
    
    

    public Banco() {
    }

    public Banco(String nombre, int nroCuenta) {
        this.nombre = nombre;
        this.nroCuenta = nroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }
    public abstract double depositar(double deposita);
       
    public abstract double retirar(double retira);
   
    public abstract double obtenerBalanceActual();

    @Override
    public String toString() {
        return "Cuenta de" + "\nNombre : " + getNombre() + "\n Numero de Cuenta : " + getNroCuenta();
    }
 
    
}
