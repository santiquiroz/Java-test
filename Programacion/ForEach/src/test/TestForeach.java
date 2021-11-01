package test;

import domain.Persona;

/**
 *
 * @author santi
 */
public class TestForeach {

    public static void main(String[] args) {
        int edades[] = {5, 6, 8, 9};
        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }
        
        Persona personas[] = {new Persona("Juan"), new Persona("Santiago"), new Persona("Karla")};
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
}
