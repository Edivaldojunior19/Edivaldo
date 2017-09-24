import java.util.ArrayList;

public class Ingresso {
	protected int id;
	protected float preco;
	private boolean vendido;
	protected ArrayList <Ingresso> ingressos;
	
	public Ingresso(int id, float preco) {
		
		this.id = id;
		this.preco = preco;
		this.vendido = false;
		
		this.ingressos = new ArrayList<>();
	}
	

	public boolean getVendido() {
		return vendido;
	}


	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}


	public float getValor() {
		return preco;
	}

	public void setValor(float preco) {
		this.preco = preco;
	}


	public int getId() {
		return id;
	}
	
	public void verDados(){
	System.out.println("------------------------------------------");
	System.out.println("ID do ingresso:"+id);
	System.out.println("Valor do ingresso:"+preco);
	System.out.println("-------------------------------------------");
	

	}
}