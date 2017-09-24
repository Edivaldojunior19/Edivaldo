public class Teatro extends Ambiente{
	private int cadeira;
	private String atracao;
	
	public Teatro (String nome, String localizacao, String pontoDeReferencia, int capacidadeTotal, int vagasEstacionamento, String informacaoDoAmbiente,String fotos){
		super(nome,localizacao,pontoDeReferencia,capacidadeTotal,vagasEstacionamento,informacaoDoAmbiente,fotos);
		this.setCadeira(cadeira);
		this.setAtracao(atracao);
}

	public int getCadeira() {
		return cadeira;
	}

	public void setCadeira(int cadeira) {
		this.cadeira = cadeira;
	}

	public String getAtracao() {
		return atracao;
	}

	public void setAtracao(String atracao) {
		this.atracao = atracao;
	}
}