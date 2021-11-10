package domain;

/**
 *
 * @author santi
 */
public class Escritor extends Empleado{
    
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", tipoEscritura: " + tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Escritor{tipoEscritura=").append(tipoEscritura);
        sb.append('}');
        return sb.toString();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
    
    
    
}
