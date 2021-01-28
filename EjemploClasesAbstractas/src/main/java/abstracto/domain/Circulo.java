
package abstracto.domain;

public class Circulo extends FiguraGeometrica{
    
    public Circulo(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){
        //Se agrega el comportamiento del metodo abstracto
        System.out.println("Aqui debes dibujar "+this.getClass().getSimpleName());
    }
    
    
}
