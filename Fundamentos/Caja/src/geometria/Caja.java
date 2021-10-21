package geometria;

/**
 *
 * @author santi
 */
public class Caja {
    int ancho;
    int alto;
    int profundo;
    
    public Caja () {
        
    }
    
    public Caja (int ancho, int alto, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }
    
    public int calcularVolumen (){
        return alto * ancho * profundo ;
    }
}
