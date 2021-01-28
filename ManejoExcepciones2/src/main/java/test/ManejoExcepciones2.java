
package test;

import datos.*;
import datos.ImplementacionMySql;
import excepciones.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ManejoExcepciones2 {
    
    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionMySql();
        datos.simularError(false);
        ejecutar(datos, "listar");
    }
    
    private static void ejecutar(AccesoDatos datos, String accion){
        if("listar".equals(accion)){
            try {
                datos.listar();
            } catch (LecturaDatosEx ex) {
                System.out.println("Error de lectura");
                ex.printStackTrace(System.out);
           } 
            catch (AccesoDatosEx ex) {
                System.out.println("Error acceso a datos");
                ex.printStackTrace(System.out);
           }
             catch (Exception ex) {
                 System.out.println("Error general");
                 ex.printStackTrace(System.out);
           }
            finally{
                System.out.println("Procesar finally es opcional");
            }
            
        }else if("insertar".equals(accion)){
            try {
                datos.insertar();
            } catch (AccesoDatosEx ex) {
                System.out.println("E   xcepcion de acceso a datos");
                ex.printStackTrace(System.out);
            }
            finally{
                System.out.println("Proceso finally opcional");
            }
        }else{
            System.out.println("No se proporciono ninguna accion conocida");
        }
    }
}
