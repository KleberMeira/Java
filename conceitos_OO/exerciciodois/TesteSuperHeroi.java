package exerciciodois;

public class TesteSuperHeroi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String nome, String descricao, Data dataDeCriacao,String paisNatal, int nivelResistencia ,int versaoAtualArmadura
		SuperHeroi HFerro = new HomemDeFerro("Homem De Ferro", "Dado", new Data(02,10,2017), "BRASIL", 10, 1, 5);

		//String nome, String descricao, Data dataDeCriacao,String paisNatal, int nivelResistencia ,float quantAdamantium
		SuperHeroi Wolver = new Wolverine("Wolverine", "Dado de teste1", new Data(02,10,2017), "CANADA", 100, 1);
		
		 ///String nome, String descricao, Data dataDeCriacao, String paisNatal, int nivelResistencia,String marcaOculosAtua
		SuperHeroi Ciclop = new Ciclope("Ciclope", "Dado de teste2 ", new Data(02,10,2017), "CANADA", 100, "ASAS");
	
		//String nome, String descricao, Data dataDeCriacao, String paisNatal, int nivelResistencia,String paisAtual
		SuperHeroi Coring = new Coringa("Coringa", "Dado de teste3", new Data(02,10,2018), "FLORIDA", 100, "ATLANTA");
		
		//System.out.println(test.getClass());

		HFerro.machuca(Wolver);
		HFerro.machuca(Ciclop);
		HFerro.machuca(Coring);
		
		HFerro.ajuda(Wolver);
		HFerro.ajuda(Ciclop);
		HFerro.ajuda(Coring);
	}

}
