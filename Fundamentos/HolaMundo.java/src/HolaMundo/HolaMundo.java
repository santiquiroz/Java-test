//Mi clase en Java
package HolaMundo;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class HolaMundo {

    public static void main(String args[]) {
        String nombre;
        int id;
        double precio;
        boolean envioGratuito;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio");
        precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        envioGratuito = Boolean.parseBoolean(scanner.nextLine());
        
        char simbolo = '$';
        
        System.out.println(nombre + " #" + id + "\n" + "Precio: " + simbolo + precio + "\n" + "Envio gratuito: " + envioGratuito);
    }
}
