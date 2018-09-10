package exerciciodois;

public class TesteImposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String nome, double renda
		Contribuinte contribuinte1 = new PessoaFisica("Pedro", 3000);
		System.out.println(contribuinte1.toString());
	
		Contribuinte contribuinte2 = new PessoaFisica("Joao", 2000);
		System.out.println(contribuinte2.toString());
		
		Contribuinte contribuinte3 = new PessoaFisica("Lucas", 2500);
		System.out.println(contribuinte3.toString());
		
		Contribuinte contribuinte4 = new PessoaFisica("Kleber", 3000);
		System.out.println(contribuinte1.toString());
		
		Contribuinte contribuinte5 = new PessoaFisica("Paulo", 5000);
		System.out.println(contribuinte5.toString());
		
		//Contribuinte contribuinte6 = new PessoaJuridica("Empresa Costa", 30000);
		//System.out.println(contribuinte6.toString());
		
		//Contribuinte todosContribuintes = new Contribuinte();
		//System.out.println("Total de Impostos arrecadados: " + todosContribuintes.totalDeImpostos);
		
	}

}
