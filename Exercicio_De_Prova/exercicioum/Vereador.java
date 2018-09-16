package exercicioum;

public class Vereador extends Politico {

	private double auxilioMoradia;
	private double auxilioCompraCelularNovo;
	
	
	public Vereador(String nome, String cpf, String partido, double salarioBase, double bonificacao, double auxilioMoradia, double auxilioCompraCelularNovo) {
		super(nome, cpf, partido, salarioBase, bonificacao);
		this.auxilioCompraCelularNovo = auxilioCompraCelularNovo;
		this.auxilioMoradia = auxilioMoradia;
		
	}
	
	public double getAuxilioMoradia() {
		return auxilioMoradia;
	}


	public void setAuxilioMoradia(double auxilioMoradia) {
		this.auxilioMoradia = auxilioMoradia;
	}


	public double getAuxilioCompraCelularNovo() {
		return auxilioCompraCelularNovo;
	}


	public void setAuxilioCompraCelularNovo(double auxilioCompraCelularNovo) {
		this.auxilioCompraCelularNovo = auxilioCompraCelularNovo;
	}
	
	//////////////////////////////////////////////////////////////

	public double salarioTotal() {
		double total = 0;
		total = getSalarioBase() + getBonificacao() + getAuxilioMoradia();
		return total;
	}
	
	public String toString() {
		return "Nome: "+ getNome() + "\n" +
				"Cpf " + getCpf()  + "\n" +
				"Patido " + getPartido() + "\n" +
				"Salario Total: " + salarioTotal() + "\n";
	}
	
	

	
	
	
	
}
