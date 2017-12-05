/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloProdutos;

/**
 *
 * @author Glaucia Lauton
 */
public class ControleProdutos {
    ConexaoBD conex = new ConexaoBD();
    ModeloProdutos mod = new ModeloProdutos();
    
    public void Salvar(ModeloProdutos mod){
        conex.conexao();
        try {
            PreparedStatement pst= conex.con.prepareStatement("insert into produtos(nome, descricao, preco, estoque)values (?,?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setString(2, mod.getDescricao());
            pst.setFloat(3,mod.getPreco());
            pst.setInt(4,mod.getEstoque());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Dados não inseridos./nErro: "+ex);
        }
        
        conex.desconecta();
    }
    
}