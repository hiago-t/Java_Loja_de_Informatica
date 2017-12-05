package modeloDAO;

import modeloConnenction.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansVendedor;

public class VendedoresDAO {
    ConexaoBD conex = new ConexaoBD();
    BeansVendedor mod = new BeansVendedor();
    
    public void salvar(BeansVendedor mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement
                ("insert into vendedores(nome_vendedor,cpf_vendedor,usuario_vendedor,senha_vendedor) values(?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getCpf());
            pst.setString(3, mod.getUsuario());
            pst.setString(4, mod.getSenha());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados.\nErro"+ex);
        }
        conex.desconectar();
    }
    
    public void editar(BeansVendedor mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement
                ("update vendedores set nome_vendedor=?, cpf_vendedor=?, usuario_vendedor=? where cod_vendedor=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getCpf());
            pst.setString(3, mod.getUsuario());
            pst.setInt(4, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na operação com os dados.\nErro: "+ex);
        }
                
        conex.desconectar();
    }
    
    public BeansVendedor buscaVendedor(BeansVendedor mod) {
        conex.conexao();
        conex.executaSql("select  *from vendedores where nome_vendedor like'%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("cod_vendedor"));
            mod.setNome(conex.rs.getString("nome_vendedor"));
            mod.setCpf(conex.rs.getString("cpf_vendedor"));
            mod.setUsuario(conex.rs.getString("usuario_vendedor"));
            //mod.setSenha(conex.rs.getString("senha_vendedor"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao efetuar buscar por vendedor.\nErro:"+ex);
        }
        
        conex.desconectar();
        return mod;
    }
}
