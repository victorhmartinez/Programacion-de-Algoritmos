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
public class Perosna extends Seres_Habladores{
    //Parametros de unicos de una persona 
    public int edad;
    public String grado;
//Constructor de la clase Persona y de los parametros de la clase padre
    public Perosna(int edad, String grado, String nombre, String estado) {
        //Inicializacion de los Parametros de la clase padre
        super(nombre, estado);
        this.edad = edad;
        this.grado = grado;
    }
//Constructor vacio de la clase
    public Perosna() {
    }
//Metodos especiales
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getGrado() {
        return grado;
    }
    public void setGrado(String grado) {
        this.grado = grado;
    }
  
}
