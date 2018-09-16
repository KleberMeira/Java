package exercicioum;

public class DeputadoEstadual extends Politico {

	private double auxilioCombustivel;
	private double valeAlimentacao;

	
	public DeputadoEstadual(String nome, String cpf, String partido, double salarioBase, double bonificacao,double auxilioCombustivel, double valeAlimentacao) {
		super(nome, cpf, partido, salarioBase, bonificacao);
		this.auxilioCombustivel = auxilioCombustivel;
		this.valeAlimentacao = valeAlimentacao;
	}


	public double getAuxilioCombustivel() {
		return auxilioCombustivel;
	}
	
	public void setAuxilioCombustivel(double auxilioCombustivel) {
		this.auxilioCombustivel = auxilioCombustivel;
	}
	
	public double getValeAlimentacao() {
		return valeAlimentacao;
	}

	public void setValeAlimentacao(double valeAlimentacao) {
		this.valeAlimentacao = valeAlimentacao;
	}
	
	
	/////////////////////////////////////////////////////////////////////////
	


	public double salarioTotal() {
		double total = 0;
		double bonificacaoExtra = 0;
		bonificacaoExtra = (getSalarioBase() * 10) / 100;
		total = getSalarioBase() +getBonificacao() + bonificacaoExtra + getValeAlimentacao();
		return total;
	}
	
	public String toString() {
		return "Nome: "+ getNome() + "\n" +
				"Cpf " + getCpf()  + "\n" +
				"Patido " + getPartido() + "\n" +
				"Salario Total: " + salarioTotal() + "\n";
	}
	
	
	
	
	
}
