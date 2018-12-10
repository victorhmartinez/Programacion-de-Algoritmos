
package Semana3.Deber;


public class PruebaFactura {
    //Metodo main para la copilacion y ejcuatacion de nuestro proyecto
    public static void main(String[] args) {
        //Creacion de dos objetos para ejemplizar las capacidades de nuestra factura
        Factura factura1 = new Factura("0", "Martillo", 3,3.2);
        Factura factura2= new Factura("1", "Clavos", 45, -3.2);
        
        //se llama al metodo toString para presentar los valores de nuestro objetos
        System.out.println(factura1);
        //se llama a nuestro metodo MontoFactura para obbtener el monto total de la factura1
        System.out.printf("Monto Total %.2f:\n ",factura1.MontoFactura());
        System.out.println("---------- o ----------");
        
        //se llama al metodo toString para presentar los valores de nuestro objeto factura2
        System.out.println(factura2);
        //se llama a nuestro metodo MontoFactura para obbtener el monto total de la factura2
        System.out.printf("Monto Total %.2f: \n",factura2.MontoFactura());
    }
}
