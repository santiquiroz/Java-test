//Mi clase en Java
package HolaMundo;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class HolaMundo {
    
    public static void main(String args[]) {
        var mes = 4;
        var estacion = "Estacion desconocida";
        
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "invierno";
        }
        else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "primavera";
        }
        else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "verano";
        }
        else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "otono";
        }
        System.out.println("estacion = " + estacion);
    }
}
