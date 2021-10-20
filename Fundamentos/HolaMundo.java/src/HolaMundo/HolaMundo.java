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
        System.out.println("Proporciona el alto: ");
        var alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el ancho: ");
        var ancho = Integer.parseInt(scanner.nextLine());
        
        var area = alto * ancho;
        var perimetro = (alto + ancho) * 2;
        
        System.out.println("Area: " + area);
        System.out.println("Perimetro: "+ perimetro);
    }
}
