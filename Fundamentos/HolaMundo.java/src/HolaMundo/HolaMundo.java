//Mi clase en Java
package HolaMundo;

/**
 *
 * @author santi
 */
public class HolaMundo {
    public static void main(String args[]){
        //Definimos la variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        
        //Modificamos el valor de la varaible
        miVariableEntera = 5;        
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Salu2";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "aGod";
        System.out.println(miVariableCadena);
        
        // var Inferencia de tipos en Java
        
        var miVariableEntera2 = 10;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        var MiVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        
    }
}
