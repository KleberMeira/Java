package exerciciodois;

public class Wolverine extends SuperHeroi{

	
	////////////ATRIBUTOS
	private float quantAdamantium; /// porção em miligramas
	private static double tempoMedioCicatrizacao = 0;
	
	////////////////////CONSTRUCTOR
	public Wolverine(String nome, String descricao, Data dataDeCriacao,
			String paisNatal, int nivelResistencia ,float quantAdamantium) 
	{
		super(nome, descricao, dataDeCriacao, paisNatal, nivelResistencia);
		this.quantAdamantium = quantAdamantium;
	}
	//////////////////////////GETTERS AND SETTERS
	
	public float getQuantAdamantium() {
		return quantAdamantium;
	}

	public static double getTempoMedioCicatrizacao() {
		return tempoMedioCicatrizacao;
	}
	
	///////////////////////////////////METODOS ESPECIFICADOS PARA FUNCIONALIDADE	
	
	
	public void machuca(SuperHeroi heroi) 
	{
		if(heroi.getNome().equals("Ciclope")) {
			heroi.setNivelResistencia(heroi.getNivelResistencia() - 1);
		}
		else if(heroi.getNome().equals("Coringa")) {
			heroi.setNivelResistencia(heroi.getNivelResistencia() - 1);
		}
		else if(heroi.getNome().equals("HomemDeFerro")) {
			heroi.setNivelResistencia(heroi.getNivelResistencia() - 1);
		
		}
		
	}
	
	public void ajuda(SuperHeroi heroi) {
		if(heroi.getNome().equals("Ciclope")){
			heroi.setNivelResistencia(heroi.getNivelResistencia() + 20);
		}
		else if(heroi.getNome().equals("Coringa")) {
			heroi.setNivelResistencia(heroi.getNivelResistencia() + 20);
		}
		else if(heroi.getNome().equals("HomemDeFerro")) {
			heroi.setNivelResistencia(heroi.getNivelResistencia() + 20);
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
