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
public class Profesor extends Persona {

    //Atributos de la clase
    public String materias;

    //Construtor vacio
    public Profesor() {
    }

    //Constructor que recibe parametros
    public Profesor(String materias, String nombre, char sexo, int edad) {
        //Inicializamos los atributos de la clase padre
        super(nombre, sexo, edad);
        //Inicializamos los atributos propios de la clase
        this.materias = materias;
    }
    //Metodos especiales set y get para obtener y establecer los valores

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    @Override
    public void disponibilidad() {
        //le asignamos a una varibale tipo int el valor q devuelve el metodo 
        //GenerarNumero
        metodos m = new metodos();
        //if el numero generado es menor del 20%
        int prob = m.generaNumeroAleatorio(0, 100);
        if (prob < 20) {
            //asignamos a la asistencia falsa
            super.setAsistencia(false);
        } else {//En caso de q no sea
            //Asiganamos la asistencia true
            super.setAsistencia(true);
        }
    }

}
