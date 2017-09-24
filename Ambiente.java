public class Ambiente {
	protected String nome;
	protected String localizacao;
	protected String pontoDeReferencia;
	protected int capacidadeTotal;
	protected int vagasEstacionamento;
	protected String informacaoDoAmbiente;
	protected String fotos;


	public Ambiente(String nome, String localizacao, String pontoDeReferencia, int capacidadeTotal, int vagasEstacionamento, String informacaoDoAmbiente,String fotos){
		this.nome= nome;
		this.localizacao=localizacao;
		this.pontoDeReferencia= pontoDeReferencia;
		this.capacidadeTotal= capacidadeTotal;
		this.vagasEstacionamento= 100;
		this.informacaoDoAmbiente= informacaoDoAmbiente;
		this.fotos=fotos;

	}
	public String getNome(){
		return nome;

	}
	public void setNome(String nome){
		this.nome = nome;

	}

	public String getLocalizacao(){
		return localizacao;

	}

	public void setLocalizacao(String localizacao){
		this.localizacao = localizacao;

	}
	public int getCapacidadeTotal() {
		return capacidadeTotal;
	}
	public void setCapacidadeTotal(int capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}
	public int getVagasEstacionamento() {
		return vagasEstacionamento;
	}
	public void setVagasEstacionamento(int vagasEstacionamento) {
		this.vagasEstacionamento = vagasEstacionamento;
	}
	public String getPontoDeReferencia() {
		return pontoDeReferencia;
	}
	public void setPontoDeReferencia(String pontoDeReferencia) {
		this.pontoDeReferencia = pontoDeReferencia;
	}
	public String getInformacaoDoAmbiente() {
		return informacaoDoAmbiente;
	}
	public void setInformacaoDoAmbiente(String informacaoDoAmbiente) {
		this.informacaoDoAmbiente = informacaoDoAmbiente;
	}
	public String getFotos() {
		return fotos;
	}
	public void setFotos(String fotos) {
		this.fotos = fotos;
	}
	public void verDados(){
		System.out.println("Nome do Ambiente:"+nome);
		System.out.println("Localização:"+localizacao);
		System.out.println("Ponto de Referencia:"+pontoDeReferencia);
		System.out.println("Capacidade Total:"+capacidadeTotal);
		System.out.println("Vagas de Estacionamento:"+vagasEstacionamento);
		System.out.println("Informação do Ambiente:"+informacaoDoAmbiente);
		System.out.println("Fotos:"+fotos);




	}
}
