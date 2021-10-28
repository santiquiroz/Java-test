package test;

/**
 *
 * @author santi
 */
import dominio.*;
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan xds", 5000.00, false);
        persona1.setNombre("JUan carols");
        System.out.println("Persona 1 nombre: "+persona1.getNombre());
        System.out.println("persona1 sueldo= " + persona1.getSueldo());
    }
}
