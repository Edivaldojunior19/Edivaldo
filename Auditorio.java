
public class Auditorio extends Ambiente{
	private String qualidadeDoSom;

	public Auditorio (String nome, String localizacao, String pontoDeReferencia, int capacidadeTotal, int vagasEstacionamento, String informacaoDoAmbiente,String fotos){
		super(nome,localizacao,pontoDeReferencia,capacidadeTotal,vagasEstacionamento,informacaoDoAmbiente,fotos);
		this.setQualidadeDoSom(qualidadeDoSom);


	}

	public String getQualidadeDOSom() {
		return qualidadeDoSom;
	}

	public void setQualidadeDoSom(String qualidadeDoSom) {
		this.qualidadeDoSom = qualidadeDoSom;
	}
}
