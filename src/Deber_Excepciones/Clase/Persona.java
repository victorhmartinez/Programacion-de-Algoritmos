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
public abstract class Persona {

    /*Atributos*/
    private String nombre;
    private char sexo;
    private int edad;
    public boolean  asistencia;
    //Constructor vacio
    public Persona() {
    }
     //Constructor que recibe parametros
    public Persona(String nombre, char sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        
        disponibilidad();
    }
    //Metodos especiales set y get para obtener y establecer los valores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        //Verificamos la edad que sea mayor de 80
   if (edad >= 80 )
         this.edad= edad;
      else
       //Con una excepcion controlamos que no se a mayor a 80
         throw new IllegalArgumentException(
            "La edad de un estudiante no debe ser mayo a 80 años" );
    }
    

    public boolean isAsistencia() {
        
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }
//Metodo abstracto
    public abstract void disponibilidad();

    

}
