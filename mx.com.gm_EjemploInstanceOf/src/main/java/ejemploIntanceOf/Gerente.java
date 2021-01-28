
package ejemploIntanceOf;

public class Gerente extends Empleado{
    
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    //Sobreescribir el metodo padre heredado
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", Departamento: "+this.departamento;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    
}
