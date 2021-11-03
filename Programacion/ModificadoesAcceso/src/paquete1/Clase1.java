package paquete1;

/**
 *
 * @author santi
 */
class Clase1 {
    String atributoDefault = "Valor atributo default";
    
    public String atributoPublico = "Valor publico";
    
    protected String atributoProtected = "valor protected";
    
    Clase1(){
        System.out.println("Constructor default");
    }
    
    void metodoDefault(){
        System.out.println("Metodo default");
    }
    
    public void metodoPublico(){
        System.out.println("Metodo publico");
    }
    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }
}
