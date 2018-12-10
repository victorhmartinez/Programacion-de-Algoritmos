/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller_Guiado;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PreubaSeres {
    public static ArrayList <Seres_Habladores> habladores = new ArrayList<>();
    
    public static void main(String[] args) {
        Seres_Habladores loro= new Loro("Irracional", "No se mi edad", "Periquito");
        Seres_Habladores adulto = new Adulto(3, "Noviembre", 1998, 20, "Adulto", "Victor", "Racional");
        Seres_Habladores niño =new Niño("No se mi fecha Nacimiento", 9, "Niño", "Alex", "Racional");
         habladores.add(loro);
         habladores.add(adulto);
         habladores.add(niño);
          for( Seres_Habladores seres:habladores){
              System.out.println("-----------o----------");
              System.out.println(seres.hablar());
          }
         
    }
    
}
