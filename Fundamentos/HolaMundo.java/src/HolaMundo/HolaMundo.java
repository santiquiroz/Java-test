//Mi clase en Java
package HolaMundo;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class HolaMundo {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el numero1");
        var numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el numero2");
        var numero2 = Integer.parseInt(scanner.nextLine());
        System.out.println("El numero mayor es: "+((numero1 > numero2) ? numero1 : numero2 ));
    }
}
