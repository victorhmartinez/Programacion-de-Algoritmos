/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenParcialV1_2;

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
public class Metodos {
    
    public void leerArchivo(ArrayList <Candidatos>candi){
        Scanner archivoInput;
        String nombre = null,linea;
        int cantL = 0,canZ = 0,cantM = 0;
        try {
            archivoInput= new Scanner(new File("ArchivoExamen1.1.csv"));
                while(archivoInput.hasNext()){
            linea=archivoInput.nextLine();
            String[]tokens=linea.split(",");
            if(!tokens[0].equals("CANDIDATO")){
               nombre=tokens[0];             
            }if(!tokens[1].equals("LOJA")){
                cantL=Integer.parseInt(tokens[1]);
            }if(!tokens[2].equals("ZAMORA")){
                canZ=Integer.parseInt(tokens[2]);    
            }if(!tokens[3].equals("MACHALA")){
                cantM=Integer.parseInt(tokens[3]);
                
            }
            candi.add(new Candidatos(nombre, cantL, cantM, canZ));
        }
        archivoInput.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public void crearArchivo(ArrayList <Candidatos>candi){
        Formatter archivoOutput;
        try {
            archivoOutput= new Formatter("ArchivoGanadores");
            archivoOutput.format("%s,%s,%s,%s,%s","CANDIDATOS","LOJA","ZAMORA","MACHALA","TOTAL");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void asignacionVotos(ArrayList<Candidatos>candi){
        String []nombres=new String[3];
        
    }
}
