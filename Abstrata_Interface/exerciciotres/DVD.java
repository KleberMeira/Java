package exerciciotres;

public class DVD extends ItemColecionavel {

	private String tipo;
	private String descricaoGeral;
	
	public DVD(int identificacaoUnica, String nome, Data dataDeAquisicao, String listaDeAutores, String tipo, String descricaoGeral) {
		super(identificacaoUnica, nome, dataDeAquisicao, listaDeAutores);
		this.tipo = tipo;
		this.descricaoGeral = descricaoGeral;
	}
	
	
	
	
}
