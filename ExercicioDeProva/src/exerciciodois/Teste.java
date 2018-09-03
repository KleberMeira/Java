package exerciciodois;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String nome, String cpf, String partido, double salarioBase, double bonificacao, double auxilioMoradia, double auxilioCompraCelularNovo
		Politico politico = new Vereador ("João Carlos", "123.047.167-4", "União", 4000, 200, 150, 200);
		System.out.println(politico.toString());
		
		//String nome, String cpf, String partido, double salarioBase, double bonificacao,double auxilioCombustivel, double valeAlimentacao
		Politico politico2 = new DeputadoEstadual("Manoel Teixeira", "148.057.168-6", "Defensor", 7200, 350, 200, 400);
		System.out.println(politico2.toString());
		
		//String nome, String cpf, String partido, double salarioBase, double bonificacao , double auxilioCombustivel, double auxilioTerno
		Politico politico3 = new DeputadoFederal("Bruno Dias", "103.487.138-0", "Partido do Povo", 11000, 900, 700, 600);
		System.out.println(politico3.toString());

	}

}
