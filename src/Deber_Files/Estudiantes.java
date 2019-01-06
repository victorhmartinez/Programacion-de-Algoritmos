/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_Files;

/**
 *
 * @author Usuario
 */
public class Estudiantes {
    //Atributos de las Nomina de estudiantes
    public String nombrEst;
    public double foro1;
    public double chat1;
    public double vid1;
    public double tra1;
    public double pre1;
    public double foro2;
    public double chat2;
    public double vid2;
    public double tra2;
    public double pre2;
    public double fin1;
    public double fin2;
    public double total;
    public String alerta;
    public String Promocion;
    //Construcutor Basico
    public Estudiantes() {
    }
    //Constructor que recibe parametros 
    public Estudiantes(String nombrEst, double foro1, double chat1, double vid1, double tra1, double pre1, double foro2, 
            double chat2, double vid2, double tra2, double pre2, double fin1, double fin2, double total,
            String alerta, String Promocion) {
        //Inicianilizamos cada uno de los atibutos
        this.nombrEst = nombrEst;
        this.foro1 = foro1;
        this.chat1 = chat1;
        this.vid1 = vid1;
        this.tra1 = tra1;
        this.pre1 = pre1;
        this.foro2 = foro2;
        this.chat2 = chat2;
        this.vid2 = vid2;
        this.tra2 = tra2;
        this.pre2 = pre2;
        this.fin1 = fin1;
        this.fin2 = fin2;
        this.total = total;
        this.alerta = alerta;
        this.Promocion = Promocion;
    }
    //Metodos especiales para obtener y establecer los atributos set y get
    public String getNombrEst() {
        return nombrEst;
    }

    public void setNombrEst(String nombrEst) {
        this.nombrEst = nombrEst;
    }

    public double getForo1() {
        return foro1;
    }

    public void setForo1(double foro1) {
        this.foro1 = foro1;
    }

    public double getChat1() {
        return chat1;
    }

    public void setChat1(double chat1) {
        this.chat1 = chat1;
    }

    public double getVid1() {
        return vid1;
    }

    public void setVid1(double vid1) {
        this.vid1 = vid1;
    }

    public double getTra1() {
        return tra1;
    }

    public void setTra1(double tra1) {
        this.tra1 = tra1;
    }

    public double getPre1() {
        return pre1;
    }

    public void setPre1(double pre1) {
        this.pre1 = pre1;
    }

    public double getForo2() {
        return foro2;
    }

    public void setForo2(double foro2) {
        this.foro2 = foro2;
    }

    public double getChat2() {
        return chat2;
    }

    public void setChat2(double chat2) {
        this.chat2 = chat2;
    }

    public double getVid2() {
        return vid2;
    }

    public void setVid2(double vid2) {
        this.vid2 = vid2;
    }

    public double getTra2() {
        return tra2;
    }

    public void setTra2(double tra2) {
        this.tra2 = tra2;
    }

    public double getPre2() {
        return pre2;
    }

    public void setPre2(double pre2) {
        this.pre2 = pre2;
    }

    public double getFin1() {
        return fin1;
    }

    public void setFin1(double fin1) {
        this.fin1 = fin1;
    }

    public double getFin2() {
        return fin2;
    }

    public void setFin2(double fin2) {
        this.fin2 = fin2;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getAlerta() {
        return alerta;
    }

    public void setAlerta(String alerta) {
        this.alerta = alerta;
    }

    public String getPromocion() {
        return Promocion;
    }

    public void setPromocion(String Promocion) {
        this.Promocion = Promocion;
    }
    
    
}
