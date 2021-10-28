package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

/**
 *
 * @author santi
 */
public class TestHerencia {
       public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000.00);
        System.out.println("empleado1 = " + empleado1);
//        Cliente cliente1 = new Cliente(new Date(), true, "karla", 'F', 20, "En la cloaca");
//           System.out.println("cliente1 = " + cliente1);
    }
}
