/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller_Guiado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Equipo {
    

    public static ArrayList<Jugadores_Futbol> equipo = new ArrayList<>();
  
    Scanner leer = new Scanner(System.in);
int sumaTotalEquipo,sumaTotalin;
    public static void main(String[] args) {
        
         int n;
        Scanner leer = new Scanner(System.in);
        Jugadores_Futbol portero = new Porteros(0, "Casillas", 1, 0, "Arquero");
        Jugadores_Futbol defensa1 = new Defensas(0, 0, "Juan", 96, 0, "Defensa Derecha");
        Jugadores_Futbol defensa2 = new Defensas(0, 0, "Pedrito", 9, 0, "Defensa Izquierda");
        Jugadores_Futbol defensa3 = new Defensas(0, 0, "Alex", 3, 0, "Defensa Central ");
        Jugadores_Futbol defensa4 = new Defensas(0, 0, "Mario", 5, 0, "Defensa Central");
        Jugadores_Futbol volante1 = new Atacantes(0, 0, "Isco", 4, 0, "Volante Derecho");
        Jugadores_Futbol volante2 = new Atacantes(0, 0, "Kroos", 16, 0, "Volante Izquierdo");
        Jugadores_Futbol volante3 = new Atacantes(0, 0, "Jaime", 6, 0, "Volante Central");
        Jugadores_Futbol volante4 = new Atacantes(0, 0, "Benzema", 35, 0, "Volante central");
        Jugadores_Futbol delantero = new Atacantes(0, 0, "Messi", 10, 0, "Delantero");
        Jugadores_Futbol delantero1 = new Atacantes(0, 0, "CR7", 7, 0, "Delantero");
        equipo.add(portero);
        equipo.add(defensa1);
        equipo.add(defensa2);
        equipo.add(defensa3);
        equipo.add(defensa4);
        equipo.add(volante1);
        equipo.add(volante2);
        equipo.add(volante3);
        equipo.add(volante4);
        equipo.add(delantero);
        equipo.add(delantero1);

       Equipo eq = new Equipo();
        do {
            System.out.println("Bienvenido Ingrese Una Opcion");
            System.out.println("Agregar jugadores -------> 1");
            System.out.println("Mostrar resultados equipos -------> 2");
            System.out.println("Anotar gol -------> 3");
            System.out.println("Dar Pase -------> 4");
            System.out.println("Recuperar");
            n = leer.nextInt();
                  switch (n) {
            case 1:
                eq.agregarJugadores(delantero1);
                break;
            case 2:
                eq.mostraResult();
                break;
            case 3:
                System.out.println("Ingrese el numero de camiseta");
                eq.anotarGol();
                break;
            case 4:
                System.out.println("Ingrese el numero de camiseta");
                eq.darPase();
                break;
            case 5:
                System.out.println("Ingrese el numero de camiseta");
                eq.recuperar();
                break;

        }
        } while (n != 0);
  
    }

    public void agregarJugadores(Jugadores_Futbol jugador_J) {
        
    }

    public void mostraResult() {
        System.out.println("La Valoracion total del equipo  es: " + sumaTotalEquipo);
        System.out.println("La Valoracion del equipo es");
       
    }

    public void anotarGol() {

    }

    public void darPase() {

    }

    public void recuperar() {

    }
}
