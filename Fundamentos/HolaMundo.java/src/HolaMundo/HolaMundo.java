//Mi clase en Java
package HolaMundo;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class HolaMundo {

    public static void main(String args[]) {
        var a = 8;
        var valorMinimo = 0;
        var valorMacimo = 10;
        
        var resultado = a >= 0 && a <= 10;
        System.out.println("resultado = " + resultado);
        if (resultado) {
            System.out.println("Dentro del rango");
        }
        else{
            System.out.println("Fuera del rango");
        }
        
        var vacaciones = false;
        var diaDescanso = true;
        
        if (vacaciones || diaDescanso) {
            System.out.println("Padre puede asistir al juego del hijo");
        }
        else{
            System.out.println("El padre esta ocupado");
        }
    }
}
