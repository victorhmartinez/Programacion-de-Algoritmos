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
    //Atributos de un clase banco
    public String nombre;
    public int nroCuenta;
    //Creacion de un constructor basio
    public Banco() {
    }
    //Creamos un constructor que recibe parametros
    public Banco(String nombre, int nroCuenta) {
        this.nombre = nombre;
        this.nroCuenta = nroCuenta;
    }
    //Metodos especiales set y get para obtener y establecer los valores
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
    //Metodos abtract 
    public abstract double depositar(double deposita);
       
    public abstract double retirar(double retira);
   
    public abstract double obtenerBalanceActual();
    //Metodo toString para presentar los datos de la cuenta
    @Override
    public String toString() {
        return "Cuenta de" + "\nNombre : " + getNombre() + "\n Numero de Cuenta : " + getNroCuenta();
    }
}
