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
public class Adulto extends Perosna{
    int diaNa;
    String mesNa;
    int anioNa;

    public Adulto(int diaNa, String mesNa, int anioNa, int edad, String grado, String nombre, String estado) {
        super(edad, grado, nombre, estado);
        this.diaNa = diaNa;
        this.mesNa = mesNa;
        this.anioNa = anioNa;
    }
        public Adulto() {
    }

    public int getAnioNa() {
        return anioNa;
    }

    public void setAnioNa(int anioNa) {
        this.anioNa = anioNa;
    }

    public int getDiaNa() {
        return diaNa;
    }

    public void setDiaNa(int diaNa) {
        this.diaNa = diaNa;
    }

    public String getMesNa() {
        return mesNa;
    }

    public void setMesNa(String mesNa) {
        this.mesNa = mesNa;
    }
   
    @Override
    public String hablar (){
       String ms = super.hablar();
       return  ms+"\nTengo "+(2018-anioNa)+" Años"+"\nNaci el "+diaNa+" de "+mesNa+" del "+anioNa+"\nSoy "+grado;
    }

            
}
