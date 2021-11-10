package test;

import domain.Empleado;
import domain.Gerente;

/**
 *
 * @author santi
 */
public class TestSobrescritura {
    public static void main(String[] args) {
        Empleado  empeado = new Empleado("Juan", 5000);
//        System.out.println("empeado = " + empeado.obtenerDetalles());
        imprimir(empeado);
        
        Gerente gerente = new Gerente("Karla", 1000, "Contabilidad");
        
        imprimir(gerente);
        
//        System.out.println("gerente = " + gerente.obtenerDetalles());
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
