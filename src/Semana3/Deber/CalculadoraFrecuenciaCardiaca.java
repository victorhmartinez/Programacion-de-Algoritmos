
package Semana3.Deber;


public class CalculadoraFrecuenciaCardiaca {
    public static void main(String[] args) {
        FrecuenciaCardiaca frecuencia = new FrecuenciaCardiaca("Juanito", "Andres", 23, 10, 1998);
        System.out.println(frecuencia);
        System.out.println("Usted tiene "+frecuencia.calculoAnios(2018)+" años");
        System.out.println("La frecuencia Maxima es :"+frecuencia.calculoFrecuenciaMaxima(frecuencia.calculoAnios(2018)));
        frecuencia.calculoFrecuenciaEsperada();
    }
}
