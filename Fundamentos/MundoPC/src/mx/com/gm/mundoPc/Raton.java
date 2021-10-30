
package mx.com.gm.mundoPc;

/**
 *
 * @author santi
 */
public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRatones;
    public Raton(String ripoEntrada, String marca) {
        super(ripoEntrada, marca);
        idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{idRaton=").append(idRaton);
        sb.append("DispositivoEntrada").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
