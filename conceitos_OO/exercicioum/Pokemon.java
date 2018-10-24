package exercicioum;

public abstract class Pokemon {

	//Todo Pokemon tem um nome, nível de vida (inteiro entre 0 e 100) e força (inteiro
			//entre 0 e 100)
	
	protected int nivelDeVida;
	protected int forca;
	protected String nome;
	
	public Pokemon() {
		
	}
	
	public Pokemon(String nome, int nivelDeVida, int forca) {
		this.nome = nome;
		this.nivelDeVida = nivelDeVida;
		this.forca = forca;
	}
	
	public int getNivelDeVida() {
		return nivelDeVida;
	}
	
	public void setNivelDeVida(int nivelDeVida) {
		if(this.nivelDeVida >= 0 && this.nivelDeVida <= 100 )
			this.nivelDeVida = nivelDeVida;
		else
			System.out.println("O nivel de vida se restringe entre 0 e 100");
	}
	
	public int getForca() {
		return forca;
	}
	
	public void setForca(int forca) {
		if(this.forca >= 0 && this.forca <= 100 )
			this.forca = forca;
		else
			System.out.println("O nivel de forca se restringe entre 0 e 100");
	}
	
	public String getNome() {
		return nome;
	}
	
	
	

	
	
	
}
