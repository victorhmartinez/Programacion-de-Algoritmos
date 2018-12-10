
package Deber_Excepciones.Clase;

/**
 *
 * @author Usuario
 */
public class Aula {
    //Atributos
    public int indicador;
    public String dedicada;
    public int nuemroMaximo;
    //Constructor Vacio
    public Aula() {
    }  
    //Constructor que recibe parametros
    public Aula(int indicador, String dedicada, int nuemroMaximo) {
        this.indicador = indicador;
        this.dedicada = dedicada;
        this.nuemroMaximo = nuemroMaximo;
     
    }
//Metodos especiales set y get para obtener y establecer los valores
    public int getIndicador() {
        return indicador;
    }

    public void setIndicador(int indicador) {
        this.indicador = indicador;
    }

    public String getDedicada() {
        return dedicada;
    }

    public void setDedicada(String dedicada) {
        this.dedicada = dedicada;
    }

    public int getNuemroMaximo() {
        return nuemroMaximo;
    }

    public void setNuemroMaximo(int nuemroMaximo) {
        this.nuemroMaximo = nuemroMaximo;
    }



   
    
            
}
