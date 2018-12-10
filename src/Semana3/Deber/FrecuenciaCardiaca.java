
package Semana3.Deber;


public class FrecuenciaCardiaca {
    //Parametros
    public String primerNomobre;
    public String primerApellido;
    public int diaN,mesN,anioN;
  

    // Constructor que recibe parametros
    
    public FrecuenciaCardiaca(String primerNomobre, String primerApellido, int diaN, int mesN, int anioN) {
        this.primerNomobre = primerNomobre;
        this.primerApellido = primerApellido;
        this.diaN = diaN;
        this.mesN = mesN;
        this.anioN = anioN;
    }

 
    // Constructor que no recibe parametros
    public FrecuenciaCardiaca() {
    }
    //Obtenemos el nombre
    public String getPrimerNomobre() {
        return primerNomobre;
    }//Fin del metodo getPrimerNombre

    //Asignamos el nombre 
    public void setPrimerNomobre(String primerNomobre) {
        this.primerNomobre = primerNomobre;
    }//FIn del metodo setPrimerNombre

    //Obtiene el apellido  del objeto
    public String getPrimerApellido() {
        return primerApellido;
    }//Fin del metodo getPrimerApellido

    // Asignamos el apellido al objeto
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }// Fin de metodo  setPrimerApellido

    //Obtenemos las Fechas de nacimientos 
    //Por diferentes partes obteniendo dia,mes,año de nacimiento.
    public int getDiaN() {
        return diaN;
    }

    public void setDiaN(int diaN) {
        this.diaN = diaN;
    }

    public int getMesN() {
        return mesN;
    }

    public void setMesN(int mesN) {
        this.mesN = mesN;
    }

    public int getAnioN() {
        return anioN;
    }

    public void setAnioN(int anioN) {
        this.anioN = anioN;
    }
    //Fin de los metodos  obtener y establecer para obtener las
    //fechas de nacimientos.


    //Metodos Para los diversos requerimientos
    //Metodos para el calculos de los años
    public int calculoAnios( int anios){
      
        anios=anios-getAnioN();
        
        return anios;
    }// Fin de los metodos   del calculo de los años
    
    // Metodos para calcular la frecuencia maxima
    public int calculoFrecuenciaMaxima(int anios){
        int frecuMaxima;
        //formula para calcular la frecuencia
        frecuMaxima= 220-anios;
    //Devolvemos la frecuencia Maxima  para presentarlo
        return frecuMaxima;
    }// Fin del metodo Calculo de la frecuencia Maxima
    
    //Metodo del calculo de Frecuencia esperada
    public void calculoFrecuenciaEsperada(){
       //segun la problematica de ejercicio de l esjercicio establecio  que el  frecuencia esperada es de 
       //el rango de del 50 y 85% de la frecuencia maxima
        System.out.println("La frecuencia cardiaca esperada del paciente esta en el rango del 50 y 85%");
    }//Fin del metodo  Freceuncaia eapera

   
    //Metodo toString Para la presentacion de los valores de los objetos
    public String toString() {
        return "\nFrecuencia Cardiaca " + "\nNomobre : " + primerNomobre + "\nApellido : " + primerApellido + "\nFecha de nacimineto:\n" + diaN + "-" + mesN + "-" + anioN ;
    }// Fin del metodo toString
    
    
}
