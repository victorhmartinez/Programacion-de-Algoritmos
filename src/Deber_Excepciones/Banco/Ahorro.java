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
//Clases ahorro hereda de la clase banco
public class Ahorro extends Banco{
    Scanner leer= new Scanner(System.in);
    //Atributo de la clase Ahorro
    public double dineroActual;
   //Creamos un constructor que recibe parametros
    public Ahorro(double dineroActual, String nombre, int nroCuenta) {
        //heredamos el constructor de la clase padre e inicializamos
        super(nombre, nroCuenta);
        //Inicializamos dineroActual con el metodo setDineroActual
        setdineroActual(dineroActual);
    }
    //Creamos contructor vacio
    public Ahorro() {
    }
    //Metodos Especiales set y get para obtener y establecer los diferentes valores
    public double getdineroActual() {
        return dineroActual;
    }

    public void setdineroActual(double dineroActual) {
     //Usamos un if para saber la cantidad de dinero
         if (dineroActual >= 0.0 )
         this.dineroActual= dineroActual;
      else//Usamos una excepcion para contralar el balnce sea menor a 0
         throw new IllegalArgumentException(
            "Su balance  debe ser mayor de 0.0" );
        
    }
    //Metodos de la clase
     @Override
     //metodo retirar
    public double retirar(double retira){
        //veerificamos si la cantidad de dinero es mayor a la q va retirar y si
        //es mayor a 0
      if(getdineroActual()>0.0&&getdineroActual()>retira){
            System.out.println("Retiro con exito");
            double retiro= getdineroActual()-retira;
            setdineroActual(retiro);
            return getdineroActual();
      }else {//en caso de que no se cumpla la condicion mandamos un mensaje de 
          //Error  
            System.out.println("Usted no puede sobregirar su cuenta");
            return 0.0;
      }
    }
    @Override
    //Metodo depositar que recibe como paremtros un variable tipo doubel
    public double depositar(double deposita){
        
        double deposito=getdineroActual()+deposita;
       
        setdineroActual(deposito);
        
        return getdineroActual();
    }
    @Override
    //Meetodo de la clase padre obtenerBalance
    public double obtenerBalanceActual(){
        if (getdineroActual()<=0.0) {
           
            return 0.0;
        }else{
            setdineroActual(getdineroActual()+calcularInteres());
            return getdineroActual();
            
        }
 
    }
  // metodo para calular el interes
    public double calcularInteres(){
        double interes;
        System.out.println("Ingrese el interes");
        interes=leer.nextDouble();
        interes=interes /100;
        
        return getdineroActual()*interes;
    }
//metodo toString
    @Override
    public String toString() {
        //Devolvermos lo q heredamos de la clase padre + otra cadena
        return  super.toString()+"\nDinero en su cuenta : "+getdineroActual();
    }

    

 

 

    
}
