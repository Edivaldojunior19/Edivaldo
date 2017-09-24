
public class Cinemas extends Ambiente  {
	private int cadeira;
	private int sala;
	
	public Cinemas(String nome, String localizacao, String pontoDeReferencia, int capacidadeTotal, int vagasEstacionamento, String informacaoDoAmbiente,String fotos){
		super(nome,localizacao,pontoDeReferencia,capacidadeTotal,vagasEstacionamento,informacaoDoAmbiente,fotos);
		this.setSala(sala);
		this.setCadeira(cadeira);
		
	}

	public int getCadeira() {
		return cadeira;
	}

	public void setCadeira(int cadeira) {
		this.cadeira = cadeira;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	
	

}