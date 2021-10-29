package test;

/**
 *
 * @author santi
 */
import domain.Persona;
public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //miVariable = 5;
        
//        Persona.MI_CONSTANTE = 5;
        System.out.println("miConstante = " +  Persona.MI_CONSTANTE  );
    }
}
