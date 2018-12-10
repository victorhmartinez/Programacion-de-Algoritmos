/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller_Guiado;

/**
 *
 * @author Usuario
 */
public class Loro extends Seres_Habladores{
//Parametro unico del lorpo
    public String edad;
//Inicializacion del constructor con parametro de el y de la clase padre
    public Loro(String estado, String edad, String nombre) {
        //Inicializacion de los paremetros de la clase padre
        super(nombre,estado);     
        this.edad = edad;
    }
//constructor basio
    public Loro() {
    }
    
//Metodos especiales
    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    @Override
    //Metodo habalr de calse
    public String hablar (){
        //metodo que Herada de la clase padre
        String ms=super.hablar();
        return ms+"\n"+edad;
    }
}
