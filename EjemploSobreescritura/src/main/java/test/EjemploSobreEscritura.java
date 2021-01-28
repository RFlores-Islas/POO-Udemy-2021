package test;

import ejemploSobreEscritura.Empleado;
import ejemploSobreEscritura.Gerente;

public class EjemploSobreEscritura {
    
    public static void main(String[] args) {
        Empleado empleado = new Empleado ("Juan", 1000);
        System.out.println("Empleado = " + empleado.obtenerDetalles());
        
        Gerente gerente = new Gerente("Karla ",2000, "Finanzas");
        System.out.println("Gerente = " + gerente.obtenerDetalles());
    }
    
}
