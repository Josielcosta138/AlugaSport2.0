package Model;

public class Espaco {

    private Integer codigoEspacao;
    private String nomeEspaco;
    private Esporte esporte;

    public Espaco(Integer codigoEspacao, String nomeEspaco, Esporte esporte) {
        this.codigoEspacao = codigoEspacao;
        this.nomeEspaco = nomeEspaco;
        this.esporte = esporte;
    }

    public Integer getCodigoEspacao() {
        return codigoEspacao;
    }

    public void setCodigoEspacao(Integer codigoEspacao) {
        this.codigoEspacao = codigoEspacao;
    }

    public String getNomeEspaco() {
        return nomeEspaco;
    }

    public void setNomeEspaco(String nomeEspaco) {
        this.nomeEspaco = nomeEspaco;
    }

    public Esporte getEsporte() {
        return esporte;
    }

    public void setEsporte(Esporte esporte) {
        this.esporte = esporte;
    }


    @Override
    public String toString() {
        return "Espaco{" +
                "codigoEspacao=" + codigoEspacao +
                ", nomeEspaco='" + nomeEspaco + '\'' +
                ", esporte=" + esporte +
                '}';
    }
}
