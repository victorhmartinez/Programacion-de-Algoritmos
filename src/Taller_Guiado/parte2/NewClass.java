package Taller_Guiado.parte2;



import java.util.ArrayList;

class Seres_Habladores {
    public String nombre;
    public String estado;

    public Seres_Habladores() {
    }

    public Seres_Habladores(String nombre, String estado) {
        this.nombre = nombre;
        this.estado= estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String hablar(){
        
       return  "Hola me llamo " + getNombre()+" y se hablar \nSoy "+estado ;
        
    }
}
class Loro extends Seres_Habladores{

    public String edad;

    public Loro(String estado, String edad, String nombre) {
        super(nombre,estado);
       
        this.edad = edad;
    }

    public Loro() {
    }
    

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    @Override
    public String hablar (){
        String ms=super.hablar();
        return ms+"\n"+edad;
    }
}
class Perosna extends Seres_Habladores{
    public int edad;
    public String grado;

    public Perosna(int edad, String grado, String nombre, String estado) {
        super(nombre, estado);
        this.edad = edad;
        this.grado = grado;
    }

    public Perosna() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    
    
}

class Adulto extends  Perosna{
    public int anioNa;
    public int diaNa;
    public String mesNa;

    public Adulto(int anioNa, int diaNa, String mesNa, int edad, String grado, String nombre, String estado) {
        super(edad, grado, nombre, estado);
        this.anioNa = anioNa;
        this.diaNa = diaNa;
        this.mesNa = mesNa;
    }

    public Adulto() {
    }

    public int getAnioNa() {
        return anioNa;
    }

    public void setAnioNa(int anioNa) {
        this.anioNa = anioNa;
    }

    public int getDiaNa() {
        return diaNa;
    }

    public void setDiaNa(int diaNa) {
        this.diaNa = diaNa;
    }

    public String getMesNa() {
        return mesNa;
    }

    public void setMesNa(String mesNa) {
        this.mesNa = mesNa;
    } 
    @Override
    public String hablar (){
       String ms = super.hablar();
       return  ms+"\nTengo "+(2018-anioNa)+" Años"+"\nNaci el "+diaNa+" de "+mesNa+" del "+anioNa+"\nSoy "+grado;
    }
}

class Niño extends Perosna{

    public Niño(int edad, String grado, String nombre, String estado) {
        super(edad, grado, nombre, estado);
    }
 public Niño(){
     
 }
 
    @Override
    public String hablar (){
       String ms=super.hablar();
       return ms+"\nTengo "+edad+" años \nSoy "+grado;
    }
}

 class PreubaSeres {
    public static ArrayList <Seres_Habladores> habladores = new ArrayList<>();
    
    public static void main(String[] args) {
        Seres_Habladores loro= new Loro("Irracional", "No se mi edad", "Periquito");
        Seres_Habladores adulto = new Adulto(1998, 3, "Noviembre", 20, "Adulto", "Victor", "Racional");
        Seres_Habladores niño =new Niño(9, "Niño", "Alex", "Racional");
         habladores.add(loro);
         habladores.add(adulto);
         habladores.add(niño);
          for( Seres_Habladores seres:habladores){
              System.out.println("-----------o----------");
              System.out.println(seres.hablar());
          }
         
    }
    
}
