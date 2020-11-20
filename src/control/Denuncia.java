
package control;

import java.util.ArrayList;
import model.Denuncia;

public class Denuncia {
private final Denuncia control;
public Denuncia() {
this.control = new Denuncia();
}
// Create
public boolean Realizardenuncia(int numeroDenuncia, String protocolo, String descricao, boolean ocorrendoNoMomento, String dataOcorrencia, String horaOcorrencia) {

// O ID que será cadastrado deve vir diretamente da base de dados(DAO).
int id = control.maiorID() + 1;
// Criando um objeto completo de Denuncia com os dados vindos de uma interface gráfica.
Denuncia objeto = new Denuncia(numeroDenuncia, protocolo, descricao, ocorrendoNoMomento, dataOcorrencia, horaOcorrencia);
// Controlador (Realizardenuncia) envia objeto completo para Aluno enviar para o DAO.

if(control.Denuncia(objeto)){
return true;

}else{
    
return false;
}
}
}
// Delete
public boolean Apagar(int numeroDenuncia, String protocolo, String descricao, boolean ocorrendoNoMomento, String dataOcorrencia, String horaOcorrencia) {

if(control.DeleteDenuncia(int numeroDenuncia, String protocolo, String descricao, boolean ocorrendoNoMomento, String dataOcorrencia, String horaOcorrencia)){

return true;

}else{

return false;

}}
}
// Read
public ArrayList getDenuncia() {

return control.getDenuncia();

}








    
