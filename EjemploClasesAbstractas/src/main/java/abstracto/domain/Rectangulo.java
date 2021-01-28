
package abstracto.domain;

public class Rectangulo extends FiguraGeometrica{
       public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){
        //Se agrega el comportamiento del metodo abstracto
        System.out.println("Aqui debes dibujar "+this.getClass().getSimpleName());
    }
    
}
