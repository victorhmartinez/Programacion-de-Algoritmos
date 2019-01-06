
package Deber_Files;


import java.util.ArrayList;



public class UTPL_MAD {

    public static ArrayList<Estudiantes> Nomina = new ArrayList<Estudiantes>();

    public static void main(String[] args) {
        //Intanciamos  nuestra clase metodo
        Metodos u = new Metodos();
        //Con nuestra  varible llamamos nustro metodos 
        u.crearRegistros();
        u.leerRegistro(Nomina);
        u.guardarNomina(Nomina);
       

    }

}
