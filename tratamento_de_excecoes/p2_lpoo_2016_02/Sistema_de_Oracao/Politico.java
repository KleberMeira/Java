public class Politico extends Pessoa implements Oracao{
	
	private double valorPropinaRecebida;


	public Politico(String nome, String cpf, double valorPropinaRecebida){
		super(nome, cpf);
		this.valorPropinaRecebida = valorPropinaRecebida;
	}

	public void setValorPropinaRecebida(double valorPropinaRecebida){
		this.valorPropinaRecebida = valorPropinaRecebida;
	}

	public double getValorPropinaRecebida(){
		return valorPropinaRecebida;
	}

	//Quando faz uma oracao, um politico perde R$ 100,00 de dinheiro de sua propina
	public void fazOracao(){
		double novoValor = getValorPropinaRecebida();
		novoValor = novoValor - 100;
		//System.out.println("Eu" + novoValor); para fim de testes do metodo
	}

	//quando recebe uma oracao, ele emite uma mensagem de gratidao e pede voto
	public void recebeOracao(){
		System.out.println("Obrigado, Vote em mim");
	}


}









