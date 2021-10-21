package palabrathis;

/**
 *
 * @author santi
 */
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println(persona);
        System.out.println("persona nombre= " + persona.nombre);
        System.out.println("persona apellido= " + persona.apellido);
    }
}

class Persona {
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        //super(); llamada al constructor padre
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("persona objeto = "+this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("Persona desde imprimir: " + persona);
        System.out.println("impresion del objeto actual (this)" + this);
    }
}