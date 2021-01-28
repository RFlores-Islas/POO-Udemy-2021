
package datos;

import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;
import excepciones.LecturaDatosEx;

public class ImplementacionMySql implements AccesoDatos{

    private boolean simularError;
    
    @Override
    public void insertar() throws AccesoDatosEx{
        if(simularError){
            throw new EscrituraDatosEx("Error de escritura de datos");
        }
        else{
        System.out.println("Insertar desde MySql");
   }
    }

    @Override
    public void listar() throws AccesoDatosEx{
        if(this.simularError){
            throw new LecturaDatosEx("Error de lectura de datos");
        }else{
              System.out.println("Listar desde MySql");
        }
    }

    @Override
    public void simularError(boolean simulaError) {
        this.simularError = simularError;
    }
    
    public boolean isSimularError(){
       return this.simularError; 
    }
    
}
