public class Administrador {
	protected String nome;
	protected  String login;
	protected String senha;
	protected int cpf;
		
	public Administrador(String nome, String login, String senha, int cpf) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.cpf = cpf;
	}
	
	
	public String getLogin() {
		return login;
	}
	
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	
	public String getSenha() {
		return senha;
	}
	
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	
	public int getCpf() {
		return cpf;
	}
	
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	
}


