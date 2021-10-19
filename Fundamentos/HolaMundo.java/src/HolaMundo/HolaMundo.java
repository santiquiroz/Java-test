//Mi clase en Java
package HolaMundo;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class HolaMundo {

    public static void main(String args[]) {
        int a=3, b=2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        
        resultado = a - b;
        System.out.println("resultado resta = " + resultado );
        
        resultado = a * b;
        System.out.println("resultado multiplicacion= " + resultado);
        
        var resultado2 = 3.0 / b;
        System.out.println("resultado division = " + resultado2);
        
        resultado = a % b;
        System.out.println("resultado2 modulo = " + resultado);
        
        if(b % 2 == 0){
            System.out.println("Es numero par");
        }
        else{
            System.out.println("Es numero impar");
        }
    }
}
