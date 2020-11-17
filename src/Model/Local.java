package Model;

public class Local {
    private String logradouro;
    private String cidade;
    private String estado;
    private String cep;
    //Por enquanto ficara String
    private String dataOcorrencia;
    private String horaOcorrencia;   

    //Construtor vazio
    public Local() {
    }

    //Construtor com parâmetros
    public Local(String logradouro, String cidade, String estado, String cep, String dataOcorrencia, String horaOcorrencia) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.dataOcorrencia = dataOcorrencia;
        this.horaOcorrencia = horaOcorrencia;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(String dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public String getHoraOcorrencia() {
        return horaOcorrencia;
    }

    public void setHoraOcorrencia(String horaOcorrencia) {
        this.horaOcorrencia = horaOcorrencia;
    }
    
    
}
