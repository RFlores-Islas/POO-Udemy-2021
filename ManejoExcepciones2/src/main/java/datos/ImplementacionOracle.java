
package datos;

import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;
import excepciones.LecturaDatosEx;

public class ImplementacionOracle implements AccesoDatos{
    
    private boolean simularError;
    
    @Override
    public void insertar() throws AccesoDatosEx{
          if(simularError){
            throw new EscrituraDatosEx("Error de escritura de datos");
        }
        else{
       System.out.println("Insertar desde Oracle");
   }
        
    }

    @Override
    public void listar() throws AccesoDatosEx{
         if(this.simularError){
            throw new LecturaDatosEx("Error de lectura de datos");
        }else{
             System.out.println("Listar desde Oracle");
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
