/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloVendedor;

/**
 *
 * @author Glaucia Lauton
 */
public class ControleVendedor {
    ConexaoBD conex = new ConexaoBD();
    ModeloVendedor mod = new ModeloVendedor();
    
    public void Salvar(ModeloVendedor mod){
        conex.conexao();
        try {
            PreparedStatement pst= conex.con.prepareStatement("insert into vendedores(nome, cpf, usuario, senha)values (?,?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setInt(2, mod.getCPF());
            pst.setString(3,mod.getUsuario());
            pst.setInt(4,mod.getSenha());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Dados não inseridos./nErro: "+ex);
        }
        
        conex.desconecta();
    }
    
}