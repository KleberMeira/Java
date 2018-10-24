package exerciciodois;

public class Ciclope extends SuperHeroi {

	///////////ATRIBUTOS
	private String marcaOculosAtual;

	
	///////////CONSTRUCTOR
	public Ciclope(String nome, String descricao, Data dataDeCriacao, 
			String paisNatal, int nivelResistencia,String marcaOculosAtual) 
	{
		super(nome, descricao, dataDeCriacao, paisNatal, nivelResistencia);
		this.marcaOculosAtual = marcaOculosAtual;
	}
	////////////////////GETTERS AND SETTERS
	public String getMarcaOculosAtual() {
		return marcaOculosAtual;
	}
	
	
	///////////////////////////////////METODOS ESPECIFICADOS PARA FUNCIONALIDADE
	public void machuca(SuperHeroi heroi) 
	{
		if(heroi.getNome().equals("HomemDeFerro")) {
			heroi.setNivelResistencia(heroi.getNivelResistencia() - 10);
		}
		else if(heroi.getNome().equals("Coringa")) {
			heroi.setNivelResistencia(heroi.getNivelResistencia() - 10);
		}
		else if(heroi.getNome().equals("Wolverine")) {
			heroi.setNivelResistencia(heroi.getNivelResistencia() - 10);
		}
		

	}
	
	public void ajuda(SuperHeroi heroi) {
		if(heroi.getNome().equals("HomemDeFerro")){
			heroi.setNivelResistencia(heroi.getNivelResistencia() + 10);
		}
		else if(heroi.getNome().equals("Coringa")) {
			heroi.setNivelResistencia(heroi.getNivelResistencia() + 10);
		}
		else if(heroi.getNome().equals("Wolverine")) {
			heroi.setNivelResistencia(heroi.getNivelResistencia() + 10);
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
