
package manejoInterfaces;

import datos.AccesoDatos;
import datos.ImplementacionMySql;
import datos.ImplementacionOracle;


public class ManejoInterfaces {
    
    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionOracle();
        datos.insertar();
        
       datos = new ImplementacionMySql();
       datos.insertar();
       datos.listar();
        System.out.println(AccesoDatos.MAX_REGISTROS);
    }
    
}
