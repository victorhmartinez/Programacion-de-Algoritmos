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
//Clase alumno que hereda de la clase Persona
public class Alumno extends Persona{
    //Atributod
public int nota;
    //Constructor vacio
    public Alumno() {
    }
    //Constructor que recibe parametros 
    public Alumno(int nota, String nombre, char sexo, int edad) {
        //Inicializamos los atributos de la clase padre
        super(nombre, sexo, edad);
        //Inicializamos los atributos propios de la clase
        this.nota = nota;
    }
   //Metodos especiales set y get para obtener y establecer los valores
    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        
          if (nota <= 10 )
         this.nota= nota;
      else
         throw new IllegalArgumentException(
            "La nota no debe ser mayor  de 10" );
    }
    //metodos para saber la disponibilidad del alumno
    @Override
    public void disponibilidad() {
        metodos m= new metodos();
        //le asignamos a una varibale tipo int el valor q devuelve el metodo 
        //GenerarNumero
        int prob=m.generaNumeroAleatorio(0, 100);
        //if el numero generado es menor de 50 
        if(prob<50){
            //asignamos a la asistencia falsa
            super.setAsistencia(false);
        }else{//En caso de q no sea
            //Asiganamos la asistencia true
            super.setAsistencia(true);
        }
    }

    @Override
    //metodo to String
    public String toString() {
        return "Nombre: "+getNombre()+" Sexo:"+getSexo()+" Nota:" + nota;
    }
    
    
}
