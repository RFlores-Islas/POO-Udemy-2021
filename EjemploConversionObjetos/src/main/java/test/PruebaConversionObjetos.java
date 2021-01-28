
package test;

import ejemploConversionesObjeto.Empleado;
import ejemploConversionesObjeto.Escritor;
import ejemploConversionesObjeto.Gerente;
import ejemploConversionesObjeto.TipoEscritura;

public class PruebaConversionObjetos {
    
    public static void main(String[] args) {
        Empleado empleado;
        empleado  = new Escritor("Roy", 5000, TipoEscritura.CLASICO);
        
        System.out.println(empleado.obtenerDetalles());
        
        Escritor escritor = (Escritor) empleado;
        System.out.println(escritor.getTipoEscrituraEnTexto());
        
        System.out.println(((Escritor)empleado).getTipoEscrituraEnTexto());
    
        empleado = new Gerente("Laura", 6000, "Sistemas");
        
        System.out.println(((Gerente)empleado).getDepartamento());
        
    }
}
