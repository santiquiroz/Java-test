package test;

/**
 *
 * @author santi
 */
public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //clase envolvente de tipos primitivos'
        /*
        int - Integer
        long - Long
        floar - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char = Character
        */
        
        Integer entero= 10;//aUTOBOXING
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.toString());
        
        int entero2 = entero;//Unboxing
        System.out.println("entero2 = " + entero2);
    }
}
