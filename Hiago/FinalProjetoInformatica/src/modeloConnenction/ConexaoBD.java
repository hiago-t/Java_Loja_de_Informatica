package modeloConnenction;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoBD {
    
    public Statement stm;
    public ResultSet rs;
    private String driver="org.postgresql.Driver";
    private String caminho="jdbc:postgresql://localhost:5432/projetoInformatica";
    private String usuario="red";
    private String senha="senhared";
    public Connection con;
    
    public void conexao() {
        try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o Banco de Dados:\n"+ex.getMessage());
        }
    }
    public void executaSql(String sql) {
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro com o ExecutaSql.\n"+ex.getMessage());
        }
        
    }
    
    public void desconectar() {
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão com o  Banco de Dados:\n"+ex.getMessage());            
        }
    }
}
 