package exerciciotres;

public abstract class ItemColecionavel {

	//nome, data de aquisicao e lista de autores
	
	private int identificacaoUnica;
	private String nome;
	private Data dataDeAquisicao;
	private String ListaDeAutores;
	
	
	public ItemColecionavel() {
		
	}
	
	
	public ItemColecionavel(int identificacaoUnica, String nome, Data dataDeAquisicao, String listaDeAutores) {
		this.identificacaoUnica = identificacaoUnica;
		this.nome = nome;
		ListaDeAutores = listaDeAutores;
		this.dataDeAquisicao = dataDeAquisicao;
		
	}

	
	
	
			public int getIdentificacaoUnica() {
				return identificacaoUnica;
			}
		
			public String getNome() {
				return nome;
			}
		
			public Data getDataDeAquisicao() {
				return dataDeAquisicao;
			}
		
			public String getListaDeAutores() {
				return ListaDeAutores;
			}
	
	

	
	
	
	
	
}
