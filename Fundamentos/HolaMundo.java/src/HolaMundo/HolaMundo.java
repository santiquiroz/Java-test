//Mi clase en Java
package HolaMundo;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class HolaMundo {

    public static void main(String args[]) {
        for (var contador = 0; contador < 10; contador++) {
            if (contador % 2 != 0) {
                continue;
            }
            System.out.println("contador = " + contador);
        }
        
//        for (var contador = 0; contador < 10; contador++) {
//            if (contador % 2 == 0) {
//                System.out.println("contador = " + contador);
//                break;
//            }
//            System.out.println("contador = " + contador);
//        }
        
//        var contador = 0;
//        while( contador < 3){
//            System.out.println("contador = " + contador);
//            contador++;
//        }
//        var contador = 0;
//        do {
//            System.out.println("contador = " + contador);
//            contador++;
//        } while (contador < 0);

    }
}
