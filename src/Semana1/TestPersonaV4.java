package Semana1;

public class TestPersonaV4 {

    public static void main(String[] args) {
        System.out.println("Nombre de empresa de Personas <" + PersonasV4.nombreEmpresa + ">");
        PersonasV4 personaA = new PersonasV4("M", 4);
        System.out.println("Nombre de empresa de Personas <" + PersonasV4.nombreEmpresa + ">");
        PersonasV4 personaB = new PersonasV4();
        System.out.println("Nombre de empresa de Personas <" + personaB.getNombreEmpresa() + ">");
    }
}
