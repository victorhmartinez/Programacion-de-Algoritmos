package Semana3;

public class Empleado {
        public String PrimerNombre;
    public String apellido;
    public double salario;

    //Se especifica el constructor vacio por si desea crear un objeto vacio, sin valores
    public Empleado() {
    }

    /**
     * Crea un objeto asignando todos los valores para los tres atributos de la
     * clase como:
     *
     * @param nombre Es el nombre (uno o dos) para un determinado empleado
     * @param apellido Segundo nombre (uno o dos) para cada empleado
     * @param salario Salario del empleado que no puede ser negativo
     */
    public Empleado(String nombre, String apellido, double salario) {
        this.PrimerNombre = nombre;
        this.apellido = apellido;
        this.setSalario(salario); //No pueden existir objetos con salario negativo
    }//Fin del constructor(String, String, double)

    //Obtiene el nombre del Empleado 
    public String getNombre() {
        return PrimerNombre;
    }//Fin del método getNombre()

    //Asigna el nombre para un Empleado
    public void setNombre(String nombre) {
        this.PrimerNombre = nombre;
    }//Fin del método setNombre(String)

    //Obtiene el apellido del Empleado
    public String getApellido() {
        return apellido;
    }//Fin del método getApellido()

    //Asigna apellidos para un Empleado
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }//Fin del método setApellido(String)

    //Obtiene el salario del Empleado
    public double getSalario() {
        return salario;
    }//Fin del método getSalario()

    /**
     * No pueden existir objetos con salario negativo si llega un salario
     * negativo, éste se asigna automaticamente en cero
     *
     * @param salario Salario del Empleado a asignar
     */
    public void setSalario(double salario) {
        this.salario = (salario < 0) ? 0.0 : salario;
    }//Fin del método setSalario(double)

    /**
     * Incrementa el salario de un Empleado dado un porcentaje
     *
     * @param porcentajeAumento Es el valor en porcentaje del incremento
     * salarial
     */
    public void aumentoSalario(double porcentajeAumento) {
        this.salario += this.getSalario() * (porcentajeAumento / 100);
    }//Fin del método aumentoSalario(double)

    //Para cuando se desea presentar los valores del objeto
    //Éste tostring() esta sobrecargado de la Clase java.lang.Object.class.toString()
    @Override
    public String toString() {

        return String.format("Nombres y apellidos: %s %s \nSalario Actual: %s", 
                             getNombre(), getApellido(), getSalario());
    }//Fin del método toString()
}
