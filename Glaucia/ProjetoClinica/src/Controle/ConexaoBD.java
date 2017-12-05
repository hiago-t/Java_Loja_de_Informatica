/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Glaucia Lauton
 */
public class ConexaoBD {

    public Statement stm;//prepara e realiza pesquisas
    public ResultSet rs;//guardar as pesquisas
    private final String driver = "org.postgresql.Driver";
    private final String caminho =  "jdbc:postgresql://localhost:5432/ProjetoClinica";
    private final String usuario = "postgres";
    private final String senha = "aluno";
    public Connection con;
    
    //Conecta
    public void conexao(){        
        try {
            System.setProperty("jdbc.drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão:\n"+ex.getMessage());
        }
    }
    
    public void desconecta(){
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "Desconectado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar o banco de dados: \n"+ex.getMessage());
        }
    
    }
    
}