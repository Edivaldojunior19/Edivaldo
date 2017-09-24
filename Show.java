
public class Show extends Evento {
	private String equipe;
	private String comunicador;

	public Show(String nome, Data data, String horario,String elenco) {
		super(nome,data,horario,elenco);
		this.setEquipe(equipe);
		this.setComunicador(comunicador);

	}

	public String getEquipe() {
		return equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}

	public String getComunicador() {
		return comunicador;
	}

	public void setComunicador(String comunicador) {
		this.comunicador = comunicador;
	}


}