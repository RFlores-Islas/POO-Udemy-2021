
package paquete2;

import paquete1.Clase1;

public class Clase3  extends Clase1{
    public Clase3() {
        super("uno", "dos");//Con esto se puede utilizar un elemento protegido
        new Clase1();//Llamada al constructor publico 
        /* new Clase1("Hola", "Mundo");//Llamada al constructor protected
    new Clase1("uno","dos","tres");//Lamada al contructor default
         */
    }
    
        public void pruebaDesdeClase3(){
        Clase1 c1 = new Clase1();
        System.out.println("atributo publico "+c1.stringPublico);
        System.out.println("atributo protegido "+ atributoProtegido);
        //System.out.println("atributo default "+ c1.atributoDefault);
       // System.out.println("atributo privado "+c1.atributoPrivado); atributo privado
        System.out.println("");
        System.out.println("Metodo publico "+c1.metodoPublico());
        System.out.println("Metodo protegido "+ metodoProtegido());
        //System.out.println("Metodo default "+c1.metodoDefault());
        //System.out.println("Metodo privado "+c1.metodoPrivado()); metodo privado
    }
        public static void main(String[] args) {
        Clase3 c3 = new Clase3();
        c3.pruebaDesdeClase3();
    } 
    
}
