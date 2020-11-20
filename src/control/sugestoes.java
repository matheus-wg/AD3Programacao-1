
package control;

import model.sugestoes;
public class sugestoes {
    
    private String email;
    private String sugestao;

    //Construtor vazio
    public sugestoes() {
    }

    //Construtor com parâmetros
    public sugestoes(String email, String sugestao) {
        this.email = email;
        this.sugestao = sugestao;
    }
}