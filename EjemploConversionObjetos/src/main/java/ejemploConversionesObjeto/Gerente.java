
package ejemploConversionesObjeto;

public class Gerente extends Empleado{
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    public String obtenerDetalle(){
        return super.obtenerDetalles()+", departamento: "+this.departamento;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    
}
