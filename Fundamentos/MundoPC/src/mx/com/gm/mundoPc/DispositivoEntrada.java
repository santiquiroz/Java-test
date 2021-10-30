package mx.com.gm.mundoPc;

/**
 *
 * @author santi
 */
public class DispositivoEntrada {
    private String ripoDeEntrada;
    private String marca;
    
    public DispositivoEntrada(String ripoEntrada, String marca){
        this.ripoDeEntrada = ripoEntrada;
        this.marca = marca;
    }

    public String getRipoDeEntrada() {
        return ripoDeEntrada;
    }

    public void setRipoDeEntrada(String ripoDeEntrada) {
        this.ripoDeEntrada = ripoDeEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispositivoEntrada{ripoDeEntrada=").append(ripoDeEntrada);
        sb.append(", marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }
    
    
}
