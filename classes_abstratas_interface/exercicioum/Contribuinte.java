package exercicioum;

public abstract class Contribuinte  {

	public static double totalDeImpostos = 0;

	private String nome;
	private double renda;

	public Contribuinte() {

	}

	public Contribuinte(String nome, double renda) {
		this.nome = nome;
		this.renda = renda;
	}


	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	public String getNome() {
		return nome;
	}

	public void mostraTotalDeImpostos() {
		System.out.println(totalDeImpostos);
	}
}
