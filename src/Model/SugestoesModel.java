
package Model;

public class SugestoesModel {
    
    private String email;
    private String sugestao;

    //Construtor vazio
    public SugestoesModel() {
    }

    //Construtor com parâmetros
    public SugestoesModel(String email, String sugestao) {
        this.email = email;
        this.sugestao = sugestao;
    }

    //Getter and Setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSugestao() {
        return sugestao;
    }

    public void setSugestao(String sugestao) {
        this.sugestao = sugestao;
    }
    
    
}
