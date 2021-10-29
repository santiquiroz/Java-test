
package test;

/**
 *
 * @author santi
 */
public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
        edades[0] = 10;
        System.out.println("edades 0 = " + edades[0]);
        
//        edades[3] = 15;
//        System.out.println("edades = " + edades);

        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades elemento = " + edades[i]);
        }
        
        String frutas[] = {"Naranja", "Platano", "Uvas"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas "+i+"= " + frutas[i]);
        }
    }
}
