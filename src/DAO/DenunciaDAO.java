package DAO;

import Model.DenunciaModel;
import java.sql.*;

public class DenunciaDAO {
    
    public DenunciaDAO() {
        
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
    
    // Método de registrar as denuncias no banco de dados.
    public boolean InserirDenunciaDAO(DenunciaModel denuncia) {
        
        String sql = "INSERT INTO tb_denuncias (logradouro, cidade, estado, bairro, descricao, ocorrendoNoMomento, dataOcorrencia, horaOcorrencia) VALUES (?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            
            stmt.setString(1, denuncia.getLogradouro());
            stmt.setString(2, denuncia.getCidade());
            stmt.setString(3, denuncia.getEstado());
            stmt.setString(4, denuncia.getBairro());
            stmt.setString(5, denuncia.getDescricao());
            stmt.setString(6, denuncia.getOcorrendoNoMomento());
            stmt.setString(7, denuncia.getDataOcorrencia());
            stmt.setString(8, denuncia.getHoraOcorrencia());
            
            stmt.execute();
            stmt.close();
            
            return true;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        
    }
    
    // Método para receber dados do Banco.
    public DenunciaModel carregaDenunciaDAO(int id_Denuncia) {
        
        DenunciaModel denuncia = new DenunciaModel();
        denuncia.setId_Denuncia(id_Denuncia);
        
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_denuncias WHERE id_denuncia = " + id_Denuncia);
            res.next();

            denuncia.setDescricao(res.getString("descricao"));
            denuncia.setOcorrendoNoMomento(res.getString("ocorrendoNoMomento"));
            denuncia.setDataOcorrencia(res.getString("dataOcorrencia"));
            denuncia.setHoraOcorrencia(res.getString("horaOcorrencia"));
            denuncia.setLogradouro(res.getString("logradouro"));
            denuncia.setBairro(res.getString("bairro"));
            denuncia.setCidade(res.getString("cidade"));
            denuncia.setEstado(res.getString("estado"));

            stmt.close();
        } catch (SQLException erro) {
            
        }
        return denuncia;
        
    }
    
    // Método para atualizar a descrição no banco de dados.
    public boolean UpdateDenunciaDAO(DenunciaModel denuncia) {
        
        String sql = "UPDATE tb_denuncias SET descricao = ? WHERE id_denuncia = ?";
        
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            
            stmt.setString(1, denuncia.getDescricao());
            stmt.setInt(2, denuncia.getId_Denuncia());
            
            stmt.execute();
            stmt.close();
            
            return true;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
}
