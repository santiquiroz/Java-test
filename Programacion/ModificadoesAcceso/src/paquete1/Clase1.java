package paquete1;

/**
 *
 * @author santi
 */
class Clase1 {
    String atributoDefault = "Valor atributo default";
    
    private String atributoPrivado = "valor atributo privado";
    
    public String atributoPublico = "Valor publico";
    
    protected String atributoProtected = "valor protected";
    
    private Clase1(){
        System.out.println("Constructor privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
    public Clase1(String arg){
        this();
        System.out.println("Constructor publico");
    }
    
    void metodoDefault(){
        System.out.println("Metodo default");
    }
    
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }
    
    public void metodoPublico(){
        System.out.println("Metodo publico");
    }
    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }
}
