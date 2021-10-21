package operaciones;

/**
 *
 * @author santi
 */
public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //Constructor vacio
    public Aritmetica () {
        System.out.println("Ejecutando constructor");
    }
    
    public Aritmetica (int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con arg");
    }
    
    //Metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        return(a + b);
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        return a+b;
    }
}
