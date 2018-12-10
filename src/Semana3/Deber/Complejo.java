/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3.Deber;

/**
 *
 * @author Usuario
 */
public class Complejo {
   
  //Atributos de clase
    private double parteReal;
    private double parteImaginaria;
    //Constructores

    public Complejo() {
    }

    public Complejo(double real, double imaginaria) {
        this.parteReal = real;
        this.parteImaginaria = imaginaria;
    }
    //Metodos set y get

    public double getParteReal() {
        return parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }
   
    //Suma: (a,b)+(c,d)=(a+c,b+d)

    public void suma(Complejo c) {
        this.parteReal = this.getParteReal() + c.getParteReal();
        this.parteImaginaria += c.getParteImaginaria();
    }
    //Resta: (a,b)-(c,d)=(a-c,b-d)

    public void resta(Complejo c) {
        this.parteReal -= c.getParteReal();
        this.parteImaginaria -= c.getParteImaginaria();
    }

    @Override
    public String toString() {
        return "(" + parteReal + ","
                + parteImaginaria + ")";
    }

   

}

    

