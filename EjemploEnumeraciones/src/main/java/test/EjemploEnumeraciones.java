
package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

public class EjemploEnumeraciones {
    
    public static void main(String[] args) {
        //valores de la enumeracion
        System.out.println("Valor 1: "+Dias.LUNES);
        System.out.println("Valor 2: "+Dias.MARTES);
        
        //utilizar la enumeracion de paises
        
        System.out.println("Continente no. 4: "+ Continentes.AMERICA);
        System.out.println("Acceder el numero de paises del continente 4: "+ Continentes.AMERICA.getPaises());
        System.out.println("Continente no. 1: "+Continentes.AFRICA);
        System.out.println("Acceder el numero de paises del continente 1: "+Continentes.AFRICA.getPaises());
        
        
        indicarDia(Dias.DOMINGO);
        
    }
    
    private static void indicarDia(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Ultimo dia de la semana");
                break;
            default :
                System.out.println("Dia erroneo");
        }
    }
    
}
