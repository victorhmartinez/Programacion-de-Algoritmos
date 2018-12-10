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
        Persona alumno1 = new Alumno(6, "Juan", 'M', 15);
        Persona alumno2 = new Alumno(6, "Pedro", 'M', 15);
        Persona alumno3 = new Alumno(4, "Maria", 'F', 14);
        Persona alumno4 = new Alumno(9, "Juanita", 'F', 14);
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        Aula aula = new Aula(1, "Filosofia", 7);
        Aula aula2 = new Aula(2, "Matematicas", 6);
        Profesor profe = new Profesor("Matematicas", "Juan", 'M', 50);
        Profesor profe2 = new Profesor("Filosofia", "Maria del Carmen", 'F', 31);
        Principal pr = new Principal();
        if (pr.darClase(profe2, aula)) {
            pr.calcularNotas();
        }
        if (pr.darClase(profe, aula2)) {
            pr.calcularNotas();
        }

    }

    private boolean matriculasAlumnos() {

        int matriculados = 0;

        //contamos las asistencias
        for (int i = 0; i < alumnos.size(); i++) {

            if (alumnos.get(i).isAsistencia()) {
                matriculados++;
            }

        }

        //Muestro la asistencia total
        System.out.println("Hay " + matriculados + " alumno(s) matriculados en la materia");

        return matriculados >= ((int) (alumnos.size() / 2));

    }

    public boolean darClase(Profesor profe, Aula aula) {

        //Indicamos las condiciones para que se pueda dar la clase
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

    public void calcularNotas() {

        int chicosApro = 0;
        int chicasApro = 0;

        for (Persona alumno : alumnos) {
            
            if (alumno instanceof Alumno) {
                //Comprobamos si el alumno esta aprobado     
                if (((Alumno) alumno).getNota() >= 5) {

                    if (alumno.getSexo() == 'M') {
                        chicosApro++;
                    } else {
                        chicasApro++;
                    }
                }
                System.out.println(((Alumno) alumno).toString());

            }
        }
        System.out.println("Hay " + chicosApro + " alumnos y " + chicasApro + " alumnas aprobados(as)");

    }
}
