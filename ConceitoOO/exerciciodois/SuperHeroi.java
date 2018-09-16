package exerciciodois;

import java.util.Scanner;

public abstract class SuperHeroi {
	
	Scanner sc = new Scanner(System.in);
	
	////////// ATRIBUTOS
	private String nome;
	private String descricao;
	private Data dataDeCriacao;
	private String paisNatal;
	private int nivelResistencia;
	private String[] habilidade = new String [10];
	
	public SuperHeroi(){
		
	}
	
	
	//////////////// CONTRUTOR 
	public SuperHeroi(String nome, String descricao, Data dataDeCriacao, String paisNatal, 
			int nivelResistencia) 
	{
		this.nome = nome;
		this.descricao = descricao;
		this.dataDeCriacao = dataDeCriacao;
		this.paisNatal = paisNatal;
		this.nivelResistencia = nivelResistencia;
		//this.habilidade = habilidade;
	}

	
	//////////////////////////GETTERS AND SETTERS
	
	public int getNivelResistencia() {
		return nivelResistencia;
	}
	
	////////VALIDACAO PARA RESISTENCIA DO SUPER HEROI ENTRE 0 E 100
	public void setNivelResistencia(int nivelResistencia) {
		if(this.nivelResistencia > 0 && this.nivelResistencia <= 100)
			this.nivelResistencia = nivelResistencia;
		else
			System.out.println("Aceito apenas entre 0 e 100");
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public Data getDataDeCriacao() {
		return dataDeCriacao;
	}

	public String getPaisNatal() {
		return paisNatal;
	}
	
	public String[] getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(String[] habilidade) {
		this.habilidade = habilidade;
	}
	
	///////////////////////////////////METODOS ESPECIFICADOS PARA FUNCIONALIDADE
	


	
	
	public void adcionaHabilidade()
	{
		System.out.println("Digite as Habilidades: ");
		for(int i = 0; i < habilidade.length; i++ ) 
		{
			habilidade[i] = sc.next();
		}
	}
	
	public void machuca(SuperHeroi heroi) {
		System.out.println("Machuquei");
	}
	
	public void ajuda(SuperHeroi heroi) {
		System.out.println("Curei");
	}
	
	
	
	
	
}
