//Mi clase en Java
package HolaMundo;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class HolaMundo {

    public static void main(String args[]) {
        var a = 3;
        var b = -a;
        System.out.println(a);
        System.out.println(b);
        
        var c = true;
        var d = !c;
        System.out.println(c);
        System.out.println(d);
        
        //incremento
        //1.preincremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e;
        System.out.println(e);
        System.out.println(f);
        //2.postincremento (simbolo despues de la variable)
        var g = 5;
        var h = g++;
        System.out.println(g);
        System.out.println(h);
        
        //decremento
        //1.predecremento
        var i = 2;
        var j = --i;
        System.out.println(i);
        System.out.println(j);
        
        //2.postdecremento
        var k = 4;
        var l = k--;
        System.out.println(k);
        System.out.println(l);
        
    }
}
