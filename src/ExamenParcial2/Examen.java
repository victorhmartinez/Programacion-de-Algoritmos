/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenParcial2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Examen {
    
    public static void main(String[] args) {
       Examen ex =new  Examen();
       ex. leerArchivo();
       
    }

    public  void leerArchivo() {
        Scanner fileInput;
        String linea;
        int[] suma = new int[3];
        int sumaLC1 = 0, sumaLC2 = 0, sumaLC3 = 0;
        int sumaZC1 = 0, sumaZC2 = 0, sumaZC3 = 0;
        int sumaMC1 = 0, sumaMc2 = 0, sumaMc3 = 0;
        int sumaTC1, sumaTC2, sumaTC3 = 0;
        try {
            fileInput = new Scanner(new File("ArchivoExamen.csv"));
            while (fileInput.hasNext()) {
                linea = fileInput.nextLine();
                String tokens[] = linea.split(",");
                if (tokens[0].equals("CANDIDATO1")) {
                    sumaLC1 = sumaLC1 + Integer.parseInt(tokens[1]);
                    sumaZC1 = sumaZC1 + Integer.parseInt(tokens[2]);
                    sumaMC1 = sumaMC1 + Integer.parseInt(tokens[3]);
                    sumaTC1 = (sumaLC1) + (sumaZC1) + (sumaMC1);
                    suma[0] = sumaTC1;
                } else if (tokens[0].equals("CANDIDATO2")) {
                    sumaLC2 = sumaLC2 + Integer.parseInt(tokens[1]);
                    sumaZC2 = sumaZC2 + Integer.parseInt(tokens[2]);
                    sumaMc2 = sumaMc2 + Integer.parseInt(tokens[3]);
                    sumaTC2 = (sumaLC2) + (sumaZC2) + (sumaMc2);
                    suma[1] = sumaTC2;
                } else if (tokens[0].equals("CANDIDATO3")) {

                    sumaLC3 = sumaLC3 + Integer.parseInt(tokens[1]);
                    sumaZC3 = sumaZC3 + Integer.parseInt(tokens[2]);
                    sumaMc3 = sumaMc3 + Integer.parseInt(tokens[3]);
                    sumaTC3 = (sumaLC3) + (sumaZC3) + (sumaMc3);
                    suma[2] = sumaTC3;
                }
            }
            
            fileInput.close();
             try {
            Formatter fileOutPut = new Formatter("ArchivoGanador.csv");
            fileOutPut.format("%s,%s,%s,%s,%s\r\n", "Candidato","Loja","Zamora","Machala","Total");
           
            fileOutPut.format("%s,%d,%d,%d,%d\r\n","Candidato1",sumaLC1,sumaZC1,sumaMC1,suma[0]);
            fileOutPut.format("%s,%d,%d,%d,%d\r\n","Candidato2",sumaLC2,sumaZC2,sumaMc2,suma[1]);
            fileOutPut.format("%s,%d,%d,%d,%d\r\n","Candidato3",sumaLC2,sumaZC3,sumaMc3,suma[2]);
            fileOutPut.format("%s",ganador(suma));
            fileOutPut.close();
        } catch (FileNotFoundException ex) {
           System.err.print("Error ");
        }
           
            
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error Archivo No Encontrado");
        }
    }
    public String ganador(int []a){
        
        if(a[0]>a[1]&& a[0]>a[2]){
            return "Ganador Cantidato 1";
        }else if (a[1]>a[0]&& a[1]>a[2]){
            return "Ganador candidato 2";
        }else if (a[2]>a[0]&& a[2]>a[1]){
            return "Ganador candidato 3";
        }
        return "No hay ganador";
    }
    
  
}
