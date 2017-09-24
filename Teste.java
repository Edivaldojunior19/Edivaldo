
public class Teste {


	public static void main(String[] args) {


		Data data =new Data(23,"Fevereiro",1994);
		Cliente c1 = new Cliente("Edivaldo Pereira  ", 5447558, data, "Horacio Batista Carneiro",996808952, "edivaldojunior19@outlook.com", "edi.edivaldo", "145574ddd");
		c1.verDados();
		System.out.println("---------Cadastro do cliente "+ c1.getNome()+" Realizado com sucesso.------------------");

		Ambiente c2 = new Ambiente("Mastordonte","Catole","Proximo ao Sesi",155555, 1,"Ambiente para eventos Festivos.","png..");
		c2.verDados();
		System.out.println("-------------Cadastro na Casa De Show "+ c2.getNome()+" Realizado com sucesso.---------------------");		

		data = new Data(24,"Setembro",2017);
		Evento c3 = new Evento("Show", data,"14h","Gospel");
		c3.verDados();


		Ingresso c4 = new Ingresso(12245145, 44);
		c4.verDados();

		c3.gerarIngressos(11);

	}

}