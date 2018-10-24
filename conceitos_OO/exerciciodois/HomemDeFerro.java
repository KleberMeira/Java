package exerciciodois;

public class HomemDeFerro extends SuperHeroi {

	
	//////////////// ATRIBUTOS
	private int versaoAtualArmadura;
	private int quantAtualNamorada; // 
	
	//////////////////////////////////////////////CONSTRUCTOR
	public HomemDeFerro(String nome, String descricao, Data dataDeCriacao,
			String paisNatal, int nivelResistencia ,int versaoAtualArmadura, int quantAtualNamorada)
	{
		super(nome, descricao, dataDeCriacao, paisNatal, nivelResistencia);
		this.versaoAtualArmadura = versaoAtualArmadura;
	}

	
	//////////////////////GETTERS AND SETTERS
	public int getVersaoAtualArmadura() {
		return versaoAtualArmadura;
	}
	
	
	public void setVersaoAtualArmadura(int versaoAtualArmadura) {
		/////////VERIFICAÇÃO PARA O INTERVALO DE 0 A 10 DA ARMADURA
		if(this.versaoAtualArmadura >= 0 && this.versaoAtualArmadura <= 10 )
			this.versaoAtualArmadura = versaoAtualArmadura;
		else
			System.out.println("Versoes para a Armadura apenas entre 0 e 10!");
	}

	public int getQuantAtualNamorada() {
		return quantAtualNamorada;
	}
	
	public void setQuantAtualNamorada(int quantAtualNamorada) {
		this.quantAtualNamorada = quantAtualNamorada;
	}
	
	
	///////////////////////////////////METODOS ESPECIFICADOS PARA FUNCIONALIDADE
	
	/*quando machuca outro super-herói, reduz em 20 unidades
	o nível de resistência do super-herói machucado, enquanto que, quando ajuda outro super-herói,
	aumenta em apenas 5 unidades o nível de resistência do super-herói ajudado*/
	
	



	public void machuca(SuperHeroi heroi) 
	{
		if(heroi.getNome().equals("Ciclope")) {
			heroi.setNivelResistencia(heroi.getNivelResistencia() - 20);
		}
		else if(heroi.getNome().equals("Coringa")) {
			heroi.setNivelResistencia(heroi.getNivelResistencia() - 20);
		}
		else if(heroi.getNome().equals("Wolverine")) {
			heroi.setNivelResistencia(heroi.getNivelResistencia() - 20);
		}
		

	}
	
	public void ajuda(SuperHeroi heroi) {
		if(heroi.getNome().equals("Ciclope")){
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
