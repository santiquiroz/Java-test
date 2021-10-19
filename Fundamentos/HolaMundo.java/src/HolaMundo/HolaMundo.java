//Mi clase en Java
package HolaMundo;

/**
 *
 * @author santi
 */
public class HolaMundo {

    public static void main(String args[]) {
        var usuario = "Juan xd";
        var titulo = "don Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j);//se realiza suma de numeros
        System.out.println(i + j +usuario);//Evaluacion de izquierda a derecha, hace suma antes
        System.out.println(usuario + i + j);//contexto cadena
        System.out.println(usuario + (i + j));//parentesis cambian orden
    }
}
