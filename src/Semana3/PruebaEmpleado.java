/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

/**
 *
 * @author Usuario
 */
public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan","Perez",-4550);
        System.out.println(empleado1.salario);
        
        
        System.out.println("Datos  empleado 1");
        System.out.println("Nombre:"+empleado1.getNombre());
        System.out.println("Apellido:"+empleado1.getApellido());     
        System.out.println("Su salario es :"+empleado1.getSalario());
        System.out.println("Salario Anual es :"+(empleado1.getSalario()*12));
        System.out.println("Su salrio aumentado en un 10% es "+(empleado1.getSalario()*1.10));
        
      
    }
}
