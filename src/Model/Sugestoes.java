
package Model;

public class Sugestoes {
    
    private String email;
    private String sugestao;

    //Construtor vazio
    public Sugestoes() {
    }

    //Construtor com parâmetros
    public Sugestoes(String email, String sugestao) {
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
