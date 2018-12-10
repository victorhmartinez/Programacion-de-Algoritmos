/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_Excepciones.Banco;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Prueba {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cant;
        Banco cuentaAho = new Ahorro(15, "juan", 123);
        Banco cuentaCheues = new Cheques(15, "Pedro", 192);
        Banco cuentaPlatino = new Platino(12, "Ernesto", 152);
        //Cuentas de cheques
        do {
            try {
                System.out.println("Ingrese la cantidda a Retirar");
                cant = leer.nextInt();
                cuentaCheues.retirar(cant);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un numero");
                leer.nextLine();
                continue;
            }
        } while (true);

        do {
            try {
                System.out.println("Ingrese la cantidad a Depositar");
                cant = leer.nextInt();

                cuentaCheues.depositar(cant);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error debe ingresar un numero");

                leer.nextLine();
                continue;
            }
        } while (true);

        System.out.println("Su balnce es de : " + cuentaCheues.obtenerBalanceActual());
        System.out.println(cuentaCheues);
        //Cuenta de ahorros
        
             do {
            try {
                System.out.println("Ingrese la cantidda a Retirar");
                cant = leer.nextInt();
                cuentaAho.retirar(cant);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un numero");
                leer.nextLine();
                continue;
            }
        } while (true);

        do {
            try {
                System.out.println("Ingrese la cantidad a Depositar");
                cant = leer.nextInt();

                cuentaAho.depositar(cant);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error debe ingresar un numero");

                leer.nextLine();
                continue;
            }
        } while (true);
        System.out.println("su balance es de " + cuentaAho.obtenerBalanceActual());
        System.out.println(cuentaAho);
        //Cuenta Platino
             do {
            try {
                System.out.println("Ingrese la cantidda a Retirar");
                cant = leer.nextInt();
                cuentaPlatino.retirar(cant);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un numero");
                leer.nextLine();
                continue;
            }
        } while (true);

        do {
            try {
                System.out.println("Ingrese la cantidad a Depositar");
                cant = leer.nextInt();

                cuentaPlatino.depositar(cant);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error debe ingresar un numero");

                leer.nextLine();
                continue;
            }
        } while (true);
        System.out.println("Su balnce es de " + cuentaPlatino.obtenerBalanceActual());
        System.out.println(cuentaPlatino);
    }
}
