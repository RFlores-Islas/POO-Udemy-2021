
package paquete1;

public class Clase1 {
    //Definir atributos
    
    public String stringPublico = "Valor atributo publico";
    protected String atributoProtegido = "Valor atributo protegido";
    String atributoDefault = "Valor atributo por defecto o package";
    private String atributoPrivado = "Valor atributo privado";
    
    public Clase1(){
        System.out.println("Constructor publico vacio");
    }
    
    public Clase1(String texto){
        System.out.println("Constructor public con un argumento = "+texto);
    }
    
    protected Clase1(String texto, String texto2){
        System.out.println("Constructor protected con dos argumentos"+ texto +", "+texto2);
    }
    
    Clase1(String texto, String texto1, String texto2){
        System.out.println("Constructor default o package");
    }
    
    private Clase1(String texto, String texto1, String texto2, String texto3){
        System.out.println("Constructor privado"); 
    }
    
    //Metodos de la clase
    public String metodoPublico(){
        return "metodo Publico";
    }
    
    protected String metodoProtegido(){
        return "metodo Protegido";
    }
    
    String metodoDefault(){
        return "metodo por defecto";
    }
    
    private String metodoPrivado(){
        return "metodo Privado";
    }
}
