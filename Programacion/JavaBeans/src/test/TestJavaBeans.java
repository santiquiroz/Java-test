package test;

import domain.Person;

/**
 *
 * @author santi
 */
public class TestJavaBeans {
    public static void main(String[] args) {
        Person persona = new Person();
        persona.setApellido("Perez");
        persona.setNombre("Juan");
        
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre " + persona.getNombre());
    }
}
