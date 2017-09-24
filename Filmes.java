
public class Filmes extends Evento{
	private String lancamentos;
	
	public Filmes(String nome, Data data, String horario,String elenco) {
		super(nome,data,horario,elenco);
		this.setLancamentos(lancamentos);
	}

	public String getLancamentos() {
		return lancamentos;
	}

	public void setLancamentos(String lancamentos) {
		this.lancamentos = lancamentos;
	}

	
}
