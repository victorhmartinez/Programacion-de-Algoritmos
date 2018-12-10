/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_Excepciones.Clase;

/**
 *
 * @author Usuario
 */
public class Aula {
    public int indicador;
    public String dedicada;
    public int nuemroMaximo;
   

    public Aula(int indicador, String dedicada, int nuemroMaximo) {
        this.indicador = indicador;
        this.dedicada = dedicada;
        this.nuemroMaximo = nuemroMaximo;
     
    }

    public int getIndicador() {
        return indicador;
    }

    public void setIndicador(int indicador) {
        this.indicador = indicador;
    }

    public String getDedicada() {
        return dedicada;
    }

    public void setDedicada(String dedicada) {
        this.dedicada = dedicada;
    }

    public int getNuemroMaximo() {
        return nuemroMaximo;
    }

    public void setNuemroMaximo(int nuemroMaximo) {
        this.nuemroMaximo = nuemroMaximo;
    }



   
    
            
}
