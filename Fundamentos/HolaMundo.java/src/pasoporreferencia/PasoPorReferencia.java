
package pasoporreferencia;

import clases.Persona;

/**
 *
 * @author santi
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Kuan xd xd";
        System.out.println("persona1 nombre = " + persona1.nombre);
        cambioValor(persona1);
        System.out.println("persona1 cambio nombre = " + persona1.nombre);
    }
    
    public static void cambioValor(Persona persona){
        persona.nombre = "Karla";
    }
}
