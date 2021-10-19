//Mi clase en Java
package HolaMundo;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class HolaMundo {

    public static void main(String args[]) {
        System.out.println("Escribe tu nombre");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe el titulo:");
        var titulo = consola.nextLine();
        System.out.println("Resultado = " + titulo + " " + usuario);
    }
}
