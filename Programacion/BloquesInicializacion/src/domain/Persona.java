package domain;

/**
 *
 * @author santi
 */
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    //primera vez cuando se carga en memoria
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
        //idPersona
    }
    //con cada instancia de la clase
    // contexto dinamico no estatico (antes del constructor
    {
        System.out.println("Ejecucion bloque No estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}
