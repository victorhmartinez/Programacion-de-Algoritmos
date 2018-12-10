/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1;

/**
 *
 * @author Usuario
 */
public class PersonasV4 {
    public static String nombreEmpresa;
public String sexo;
public int edad;
//Constructores
public PersonasV4() { }
public PersonasV4(String sexo, int edad) {
nombreEmpresa = "Universidad Tecnica";
this.sexo = sexo;
this.edad = edad;
}
//Métodos estaticos y no estaticos
public static double calcularEdad(int anioNacimiento){
int edad = 2015 - anioNacimiento;
return edad;
}
public String getNombreEmpresa(){
return nombreEmpresa;
}
}
