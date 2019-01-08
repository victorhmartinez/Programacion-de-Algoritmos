/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author Usuario
 */
public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibonnacci(5));
        
    }
    public static long fibonnacci(long numero){
        if((numero==0)||(numero==1))
            return numero;
        else
            return fibonnacci(numero-1)+fibonnacci(numero-2);
                    
    }
}
