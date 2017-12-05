
package modelo;

/**
 *
 * @author Glaucia Lauton
 */
public class ModeloVendedor {

    
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the CPF
     */
    public int getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the senha
     */
    public int getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }
    private String nome;
    private String usuario;
    private int CPF;
    private int senha;
    
}
