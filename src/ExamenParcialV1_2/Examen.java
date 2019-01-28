/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenParcialV1_2;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Examen {
 public static ArrayList<Candidatos> candidatos = new ArrayList<Candidatos>();
    public static void main(String[] args) {
       Metodos m = new Metodos();
        m.leerArchivo(candidatos);
    }
}
