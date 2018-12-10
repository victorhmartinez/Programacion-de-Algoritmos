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
public class Platino  extends Banco{
    double dineroActual;

    public Platino() {
    }

    public Platino(int dineroActual, String nombre, int nroCuenta) {
        super(nombre, nroCuenta);
        this.dineroActual = dineroActual;
    }

    public double getdineroActual() {
        return dineroActual;
    }

    public void setdineroActual(double dineroActual) {
        this.dineroActual = dineroActual;
    }

    @Override
    public double depositar(double deposita) {
        double deposito=getdineroActual()+deposita;
       
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
           if (getdineroActual()<=0.0) {
           
            return 0.0;
        }else{
              double calculaInteres=getdineroActual()*0.10;
            setdineroActual(getdineroActual()+calculaInteres);
            return getdineroActual();
            
        }
    }
     @Override
    public String toString() {
        return  super.toString()+"\nDinero en su cuenta : "+getdineroActual();
    }
    
}
