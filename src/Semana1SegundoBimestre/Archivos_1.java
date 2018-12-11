
package Semana1SegundoBimestre;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos_1 {
    public static void main(String[] args) {
        String nombre="Victor";
        String Apellido= "Martinez";
        String userName="vhmartinez5";
        try {
            //Creamos un archivo .txt
            Formatter archivo = new Formatter("Archivo.txt");
            archivo.format("%s %d","Hola ",4);
            archivo.format("\r\nNombre:%s\r\nApellido:%s\r\nUserName:%s\r\n",nombre,Apellido,userName );
            archivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            File objeto=new File("Archivo.txt");
            Scanner miArchivo = new Scanner(objeto);
            while (miArchivo.hasNext()) {
                System.out.println(miArchivo.nextLine());
                
            }
        } catch (Exception e) {
        }
    }
}
