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
    public double dineroActual;
    public Cheques() {
    }

    public Cheques(double dineroActual,String nombre, int nroCuenta) {
        super(nombre, nroCuenta);
        setdineroActual(dineroActual);
        
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
            "Su balance  debe ser >= 0.0" );
    }
    

    @Override
    public double depositar(double deposita) {
      double deposito =  getdineroActual()+deposita;
        setdineroActual(deposito);
        return getdineroActual();
    }

    @Override
    public double retirar(double retira) {
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
    public double obtenerBalanceActual() {
      return getdineroActual();
    }
     @Override
    public String toString() {
        return  super.toString()+"\nDinero en su cuenta : "+getdineroActual();
    }
    
}
