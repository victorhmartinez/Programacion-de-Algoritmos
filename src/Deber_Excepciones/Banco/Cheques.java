/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_Excepciones.Banco;

/**
 *
 * @author Usuario
 */
public class Cheques extends Banco{
    //Atributo de la clase cheques
    public double dineroActual;
    //Cosntructor vacio
    public Cheques() {
    }
    //Constructor que recibe parametros
    public Cheques(double dineroActual,String nombre, int nroCuenta) {
        //inicianilizamos en constructor de la clase padre
        super(nombre, nroCuenta);
        //Inicializamos los atributos de la clase
        this.dineroActual=dineroActual;
        
    }
    //Metodos especiales set y get para obtener y establecer los valores
    public double getdineroActual() {
        return dineroActual;
    }

    public void setdineroActual(double dineroActual) {
        this.dineroActual = dineroActual;
         
      
    }
    

    @Override
    //metodo depositar que recibe parametros de tipo double
    public double depositar(double deposita) {
      double deposito =  getdineroActual()+deposita;
        setdineroActual(deposito);
        return getdineroActual();
    }

    @Override
    //metodos retirar que recibe parametos de tipo double
    public double retirar(double retira) {
        //verificamos si la cantidad de dinero sea mayor a la de retirar
        if (getdineroActual()>retira) {
              System.out.println("Retiro con exito");
            double retiro= getdineroActual()-retira;
            setdineroActual(retiro);
            return getdineroActual();
        }else {
            System.out.println("Usted sobregiro su cuenta");
            double retiro= getdineroActual()-retira;
            setdineroActual(retiro);
            System.out.println(getdineroActual());
            return getdineroActual();
        }
    }

    @Override
    //Obtenemos el valor del balance actual
    public double obtenerBalanceActual() {
      return getdineroActual();
    }
     @Override
     //metodos toString
    public String toString() {
         //Devolvermos lo q heredamos de la clase padre + otra cadena
        return  super.toString()+"\nDinero en su cuenta : "+getdineroActual();
    }
    
}
