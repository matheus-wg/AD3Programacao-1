
package control;

import model.reportarbug;
public class reportarbug {
    
    private String email;
    private String descricaoBug;

    //Construtor vazio
    public reportarbug() {
    }

    //Construtor com parâmetros
    public reportarbug(String email, String descricaoBug) {
        this.email = email;
        this.descricaoBug = descricaoBug;
    }
}