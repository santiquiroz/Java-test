//Mi clase en Java
package HolaMundo;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class HolaMundo {

    public static void main(String args[]) {
        var a = 3;
        var b = 2;
        
        var c = (a == b);
        System.out.println("c = " + c);
        
        var d = a != b;
        System.out.println("d = " + d);
        
        var cadena = "Hola";
        var cadena2 = "Hola";
        var e = cadena == cadena2;// compara referencia de objetos 
        System.out.println("e = " + e);
        
        var f = cadena.equals(cadena2);// comparamos contenidos de cadenas
        System.out.println("f = " + f);
    }
}
