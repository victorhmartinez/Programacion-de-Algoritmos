/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenParcial2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Candidatos {
   public static void main(String[] args) {

        Candidatos.leerArchivo();

    }

    public static void leerArchivo() {
        try {
            String contenido;
            String ganador;
            int lojacan1 = 0, lojacan2 = 0, lojacan3 = 0, zamoracan1 = 0, zamoracan2 = 0, zamoracan3 = 0, machalacan1 = 0, machalacan2 = 0, machalacan3 = 0, totcandi1 = 0, totcandi2 = 0, totcandi3 = 0;
            Scanner datos = new Scanner(new File("prueba parcial.csv"));
            while (datos.hasNext()) {
                contenido = datos.nextLine();
                String[] tokens = contenido.split(";");
                if ("CANDIDATO1".equals(tokens[0])) {
                    lojacan1 += ((Integer.parseInt(tokens[1])));
                    zamoracan1 += ((Integer.parseInt(tokens[2])));
                    machalacan1 += ((Integer.parseInt(tokens[3])));

                } else {
                    if ("CANDIDATO2".equals(tokens[0])) {
                        lojacan2 += ((Integer.parseInt(tokens[1])));
                        zamoracan2 += ((Integer.parseInt(tokens[2])));
                        machalacan2 += ((Integer.parseInt(tokens[3])));

                    } else {
                        if ("CANDIDATO3".equals(tokens[0])) {
                            lojacan3 += ((Integer.parseInt(tokens[1])));
                            zamoracan3 += ((Integer.parseInt(tokens[2])));
                            machalacan3 += ((Integer.parseInt(tokens[3])));

                        }

                    }
                }

            }

            //Creacion del nuevo archivo
            String encabezado = " CANDIDATO ; LOJA ; ZAMORA ; MACHALA ; TOTAL \r\n";
            Formatter resultados = new Formatter("Resultados.csv");
            resultados.format(encabezado);
            totcandi1 = lojacan1 + zamoracan1 + machalacan1;
            totcandi2 = lojacan2 + zamoracan2 + machalacan2;
            totcandi3 = lojacan3 + zamoracan3 + machalacan3;
            if(totcandi1 > totcandi2 & totcandi1 > totcandi3){
                ganador = "Gano el candidato 1";
            }else{
                if(totcandi2 > totcandi1 & totcandi2 > totcandi3){
                ganador = "Gano el candidato 2";
                }else{
                ganador = "Gano el candidato 3";
                } 
            }
            resultados.format("CANDIDATO1 ; %d ; %d ; %d ; %d\r\nCANDIDATO2 ; %d ; %d ; %d ; %d\r\nCANDIDATO3 ; %d ; %d ; %d ; %d\r\n %s", lojacan1, zamoracan1, machalacan1, totcandi1,lojacan2, zamoracan2, machalacan2, totcandi2, lojacan3, zamoracan3, machalacan3, totcandi3,ganador);
            resultados.close();

        } catch (FileNotFoundException e) {
            e.getMessage();
        }//fin de la lectura del archivo

        try {

        } catch (Exception e) {
        }
    }

    public static void crearArchivo() {

    }


       
}
