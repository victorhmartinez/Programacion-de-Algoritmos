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
public class Profesor extends Persona{
    public String materias;

    public Profesor() {
    }

    public Profesor(String materias, String nombre, char sexo, int edad) {
        super(nombre, sexo, edad);
        this.materias = materias;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }
    

    @Override
    public void disponibilidad() {
        metodos m = new metodos();
     int prob=m.generaNumeroAleatorio(0, 100);
    if(prob<50){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }
    }
    
}
