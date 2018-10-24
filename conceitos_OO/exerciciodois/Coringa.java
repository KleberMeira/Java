package exerciciodois;

public class Coringa extends SuperHeroi {

	//////////ATRIBUTOS
	private String paisAtual;

	/////////////////CONSTRUCTOR
	public Coringa(String nome, String descricao, Data dataDeCriacao, String paisNatal, 
			int nivelResistencia,String paisAtual) {
		
		super(nome, descricao, dataDeCriacao, paisNatal, 
				nivelResistencia);
		this.paisAtual = paisAtual;
	}

	/////////////////////////GETTERS AND SETTERS
	public String getPaisAtual() {
		return paisAtual;
	}
	public void setPaisAtual(String paisAtual) {
		this.paisAtual = paisAtual;
	}
	
	
	
	///////////////////////////////////METODOS ESPECIFICADOS PARA FUNCIONALIDADE
	public void machuca(SuperHeroi heroi) 
	{
		if(heroi.getNome().equals("Ciclope")) {
			heroi.setNivelResistencia(heroi.getNivelResistencia() - 20);
		}
		else if(heroi.getNome().equals("HomemDeFerro")) {
			heroi.setNivelResistencia(heroi.getNivelResistencia() - 20);
		}
		else if(heroi.getNome().equals("Wolverine")) {
			heroi.setNivelResistencia(heroi.getNivelResistencia() - 20);
		}
		
	}
	
	public void ajuda(SuperHeroi heroi) {
		if(heroi.getNome().equals("Ciclope")){
			heroi.setNivelResistencia(heroi.getNivelResistencia() + 1);
		}
		else if(heroi.getNome().equals("HomemDeFerro")) {
			heroi.setNivelResistencia(heroi.getNivelResistencia() + 1);
		}
		else if(heroi.getNome().equals("Wolverine")) {
			heroi.setNivelResistencia(heroi.getNivelResistencia() + 1);
		}
	}
	
	
	public void estadoSaude()
	{	
		int quantResistencia = getNivelResistencia();
		////////VERIFICAÇÃO DO getNivelResistencia PARA VALIDAÇÃO DO ESTADO DE SAÚDE
		if(quantResistencia >= 0 && quantResistencia <= 30 )
			System.out.println("Ruim");
		else if(quantResistencia >= 31 && quantResistencia <= 70)
			System.out.println("Bom");
		else if(quantResistencia >= 71 && quantResistencia <= 100)
			System.out.println("Exelente");
	}
	
	
	
}
