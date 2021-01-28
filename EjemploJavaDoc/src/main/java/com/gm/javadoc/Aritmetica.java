
package com.gm.javadoc;
/**
 *Esta clase permitira realizar operaciones como: suma
 * resta, entre otras
 * 
 * @author Rafael
 */
public class Aritmetica {
    /**
     * Primer operando
     */
    int operandoA;
    int operandoB;
    
    /**
     * Contructor vacio de la clase
     */
    public Aritmetica(){
        
    }
    
    /**
     * Constructor con dos argumentos
     * @param operandoA recibe el primer operando
     * @param operandoB recibe el segundo operando
     */
    
    public Aritmetica(int operandoA, int operandoB){
    this.operandoA = operandoA;
    this.operandoB = operandoB; 
    }
    
    
    /**
     * Este metodo realiza la suma de dos operandos enteros 
     *@return int resultado de la suma 
    */
    
    public int sumar(){
        return this.operandoA + this.operandoB;
    }
    
    
    
    
}
