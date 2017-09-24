public class Data {
	private int dia;
	private String mes;
	private int ano;
	
	
	
	public Data(int dia, String mes, int ano) {
	
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public int getDia() {
		return dia;
	}
	public String getMes() {
		return mes;
	}
	public int getAno() {
		return ano;
	}
	@Override
	public String toString() {
		return "Data:" + dia + "/" + mes + "/" + ano + "";
	}
	
	

}
