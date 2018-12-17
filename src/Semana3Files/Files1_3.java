/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Files1_3 {

    public static void main(String[] args) {
        Scanner filesIin;
        String linea;
        try {

            Formatter fileOut = new Formatter("MiArchivo1_1.csv");
            for (int i = 0; i < 10; i++) {
                fileOut.format("%d,%d,%d\r\n", (int) (Math.random() * 20) + 1, (int) (Math.random() * 20) + 1, (int) (Math.random() * 20) + 1);
            }
            fileOut.close();
            filesIin = new Scanner(new File("MiArchivo1_1.csv"));
            for (int i = 0; i < 10; i++) {

                linea = filesIin.nextLine();
                String[] tokens = linea.split(",");
                int suma = Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[1]) + Integer.parseInt(tokens[2]);
                System.out.println("La suma es de " + tokens[0] + "+" + tokens[1] + "+" + tokens[2] + "=" + suma);
            }

            filesIin.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Error de apertura de archivo" + ex);
        }

    }
}
