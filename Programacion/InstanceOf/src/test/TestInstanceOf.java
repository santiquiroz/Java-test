package test;

import domain.Empleado;
import domain.Gerente;

/**
 *
 * @author santi
 */
public class TestInstanceOf {

    public static void main(String[] args) {
        Empleado empeado = new Empleado("Juan", 5000);
        //determinarTipo(empeado);
        Gerente gerente = new Gerente("Karla", 1000, "Contabilidad");
        determinarTipo(gerente);
        
    }
    
    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
            Gerente gerente = (Gerente) empleado;
            System.out.println(gerente.getClass());
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            System.out.println("empleado = " + empleado.getNombre());
        }
        else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
            System.out.println("empleado = " + empleado);
        }
    }
}
