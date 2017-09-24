import java.util.ArrayList;
public class Compra {
	private int valor;
	private int quant;
	private String evento;
	private double calcularValor;


	private ArrayList <Ingresso> ingressos;


	public Compra (int quant, String evento, double calcularValor){
		this.quant = quant;
		this.evento = evento;
		this.calcularValor= calcularValor;

	}



	public int getQuant() {
		return quant;
	}



	public void setQuant(int quant) {
		this.quant = quant;
	}



	public String getEvento() {
		return evento;
	}



	public void setEvento(String evento) {
		this.evento = evento;
	}



	public double getCalcularValor() {
		return calcularValor;
	}



	public void setCalcularValor(double calcularValor) {
		this.calcularValor = calcularValor;
	}



	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}


	public ArrayList<Ingresso> getIngressos() {
		return ingressos;
	}

	public void setIngressos(ArrayList<Ingresso> ingressos) {
		this.ingressos = ingressos;
	}

}
