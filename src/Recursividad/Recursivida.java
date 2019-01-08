
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
public class Recursivida {
    public static void main(String[] args) {
        //for (int i = 0; i < 1000000; i++) {
         //   System.out.println("Hola"+i);
        //}
        recursivo(1000000);
    }
    
    public static long recursivo(long num){
        if(num<=1){
             System.out.println("Hola"+num);
            return 0;
        }
        recursivo(num-1);
        return num;
    }
  
}
