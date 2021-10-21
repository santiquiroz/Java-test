package geometria;

/**
 *
 * @author santi
 */
public class PruebaGeometria {
    public static void main(String[] args) {
        Caja caja1 = new Caja();
        caja1.alto = 2;
        caja1.ancho = 3;
        caja1.profundo = 6;
        System.out.println("volumen caja1: "+caja1.calcularVolumen());
        
        Caja caja2 = new Caja(3,2,6);
        System.out.println("volumen caja2: "+caja2.calcularVolumen());
    }
}
