package Deber_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class Metodos {

    int cant = 0;

    public void crearRegistros() {

        try {
            Formatter nominaEstu = new Formatter("Resgistro_Estudiante.csv");

            for (int i = 0; i < (int) (Math.random() * 20) + 1; i++) {
                nominaEstu.format("%s,%.1f,%.1f,%.1f,%.2f,%.2f,%.1f,%.1f,%.1f,%.2f,%.2f\r\n", "Estudiante " + (i + 1),
                        Math.random() * 1, Math.random() * 1, Math.random() * 1, (Math.random() * 6), (Math.random() * 14), +Math.random() * 1,
                        Math.random() * 1, Math.random() * 1, (Math.random() * 6), (Math.random() * 14));
                cant++;
            }
            nominaEstu.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se pudo");
        }
    }

    public void leerRegistro(ArrayList<Estudiantes> nomina) {
        String linea;

        String nombre, Promocion = null, alerta = null;
        double foro1, chat1, vid1, tra1, pre1, foro2, chat2, vid2, tra2, pre2, fin1 = 0, fin2 = 0, Total = 0;
        Metodos u = new Metodos();
        try {
            Scanner leeNomina = new Scanner(new File("Resgistro_Estudiante.csv"));

            for (int i = 0; i < cant; i++) {
                linea = leeNomina.nextLine();
                String[] tokens = linea.split(",");
                nombre = tokens[0];
                foro1 = Double.parseDouble(tokens[1]);
                chat1 = Double.parseDouble(tokens[2]);
                vid1 = Double.parseDouble(tokens[3]);
                tra1 = Double.parseDouble(tokens[4]);
                pre1 = Double.parseDouble(tokens[5]);
                foro2 = Double.parseDouble(tokens[6]);
                chat2 = Double.parseDouble(tokens[7]);
                vid2 = Double.parseDouble(tokens[8]);
                tra2 = Double.parseDouble(tokens[9]);
                pre2 = Double.parseDouble(tokens[10]);
                nomina.add(new Estudiantes(nombre, foro1, chat1, vid1, tra1, pre1,
                        foro2, chat2, vid2, tra2, pre2, fin1, fin2, Total, alerta, Promocion));
                u.darfinal(pre1, pre2, nomina, i);
                u.pruebafin(nomina, i);
                u.promocion(nomina, i);

            }
            leeNomina.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo");
        }
    }

    public void darfinal(double nota, double nota2, ArrayList<Estudiantes> nomina, int i) {
        if (nota < 8.0 && nota2 < 8.0) {
            nomina.get(i).setAlerta("Dar final 1 y 2");
        } else if (nota < 8.0) {
            nomina.get(i).setAlerta("Dar final 1");
        } else if (nota2 < 8.0) {
            nomina.get(i).setAlerta("Dar final 2");

        } else {
            nomina.get(i).setAlerta("No tiene que dar final");
        }

    }

    public void calcularNotafin(ArrayList<Estudiantes> nomina, int i) {
        nomina.get(i).setTotal(nomina.get(i).getChat1() + nomina.get(i).getForo1() + nomina.get(i).getVid1() + nomina.get(i).getTra1()
                + nomina.get(i).getPre1() + nomina.get(i).getForo2() + nomina.get(i).getChat2() + nomina.get(i).getVid1() + nomina.get(i).getTra2()
                + nomina.get(i).getPre2());
    }

    public void pruebafin(ArrayList<Estudiantes> nomina, int i) {

        switch (nomina.get(i).getAlerta()) {
            case "No tiene que dar final":
                calcularNotafin(nomina, i);
                if (nomina.get(i).getTotal() < 28.0) {
                    if (nomina.get(i).getPre1() < nomina.get(i).getPre2()) {
                        nomina.get(i).setAlerta("Dar final 1");
                        nomina.get(i).setPre1(Math.random() * 14);
                        calcularNotafin(nomina, i);
                    } else {
                        nomina.get(i).setAlerta("Dar final 2");
                        nomina.get(i).setPre2(Math.random() * 14);
                        calcularNotafin(nomina, i);
                    }
                }
                break;
            case "Dar final 1 y 2":
                nomina.get(i).setFin1((Math.random() * 20));
                nomina.get(i).setFin2((Math.random() * 20));
                nomina.get(i).setTotal(nomina.get(i).getFin1() + nomina.get(i).getFin2());
                break;
            case "Dar final 1":
                nomina.get(i).setFin1((Math.random() * 20) + 1);
                nomina.get(i).setTotal(nomina.get(i).getFin1() + nomina.get(i).getChat2() + nomina.get(i).getForo2() + nomina.get(i).getPre2()
                        + nomina.get(i).getVid2() + nomina.get(i).getTra2());
                break;
            case "Dar final 2":
                nomina.get(i).setFin2((Math.random() * 20) + 1);
                nomina.get(i).setTotal(nomina.get(i).getFin2() + nomina.get(i).getChat1() + nomina.get(i).getForo1() + nomina.get(i).getPre1()
                        + nomina.get(i).getVid1() + nomina.get(i).getTra1());
                break;
            default:
                break;
        }
    }

    public void promocion(ArrayList<Estudiantes> nomina, int i) {
        if (nomina.get(i).getTotal() > 28) {
            nomina.get(i).setPromocion("APROBADO");
        } else {
            nomina.get(i).setPromocion("REPROBADO");
        }
    }

    public void guardarNomina(ArrayList<Estudiantes> nomina) {
        Formatter guardarNomina;
        try {
            guardarNomina = new Formatter("Resgistro_Estudiante.csv");
            guardarNomina.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s\r\n", "Nombres", "Foro 1", "Chat 1", "Vid 1", "Tra 1", "Pre1",
                    "Foro 2", "Chat 2", "Vid 2", "Tra 2", "Pre 2", "Fin 1", "Fin 2", "Total", "Alerta", "Promocion");
            for (int i = 0; i < nomina.size(); i++) {
                guardarNomina.format("%s,%.1f,%.1f,%.1f,%.2f,%.2f,%.1f,%.1f,%.1f,%.2f,%.2f,%.2f,%.2f,%.2f,%s,%s\r\n", nomina.get(i).getNombrEst(), nomina.get(i).getForo1(),
                        nomina.get(i).getChat1(), nomina.get(i).getVid1(), nomina.get(i).getTra1(), nomina.get(i).getPre1(), nomina.get(i).getForo2(),
                        nomina.get(i).getChat2(), nomina.get(i).getVid2(), nomina.get(i).getTra2(), nomina.get(i).getPre2(), nomina.get(i).getFin1(), nomina.get(i).getFin2(),
                        nomina.get(i).getTotal(), nomina.get(i).getAlerta(), nomina.get(i).getPromocion());

            }
            guardarNomina.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Error al guardar");
        }
    }

}
