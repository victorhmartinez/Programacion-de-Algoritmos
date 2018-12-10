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
 
    

    public Persona() {
    }

    public Persona(String nombre, char sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        
        disponibilidad();
    }
    

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
   if (edad >= 80 )
         this.edad= edad;
      else
         throw new IllegalArgumentException(
            "La edad de un estudiante no debe ser mayo a 80 años" );
    }
    

    public boolean isAsistencia() {
        
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public abstract void disponibilidad();

    

}
