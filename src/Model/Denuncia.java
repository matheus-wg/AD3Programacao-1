package Model;

public class Denuncia {
    
    private int numeroDenuncia;
    private String protocolo;
    private String descricao;
    private boolean ocorrendoNoMomento;
    //Por enquanto ficara String
    private String dataOcorrencia;
    private String horaOcorrencia;

    //Construtor Vazio
    public Denuncia() {
        
    }

    //Contrutor com parâmetros
    public Denuncia(int numeroDenuncia, String protocolo, String descricao, boolean ocorrendoNoMomento, String dataOcorrencia, String horaOcorrencia) {
        this.numeroDenuncia = numeroDenuncia;
        this.protocolo = protocolo;
        this.descricao = descricao;
        this.ocorrendoNoMomento = ocorrendoNoMomento;
        this.dataOcorrencia = dataOcorrencia;
        this.horaOcorrencia = horaOcorrencia;
    }
    
    //Getter and Setter
    public int getNumeroDenuncia() {
        return numeroDenuncia;
    }

    public void setNumeroDenuncia(int numeroDenuncia) {
        this.numeroDenuncia = numeroDenuncia;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isOcorrendoNoMomento() {
        return ocorrendoNoMomento;
    }

    public void setOcorrendoNoMomento(boolean ocorrendoNoMomento) {
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
