package paquete2;

import paquete1.Clase1;

/**
 *
 * @author santi
 */
public class ClaseHija extends Clase1{
    public ClaseHija(){
        super();
        this.atributoProtected = "Modificacion atributo protected";
        System.out.println("claseHija = " + this.atributoProtected);
        this.metodoProtected();
    }
}
