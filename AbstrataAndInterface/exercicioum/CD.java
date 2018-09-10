package exercicioum;

public class CD extends ItemColecionavel {

	private String anoPublicacao;
	private String[] nomeDasMusicas;
	
	public CD(int identificacaoUnica, String nome, Data dataDeAquisicao, String listaDeAutores, String anoPublicacao, String[] nomeDasMusicas) {
		super(identificacaoUnica, nome, dataDeAquisicao, listaDeAutores);
		this.anoPublicacao = anoPublicacao;
		this.nomeDasMusicas = nomeDasMusicas;
	}

	
	public String getAnoPublicacao() {
		return anoPublicacao;
	}
	public String[] getNomeDasMusicas() {
		return nomeDasMusicas;
	}
	
	
	
	
	
	
	
	
	
	
}


