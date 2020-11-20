package Model;

public class DenunciaModel extends LocalModel {
    
    private int id_Denuncia;
    private String descricao;
    private String ocorrendoNoMomento;
    private String dataOcorrencia;
    private String horaOcorrencia;

    //Construtor Vazio
    public DenunciaModel() {
        
    }

    //Contrutor com parâmetros
    public DenunciaModel(int id_Denuncia, String descricao, String ocorrendoNoMomento, String dataOcorrencia, String horaOcorrencia) {
        this.id_Denuncia = id_Denuncia;
        this.descricao = descricao;
        this.ocorrendoNoMomento = ocorrendoNoMomento;
        this.dataOcorrencia = dataOcorrencia;
        this.horaOcorrencia = horaOcorrencia;
    }
    
    // Construtor com atributos da super classe
    public DenunciaModel(int id_Denuncia, String descricao, String ocorrendoNoMomento, String dataOcorrencia, String horaOcorrencia, String logradouro, String cidade, String estado, String bairro) {
        super(logradouro, cidade, estado, bairro);
        this.id_Denuncia = id_Denuncia;
        this.descricao = descricao;
        this.ocorrendoNoMomento = ocorrendoNoMomento;
        this.dataOcorrencia = dataOcorrencia;
        this.horaOcorrencia = horaOcorrencia;
    }
    
    //Getter and Setter
    public int getId_Denuncia() {
        return id_Denuncia;
    }

    public void setId_Denuncia(int id_Denuncia) {
        this.id_Denuncia = id_Denuncia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOcorrendoNoMomento() {
        return ocorrendoNoMomento;
    }

    public void setOcorrendoNoMomento(String ocorrendoNoMomento) {
        this.ocorrendoNoMomento = ocorrendoNoMomento;
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
