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
public class Alumno extends Persona{
public int nota;

    public Alumno() {
    }

    public Alumno(int nota, String nombre, char sexo, int edad) {
        super(nombre, sexo, edad);
        this.nota = nota;
    }

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

    @Override
    public void disponibilidad() {
        metodos m= new metodos();
        int prob=m.generaNumeroAleatorio(0, 100);
        if(prob<50){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+" Sexo:"+getSexo()+" Nota:" + nota;
    }
    
    
}
