/*
*Derechos resevados Rafael.com
*/
package prueba;

import com.gm.javadoc.Aritmetica;

/**
 *Clase para probar el consepto de javaDoc
 * @author Rafael
 */
public class PruebaJavaDoc {
    /**
     * Metodo para ejecutar la prueba de la clase Aritmetica
     * @param args 
     */
    
    public static void main(String []args){
        Aritmetica aritmetica1 = new Aritmetica(3,2);
        int resultado = aritmetica1.sumar();
        
        System.out.println(resultado);
        
    }
    
}
