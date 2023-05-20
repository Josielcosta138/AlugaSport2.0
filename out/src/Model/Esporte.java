package Model;

public class Esporte {

    private Integer codigoEsporte;

    private String nomeEsporte;

    public Esporte(Integer codigoEsporte, String nomeEsporte) {
        this.codigoEsporte = codigoEsporte;
        this.nomeEsporte = nomeEsporte;
    }

    public Integer getCodigoEsporte() {
        return codigoEsporte;
    }

    public void setCodigoEsporte(Integer codigoEsporte) {
        this.codigoEsporte = codigoEsporte;
    }

    public String getNomeEsporte() {
        return nomeEsporte;
    }

    public void setNomeEsporte(String nomeEsporte) {
        this.nomeEsporte = nomeEsporte;
    }

    @Override
    public String toString() {
        return "Esporte{" +
                "codigoEsporte=" + codigoEsporte +
                ", nomeEsporte='" + nomeEsporte + '\'' +
                '}';
    }
}
