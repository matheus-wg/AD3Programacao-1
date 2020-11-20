
package control;

import model.Local;

public class Local {
private final Local control;
public Local() {
this.control = new Local();
}
// Create
public boolean Local(String logradouro, String cidade, String estado, String cep) {

// O ID que será cadastrado deve vir diretamente da base de dados(DAO).
int id = control.maiorID() + 1;
// Criando um objeto completo de Denuncia com os dados vindos de uma interface gráfica.
Local objeto = new Local(logradouro, cidade, estado, cep);

