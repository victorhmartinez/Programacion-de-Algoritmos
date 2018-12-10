/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_Excepciones.Banco;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ahorro extends Banco{
    public double dineroActual;
    Scanner leer = new Scanner(System.in);

    public Ahorro(double dineroActual, String nombre, int nroCuenta) {
        super(nombre, nroCuenta);
        setdineroActual(dineroActual);
    }

   

    public Ahorro() {
    }

    public double getdineroActual() {
        return dineroActual;
    }

    public void setdineroActual(double dineroActual) {
       
            this.dineroActual = dineroActual;
         if (dineroActual >= 0.0 )
         this.dineroActual= dineroActual;
      else
         throw new IllegalArgumentException(
            "Su balance  debe ser mayor de 0.0" );
        
    }
     @Override
    public double retirar(double retira){
      if(getdineroActual()>0.0&&getdineroActual()>retira){
            System.out.println("Retiro con exito");
            double retiro= getdineroActual()-retira;
            setdineroActual(retiro);
            return getdineroActual();
      }else {
            System.out.println("unsted no puede sobregirar su cuenta");
            return 0.0;
      }
    }
    @Override
    public double depositar(double deposita){
        
        double deposito=getdineroActual()+deposita;
       
        setdineroActual(deposito);
        
        return getdineroActual();
    }
    @Override
    public double obtenerBalanceActual(){
        if (getdineroActual()<=0.0) {
           
            return 0.0;
        }else{
            setdineroActual(getdineroActual()+calcularInteres());
            return getdineroActual();
            
        }
 
    }
  
    public double calcularInteres(){
        double interes;
        System.out.println("Ingrese el interes");
        interes=leer.nextDouble();
        interes=interes /100;
        
        return getdineroActual()*interes;
    }

    @Override
    public String toString() {
        return  super.toString()+"\nDinero en su cuenta : "+getdineroActual();
    }

    

 

 

    
}
