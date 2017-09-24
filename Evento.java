import java.util.ArrayList;

public class Evento {
	protected String nome;
	protected Data data;
	protected  String horario;
	protected String elenco;
	protected Ambiente local;
	protected ArrayList <Ingresso> ingressos;

	public Evento(String nome, Data data, String horario,String elenco) {
		this.nome = nome;
		this.data = data;
		this.horario = horario;
		this.elenco = elenco;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}


	public String getElenco(){
		return elenco;
	}

	public void setElenco(String elenco){
		this.elenco = elenco;
	}

	public ArrayList<Ingresso> getIngressos() {
		return ingressos;
	}

	public void setIngressos(ArrayList<Ingresso> ingressos) {
		this.ingressos = ingressos;
	}
	public void gerarIngressos (int preco){
		int totalIngresso= local.getCapacidadeTotal();
		for (int i=0; i <totalIngresso; i++){
			Ingresso ingre = new Ingresso(i, preco);
			ingressos.add(ingre);
		}
	}
	public Ingresso vendeIngresso(){
		for(Ingresso ingre : ingressos){
			if(!ingre.getVendido()){

				ingre.setVendido(true);
				return ingre;

			}


		}
		return null;

	}
	public void verDados(){
		System.out.println("---------------------------------------");
		System.out.println("Nome do evento:"+nome);
		System.out.println(data);
		System.out.println("Horario:"+horario);
		System.out.println("Elenco:"+elenco);

	
	}
}