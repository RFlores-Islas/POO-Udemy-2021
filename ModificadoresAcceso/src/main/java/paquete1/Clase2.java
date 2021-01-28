
package paquete1;

public class Clase2 {
    
    public Clase2(){
    //Prueba de constructores de la Clase1 
    new Clase1();//Llamada al constructor publico 
    new Clase1("Hola", "Mundo");//Llamada al constructor protected
    new Clase1("uno","dos","tres");//Lamada al contructor default
   // new Clase1("uno","dos","tres", "cuatro"); constructor privado
    }
    
    public void pruebaDesdeClase2(){
        Clase1 c1 = new Clase1();
        System.out.println("atributo publico "+c1.stringPublico);
        System.out.println("atributo protegido "+c1.atributoProtegido);
        System.out.println("atributo default "+c1.atributoDefault);
       // System.out.println("atributo privado "+c1.atributoPrivado); atributo privado
        System.out.println("");
        System.out.println("Metodo publico "+c1.metodoPublico());
        System.out.println("Metodo protegido "+c1.metodoProtegido());
        System.out.println("Metodo default "+c1.metodoDefault());
        //System.out.println("Metodo privado "+c1.metodoPrivado()); metodo privado
    }
    
    public static void main(String[] args) {
        Clase2 c2 = new Clase2();
        c2.pruebaDesdeClase2();
    }
    
}
