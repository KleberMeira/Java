public class Professor extends Pessoa implements Oracao{

	private double valorDevendoAoBanco;

	public Professor(String nome, String cpf, double valorDevendoAoBanco){
		super(nome, cpf);
		this.valorDevendoAoBanco = valorDevendoAoBanco;
	}


	public void setValorDevendoAoBanco(double valorDevendoAoBanco){
		this.valorDevendoAoBanco = valorDevendoAoBanco;
	}
	public double getValorDevendoAoBanco(){
		return valorDevendoAoBanco;
	}

	///METODOS DA INFERFACE
	public void fazOracao(){
		double novoValor = getValorDevendoAoBanco();
		double desconto = ((novoValor * 10)/100);
		novoValor = novoValor - desconto; 

	}
	public void recebeOracao(){
		double novoValor = getValorDevendoAoBanco();
		double desconto = 250;
		novoValor = novoValor - desconto; 
	}


	
}