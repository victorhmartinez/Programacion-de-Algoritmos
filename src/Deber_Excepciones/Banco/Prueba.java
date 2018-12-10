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
        //Creamos nuestros objetos de tipo banco con las difentes cuentas
        Banco cuentaAho = new Ahorro(15, "juan", 123);
        Banco cuentaCheues = new Cheques(15, "Pedro", 192);
        Banco cuentaPlatino = new Platino(12, "Ernesto", 152);
        //Cuentas de cheques
        //Usamos un ciclo do-while para controlar el ingreso de datos
        do {
            //usamos un try para decir en q lugar se pude lanzar un excepcion
            try {
                //Pedimos el ingreso de la cantidad
                System.out.println("Ingrese la cantidda a Retirar");
                cant = leer.nextInt();
                cuentaCheues.retirar(cant);
                break;
                //Capturamos la excepcion
            } catch (InputMismatchException e) {
                //Mandamos un mesaje de error
                System.out.println("Error !!! Ingrese un numero");
                ///usamos un nextLine en caso q vuelva escribir una cadena

                leer.nextLine();
                //usamos continue para que nuestro programa no se detenga
                continue;
            }
            //Condicion del while
        } while (true);
        //Usamos un ciclo do-while para controlar el ingreso de datos   
        do {
            //usamos un try para decir en q lugar se pude lanzar un excepcion
            try {
                System.out.println("Ingrese la cantidad a Depositar");
                cant = leer.nextInt();

                cuentaCheues.depositar(cant);
                break;
                //Capturamos la excepcion
            } catch (InputMismatchException e) {
                System.out.println("Error!! debe ingresar un numero");
                ///usamos un nextLine en caso q vuelva escribir una cadena
                leer.nextLine();
                //usamos continue para nuestro programa no se detenga
                continue;
            }
        } while (true);
        //Presentamos el balnce
        System.out.println("Su balnce es de : " + cuentaCheues.obtenerBalanceActual());
        //Presentamos los datos de la cuenta
        System.out.println(cuentaCheues);
        //Cuenta de ahorros

        //Usamos un ciclo do-while para controlar el ingreso de datos
        do {
            //usamos un try para decir en q lugar se pude lanzar un excepcion
            try {
                //Pedimos el ingreso de la cantidad
                System.out.println("Ingrese la cantidda a Retirar");
                cant = leer.nextInt();
                cuentaAho.retirar(cant);
                break;
                //Capturamos la excepcion
            } catch (InputMismatchException e) {
                //Mandamos un mesaje de error
                System.out.println("Error !!! Ingrese un numero");
                ///usamos un nextLine en caso q vuelva escribir una cadena

                leer.nextLine();
                //usamos continue para que nuestro programa no se detenga
                continue;
            }
            //Condicion del while
        } while (true);
        //Usamos un ciclo do-while para controlar el ingreso de datos   
        do {
            //usamos un try para decir en q lugar se pude lanzar un excepcion
            try {
                System.out.println("Ingrese la cantidad a Depositar");
                cant = leer.nextInt();

                cuentaAho.depositar(cant);
                break;
                //Capturamos la excepcion
            } catch (InputMismatchException e) {
                System.out.println("Error!! debe ingresar un numero");
                ///usamos un nextLine en caso q vuelva escribir una cadena
                leer.nextLine();
                //usamos continue para nuestro programa no se detenga
                continue;
            }
        } while (true);
        //Presentamos el balnce
        System.out.println("Su balnce es de : " + cuentaAho.obtenerBalanceActual());
        //Presentamos los datos de la cuenta
        System.out.println(cuentaAho);
        
        //Cuenta Platino
       //Usamos un ciclo do-while para controlar el ingreso de datos
        do {
            //usamos un try para decir en q lugar se pude lanzar un excepcion
            try {
                //Pedimos el ingreso de la cantidad
                System.out.println("Ingrese la cantidda a Retirar");
                cant = leer.nextInt();
                cuentaPlatino.retirar(cant);
                break;
                //Capturamos la excepcion
            } catch (InputMismatchException e) {
                //Mandamos un mesaje de error
                System.out.println("Error !!! Ingrese un numero");
                ///usamos un nextLine en caso q vuelva escribir una cadena
                
                leer.nextLine();
                //usamos continue para que nuestro programa no se detenga
                continue;
            }
            //Condicion del while
        } while (true);
    //Usamos un ciclo do-while para controlar el ingreso de datos   
        do {
            //usamos un try para decir en q lugar se pude lanzar un excepcion
            try {
                System.out.println("Ingrese la cantidad a Depositar");
                cant = leer.nextInt();

                cuentaPlatino.depositar(cant);
                break;
                //Capturamos la excepcion
            } catch (InputMismatchException e) {
                System.out.println("Error!! debe ingresar un numero");
                ///usamos un nextLine en caso q vuelva escribir una cadena
                leer.nextLine();
                //usamos continue para nuestro programa no se detenga
                continue;
            }
        } while (true);
        //Presentamos el balnce
        System.out.println("Su balnce es de : " + cuentaPlatino.obtenerBalanceActual());
        //Presentamos los datos de la cuenta
        System.out.println(cuentaPlatino);
    }
}
