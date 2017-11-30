package modelo;
public class Usuario {
    Long id;
    String nome;
    String cpf;
    String usuario;
    String senha;
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    } 
    public String getNome() { 
        return nome;
    } 
    public void setNome(String nome) { 
        this.nome = nome;
    } 
    public String getSenha() { 
        return senha;
    } 
    public void setSenha(String senha) { 
        this.senha = senha;
    } 

}
