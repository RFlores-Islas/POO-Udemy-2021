
package paquete2;

import paquete1.Clase1;

public class Clase4 {
    public Clase4(){
        //super("uno", "dos");//Con esto se puede utilizar un elemento protegido
        new Clase1();//Llamada al constructor publico 
      
    }
    
          public void pruebaDesdeClase4(){
        Clase1 c1 = new Clase1();
        System.out.println("atributo publico "+c1.stringPublico);
       //System.out.println("atributo protegido "+ atributoProtegido);
        //System.out.println("atributo default "+ c1.atributoDefault);
       //System.out.println("atributo privado "+c1.atributoPrivado); atributo privado
        System.out.println("");
        System.out.println("Metodo publico "+c1.metodoPublico());
        //System.out.println("Metodo protegido "+ metodoProtegido());
        //System.out.println("Metodo default "+c1.metodoDefault());
        //System.out.println("Metodo privado "+c1.metodoPrivado()); metodo privado
    }
        public static void main(String[] args) {
        Clase4 c4 = new Clase4();
        c4.pruebaDesdeClase4();
    } 
    
}
