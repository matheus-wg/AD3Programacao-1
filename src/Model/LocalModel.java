package Model;

public class LocalModel {
    private String logradouro;
    private String cidade;
    private String estado;
    private String bairro;

    //Construtor vazio
    public LocalModel() {
    }

    //Construtor com parâmetros
    public LocalModel(String logradouro, String cidade, String estado, String bairro) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
    }
    
    //Getter and Setter
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
}
