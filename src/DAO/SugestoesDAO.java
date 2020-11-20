package DAO;

import Model.SugestoesModel;
import java.sql.*;

public class SugestoesDAO {
    
    public SugestoesDAO() {
        
    }
    
    public Connection getConexao() {

        Connection connection = null;  //instância da conexão

        try {

            // Carregamento do JDBC Driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            // Configurar a conexão
            String server = "35.247.220.180"; //caminho do MySQL
            String database = "db_ad3";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "willperes";
            String password = "ad3unisul2020";

            connection = DriverManager.getConnection(url, user, password);

            // Testando..
            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }

            return connection;

        } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver nao foi encontrado.");
            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }
    
    // Método para inserir sugestões no banco de dados.
    public boolean InserirSugestaoDAO(SugestoesModel sugestao) {
        
        String sql = "INSERT INTO tb_sugestoes (email, sugestao) VALUES (?,?)";
        
        try {
           PreparedStatement stmt = this.getConexao().prepareStatement(sql);
           
           stmt.setString(1, sugestao.getEmail());
           stmt.setString(2, sugestao.getSugestao());
           
           stmt.execute();
           stmt.close();
           
           return true;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
}
