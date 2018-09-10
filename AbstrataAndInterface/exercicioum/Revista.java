package exercicioum;

public class Revista extends ItemColecionavel {

	private int anoDePublicacao;
	private int volume;
	private String editora;
	private String[] principalAssutoTratado = new String[1];
	
	public Revista(int identificacaoUnica, String nome, Data dataDeAquisicao, String listaDeAutores, int anoDePublicacao, int volume, String editora, String[] principalAssutoTratado) {
		super(identificacaoUnica, nome, dataDeAquisicao, listaDeAutores);
		this.anoDePublicacao = anoDePublicacao;
		this.volume = volume;
		this.editora = editora;
		this.principalAssutoTratado = principalAssutoTratado;
	}
	
	
	
	
}
