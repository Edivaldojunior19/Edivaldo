import java.util.ArrayList;
public class Cliente {
	protected String nome;
	protected int cpf;
	protected Data dataNascimento;
	protected String endereco;
	protected int telefone;
	protected String email;
	protected String login;
	protected String senha;
	protected ArrayList <Compra> historicoCompras;


	public Cliente(String nome, int cpf, Data nascimento, String endereco, int telefone, String email, String login, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = nascimento;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.login = login;
		this.senha = senha;
		this.historicoCompras = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}
	
	
	public int getCpf() {
		return cpf;
	}
	
	
	public Data getNascimento() {
		return dataNascimento;
	}
	
	
	public String getEndereco() {
		return endereco;
	}
	
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	public int getTelefone() {
		return telefone;
	}
	
	
	public void setTelefone(int telefone){
		this.telefone = telefone;
	}
	
	
	
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getLogin() {
		return login;
	}
	
	
	public String getSenha() {
		return senha;
	}
	
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

	public void addCompra (Compra compra){
		historicoCompras.add (compra);
	}
	
	

	public ArrayList<Compra> getHistoricoCompras() {
		return historicoCompras;
	}
	public void verDados(){
		System.out.println("---------------Cadastro do Cliente--------------");
		System.out.println("Nome do Cliente:"+nome);
		System.out.println("Numero do cpf:"+cpf);
		System.out.println(dataNascimento);
		System.out.println("Endereço:"+endereco);
		System.out.println("Telefone:"+telefone);
		System.out.println("Email:"+email);
		System.out.println("Login:"+login);
		System.out.println("Senha:"+senha);
		System.out.println("------------------------------------------------");
				
	}

}
