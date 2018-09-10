package exercicioum;

public class Livro extends ItemColecionavel {

	private String nomeEditora;
	private int anoPublicacao;
	
	public Livro(int identificacaoUnica, String nome, Data dataDeAquisicao, String listaDeAutores, String nomeEditora, int anoPublicacao) {
		super(identificacaoUnica, nome, dataDeAquisicao, listaDeAutores);
		this.nomeEditora = nomeEditora;
		this.anoPublicacao = anoPublicacao;
	}

	public String getNomeEditora() {
		return nomeEditora;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	
	
	public String toString() {
		return "ID: " + getIdentificacaoUnica() + "\n" +
				"Nome: " + getNome() + "\n" +
				"Data de Aquisição: " + getDataDeAquisicao() + "\n" +
				"Autores: " + getListaDeAutores() + "\n" +
				"Nome Editora: " + getNomeEditora() + "\n" +
				"Ano de Publicação: " + getAnoPublicacao() + "\n";
	}
	
	
	
}
