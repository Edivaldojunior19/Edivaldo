
public class CasaDeShow extends Ambiente {
	private String boate;
	private String cor;
	
	public CasaDeShow(String nome, String localizacao, String pontoDeReferencia, int capacidadeTotal, int vagasEstacionamento, String informacaoDoAmbiente,String fotos){
		super(nome,localizacao,pontoDeReferencia,capacidadeTotal,vagasEstacionamento,informacaoDoAmbiente,fotos);
		this.setBoate(boate);
		this.setCor(cor);
		
	}

	public String getBoate() {
		return boate;
	}

	public void setBoate(String boate) {
		this.boate = boate;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	
}
