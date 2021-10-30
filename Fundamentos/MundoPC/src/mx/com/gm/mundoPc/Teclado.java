package mx.com.gm.mundoPc;

/**
 *
 * @author santi
 */
public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclados;
    public Teclado(String ripoEntrada, String marca) {
        super(ripoEntrada, marca);
        idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{idRaton=").append(idTeclado);
        sb.append("DispositivoEntrada").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
