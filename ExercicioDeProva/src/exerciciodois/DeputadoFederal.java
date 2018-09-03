package exerciciodois;

public class DeputadoFederal extends Politico {

	private double auxilioCombustivel;
	private double auxilioTerno;
	
	
	public DeputadoFederal(String nome, String cpf, String partido, double salarioBase, double bonificacao , double auxilioCombustivel, double auxilioTerno) {
		super(nome, cpf, partido, salarioBase, bonificacao);
		this.auxilioCombustivel = auxilioCombustivel;
		this.auxilioTerno = auxilioTerno;
	}


	public double getAuxilioCombustivel() {
		return auxilioCombustivel;
	}

	public void setAuxilioCombustivel(double auxilioCombustivel) {
		this.auxilioCombustivel = auxilioCombustivel;
	}

	public double getAuxilioTerno() {
		return auxilioTerno;
	}

	public void setAuxilioTerno(double auxilioTerno) {
		this.auxilioTerno = auxilioTerno;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	public double salarioTotal() {
		double total = 0;
		double bonificacaoExtra = 0;
		bonificacaoExtra = (getSalarioBase() * 10) / 100;
		total = getSalarioBase() +getBonificacao() +bonificacaoExtra + getBonificacao();
		return total;
	}
	
	public String toString() {
		return "Nome: "+ getNome() + "\n" +
				"Cpf " + getCpf()  + "\n" +
				"Patido " + getPartido() + "\n" +
				"Salario Total: " + salarioTotal() + "\n";
	}
	
	
	
	
}
