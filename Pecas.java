
public class Pecas extends Evento{
	private String standUp;
	private String drama;
	
	public Pecas(String nome, Data data, String horario,String elenco) {
		super(nome,data,horario,elenco);
		this.setStandUp(standUp);
		this.setDrama(drama);
		
}

	public String getStandUp() {
		return standUp;
	}

	public void setStandUp(String standUp) {
		this.standUp = standUp;
	}

	public String getDrama() {
		return drama;
	}

	public void setDrama(String drama) {
		this.drama = drama;
	}

	
}
