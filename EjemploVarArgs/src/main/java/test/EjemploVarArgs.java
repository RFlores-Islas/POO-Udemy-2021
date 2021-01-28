
package test;

/**
 *
 * @author Rafael
 */
public class EjemploVarArgs {
    
    public static void main(String[] args) {
        //Imprimir varios numeros
        imprimirNumeros(15,1,45,287,2);
        
        //Parametros Variables
        System.out.println("");
        variosParametros("Rafael", true, 12,6,29);
    }
    
    private static void variosParametros(String nombre, boolean bandera, int... numeros){
        System.out.println("nombre = " + nombre);
        System.out.println("bandera = " + bandera);   
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento = " + numeros[i]);
        }
    }

    private static void imprimirNumeros(int... numeros) {
     //Recorrer elementos del arreglo
        for (int i = 0; i < numeros.length; i++) {
            int elemento = numeros[i];
            System.out.println("elemento = " + elemento);
        }
  
    }

   
    
}
