/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller_Guiado;


public class Seres_Habladores {
    //Parametros que comparte la clase padre
    public String nombre;
    public String estado;
    //constructor vacios
    public Seres_Habladores() {
    }
    //Constructor conparametros
    public Seres_Habladores(String nombre, String estado) {
        this.nombre = nombre;
        this.estado= estado;
    }
    // Metodos Especialea get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    //Metodo hablar que se hereda par todas sus clases hijas
    public String hablar(){
        
       return  "Hola me llamo " + getNombre()+" y se hablar \nSoy "+estado ;
        
    }
}
