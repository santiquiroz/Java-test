//Mi clase en Java
package HolaMundo;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class HolaMundo {

    public static void main(String args[]) {
        /*
            tipos primitivos enteros: byte, short, int, long
        */
        
        byte numeroByte = (byte)129;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("valor maximo byte: " + Byte.MAX_VALUE);
        
        short numeroShort = (short)32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("valor minimo short: " + Short.MIN_VALUE);
        System.out.println("valor maximo short: " + Short.MAX_VALUE);
        
        int numeroInt = (int)2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("valor maximo int: " + Integer.MAX_VALUE);
        
        long numeroLong = (long)9223372036854775808F;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("valor minimo long: " + Long.MIN_VALUE);
        System.out.println("valor maximo long: " + Long.MAX_VALUE);
    }
}
