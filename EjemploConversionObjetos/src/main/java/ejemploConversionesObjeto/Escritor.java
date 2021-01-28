package ejemploConversionesObjeto;

public class Escritor extends Empleado{
    
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", Tipo de Escritura"+ tipoEscritura.getDescripcion();
    }
    
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
    
    public String getTipoEscrituraEnTexto(){
        return tipoEscritura.getDescripcion();
    }
}
