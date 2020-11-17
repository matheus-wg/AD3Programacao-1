package Model;

public class Denuncia {
    
    private int numeroDenuncia;
    private String protocolo;
    private String descricao;
    private boolean ocorrendoNoMomento;

    //Construtor Vazio
    public Denuncia() {
    }

    //Contrutor com parâmetros
    public Denuncia(int numeroDenuncia, String protocolo, String descricao, boolean ocorrendoNoMomento) {
        this.numeroDenuncia = numeroDenuncia;
        this.protocolo = protocolo;
        this.descricao = descricao;
        this.ocorrendoNoMomento = ocorrendoNoMomento;
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
    
    
}
