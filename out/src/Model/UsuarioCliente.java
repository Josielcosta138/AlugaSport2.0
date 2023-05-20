package Model;

public class UsuarioCliente {

    private Integer codigoUsuarioCliente;
    private String nome;
    private String telefone;
    private String cpf;
    private String rg;
    private Boolean cliente;

    public UsuarioCliente(Integer codigoUsuarioCliente, String nome, String telefone, String cpf, String rg, Boolean cliente) {
        this.codigoUsuarioCliente = codigoUsuarioCliente;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
        this.cliente = cliente;
    }

    public Integer getCodigoUsuarioCliente() {
        return codigoUsuarioCliente;
    }

    public void setCodigoUsuarioCliente(Integer codigoUsuarioCliente) {
        this.codigoUsuarioCliente = codigoUsuarioCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Boolean getCliente() {
        return cliente;
    }

    public void setCliente(Boolean cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "UsuarioCliente{" +
                "codigoUsuarioCliente=" + codigoUsuarioCliente +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", cliente=" + cliente +
                '}';
    }
}
