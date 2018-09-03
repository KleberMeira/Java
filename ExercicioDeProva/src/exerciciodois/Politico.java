package exerciciodois;

public class Politico {

	private String Nome;
	private String cpf;
	private String partido;
	private double salarioBase;
	private double bonificacao;
	
	
	public Politico() {
		
	}
	
	public Politico(String nome, String cpf, String partido, double salarioBase, double bonificacao) {
		Nome = nome;
		this.cpf = cpf;
		this.partido = partido;
		this.salarioBase = salarioBase;
		this.bonificacao = bonificacao;
	}
	

	
	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		if(salarioBase > 15000) {
			System.out.println("O sistema não aceita salario"
					+ "acima de 15.000 para esse Politico");
		}
		this.salarioBase = salarioBase;
	}

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public String getNome() {
		return Nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	
	////////////////////////////////////////////
	
	public double salarioTotal() {
		double total = 0;
		total = getSalarioBase() + getBonificacao();
		return total;
	}
	

	
	
	
	
	
}
