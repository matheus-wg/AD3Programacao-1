
package Model;


public class ReportarBug {
    
    private String email;
    private String descricaoBug;

    //Construtor vazio
    public ReportarBug() {
    }

    //Construtor com parâmetros
    public ReportarBug(String email, String descricaoBug) {
        this.email = email;
        this.descricaoBug = descricaoBug;
    }
    
    //Getter and Setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricaoBug() {
        return descricaoBug;
    }

    public void setDescricaoBug(String descricaoBug) {
        this.descricaoBug = descricaoBug;
    }
    
    
}
