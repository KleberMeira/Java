package po_as_2015;

public class PessoaFisica extends Pessoa implements Impostos {

	public PessoaFisica(String nome, double rendaBruta) {
		super(nome, rendaBruta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double descRendaBruta() {
		double renda = getRendaBruta();
		double valorDesconto = 0;
		
		if(renda <= 1400) {
			return renda;
		}
		else if(renda > 1400 && renda <= 2100) {
			valorDesconto = ((renda*10)/100);
			return renda = renda - valorDesconto;
		}
		else if(renda > 2100 && renda <= 2800) {
			valorDesconto = ((renda*15)/100);
			return renda = renda = valorDesconto;
		}
		else if(renda > 2800 && renda <= 3600) {
			valorDesconto = ((renda*25)/100);
			return renda = renda = valorDesconto;
		}
		else
			valorDesconto = ((renda*30)/100);
			return renda = renda = valorDesconto;
	
	}


	
	

}
