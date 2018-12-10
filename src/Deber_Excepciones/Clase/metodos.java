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
public class metodos {
      public  int generaNumeroAleatorio(int minimo, int maximo){
         
        int num=(int)(Math.random()*(minimo-(maximo+1))+(maximo+1));
         
        return num;
      
    }
    
}
