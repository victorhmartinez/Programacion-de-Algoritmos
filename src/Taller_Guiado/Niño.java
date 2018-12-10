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
public class Niño extends Perosna{
    public String FechaNaci;

    public Niño(String FechaNaci, int edad, String grado, String nombre, String estado) {
        super(edad, grado, nombre, estado);
        this.FechaNaci = FechaNaci;
    }

    public Niño() {
    }
    

    public String getFechaNaci() {
        return FechaNaci;
    }

    public void setFechaNaci(String FechaNaci) {
        this.FechaNaci = FechaNaci;
    }
 
    @Override
    public String hablar (){
       String ms=super.hablar();
       return ms+"\nTengo "+edad+" años \nSoy "+grado+"\n"+FechaNaci;
    }
}
