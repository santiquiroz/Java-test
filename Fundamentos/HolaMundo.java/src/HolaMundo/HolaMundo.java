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
        System.out.println("Proporciona un valor entre 0 y 10: ");
        var numero = Integer.parseInt(scanner.nextLine());
        var nota = "Nota desconocida";
        if (0 >= numero && numero < 6) {
            nota = "F";
        }
        else{
            switch(numero){
                case 6:
                    nota = "D";
                    break;
                case 7:
                    nota = "C";
                    break;
                case 8:
                    nota = "B";
                    break;
                case 9: case 10:
                    nota = "A";
                    break;
            }
        }
        System.out.println("nota = " + nota);
    }
}
