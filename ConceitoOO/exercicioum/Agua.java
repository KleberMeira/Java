package exercicioum;

public class Agua extends Pokemon {

	
	public Agua(String nome, int nivelDeVida, int forca) {
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
	
	/////////////////////////////////////AÇÕES ////// CONSTRUÇÃO DE FUNCIONALIDADE DO SISTEMA
	
	public int attack() {
		return 0;
	}
	
	
	/*
	public String toString()
	{
		return "Teste: "+ getNome() + getNivelDeVida() + getForca();
	}
	*/
	
	
	
}
