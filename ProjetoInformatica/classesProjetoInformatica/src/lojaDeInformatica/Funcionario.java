package lojaDeInformatica;

public abstract class Funcionario {
	
	// Atributos
	private String nome, senha;
	private int cpf;
	
	// M�todos Abstratos
	public abstract void alterarDadosFuncionario();
		
	public abstract void incluirFuncionario();
	
	public abstract void removerFuncionario();
	
	public abstract void pesquisarFuncionario();
	
	public abstract void mostrarFuncionarios();
	
	// M�todos Especiais	

	//Set e Get
	public String getNome() {
		return nome;
	}

	public void setNome(String no) {
		this.nome = no;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String se) {
		this.senha = se;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
}
