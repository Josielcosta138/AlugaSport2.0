package Model;

public class Estado {

    private Integer codigoEstado;
    private String nomeEstado;
    private char sigla;
    private Pais pais;

    public Estado(Integer codigoEstado, String nomeEstado, char sigla, Pais pais) {
        this.codigoEstado = codigoEstado;
        this.nomeEstado = nomeEstado;
        this.sigla = sigla;
        this.pais = pais;
    }


    public Integer getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(Integer codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public char getSigla() {
        return sigla;
    }

    public void setSigla(char sigla) {
        this.sigla = sigla;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "codigoEstado=" + codigoEstado +
                ", nomeEstado='" + nomeEstado + '\'' +
                ", sigla=" + sigla +
                ", pais=" + pais +
                '}';
    }
}
