//Mi clase en Java
package HolaMundo;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class HolaMundo {

    public static void main(String args[]) {
        System.out.println("Proporciona el titulo:");
        Scanner consola = new Scanner(System.in);
        var titulo = consola.nextLine();
        System.out.println("Proporciona el autor:");
        var autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
