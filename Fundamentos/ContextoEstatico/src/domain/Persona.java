package domain;

/**
 *
 * @author santi
 */
public class Persona {
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;
    
    public Persona(String nombre){
        this.nombre = nombre;
        //incrementar
        Persona.contadorPersonas ++ ;
        
        this.idPersona = Persona.contadorPersonas;
    }
}
