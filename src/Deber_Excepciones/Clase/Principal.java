/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_Excepciones.Clase;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Principal {

    public static ArrayList<Persona> alumnos = new ArrayList<>();

    public static void main(String[] args) {
        //Creamos los objetos de tipo alumnos
        Persona alumno1 = new Alumno(6, "Juan", 'M', 15);
        Persona alumno2 = new Alumno(6, "Pedro", 'M', 15);
        Persona alumno3 = new Alumno(4, "Maria", 'F', 14);
        Persona alumno4 = new Alumno(9, "Juanita", 'F', 14);
        //Añadimos a nuestro ArrayList nuestro objetos
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        //Creamos objetos de tipo aula
        Aula aula = new Aula(1, "Filosofia", 7);
        Aula aula2 = new Aula(2, "Matematicas", 6);
        //Creamos objetos de tipo profesor
        Profesor profe = new Profesor("Matematicas", "Juan", 'M', 50);
        Profesor profe2 = new Profesor("Filosofia", "Maria del Carmen", 'F', 31);
        //Instanciamos a nuestra clase Principal 
        //para acceder a los metodos
        Principal pr = new Principal();
        //Con un if preguntamos si hay como dar la clase
        if (pr.claseDisponible(profe2, aula)) {
            //En caso de que se true
            //LLamamos a nuestro metodos calcularNotas
            pr.calcularNotas();
        }
        if (pr.claseDisponible(profe, aula2)) {
            pr.calcularNotas();
        }

    }
//Metodo de tipo boolean para saber si mas de la mitad de la alumnos se matricularon
    //En esa materia  asistieron
    private boolean matriculasAlumnos() {

        int matriculados = 0;

        //contamos las asistencias
        for (int i = 0; i < alumnos.size(); i++) {
            //Con un if preguntamos si los alumnos asistieron
            if (alumnos.get(i).isAsistencia()) {
                //aumentamos en numero de matriculado
                matriculados++;
            }

        }

        //Muestramos la asistencia total de los alumnos
        System.out.println("Hay " + matriculados + " alumno(s) matriculados en la materia");
        //devolvemos un valor boolean de si el numro maticulado es mayor a la mitad
        //De los alumnos que se matricularon
        return matriculados >= ((int) (alumnos.size() / 2));

    }
    //Metodo de tipo booleam que recibe dos parametros de tipo Profesor y de tipo de Aula
    public boolean claseDisponible(Profesor profe, Aula aula) {

        //Indicamos las condiciones para que se pueda ejecutar la clase
        
        if (!profe.isAsistencia()) {
            System.out.println("La aula de la materia " + aula.getDedicada());
            System.out.println("El profesor no se encuentra disponible.");

            return false;
        } else if (!profe.getMaterias().equals(aula.getDedicada())) {
            System.out.println("La aula de la materia " + aula.getDedicada());
            System.out.println("La materia del profesor y del aula no es la misma");
            return false;
        } else if (!matriculasAlumnos()) {
            System.out.println("La aula de la materia " + aula.getDedicada());
            System.out.println("El numero de asistentes  no es suficiente, no se puede dar clase");
            return false;
        }
        System.out.println("La aula de la materia " + aula.getDedicada());

        System.out.println("Se puede dar clases normalmente");
        return true;

    }
    //Metodo para calcular el proemdio de los alumnos que estan aprobados
    public void calcularNotas() {
        //Variables para saber el numero de alumnos y alumnas aprobados
        int alumnosApro = 0;
        int alumnaspro = 0;
        //Usamos un ciclo for mejorado para recorre a todos los alumnos
        for (Persona alumno : alumnos) {
            //Con un if  vemos si estmos intanciando a un alumno
            if (alumno instanceof Alumno) {
                //Comprobamos si el alumno esta aprobado     
                if (((Alumno) alumno).getNota() >= 5) {
                    //Con un if vemos si es de Sexo masculino o femenino
                    if (alumno.getSexo() == 'M') {
                        //Aumentamos los alumnos aprobados si es masculino
                        alumnosApro++;
                    } else {
                        //Aumentamos las alumnas aprobadas 
                        alumnaspro++;
                    }
                }
                System.out.println(((Alumno) alumno).toString());

            }
        }
        //Presentamos de a los alumnos y alumnas que estan aprobados
        System.out.println("Hay " + alumnosApro + " alumnos y " + alumnaspro + " alumnas aprobados(as)");

    }
}
