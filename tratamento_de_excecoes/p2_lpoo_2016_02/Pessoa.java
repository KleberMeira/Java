package p2_lpoo_2016_02;

import exercicioum.HugeNameException;

public class Pessoa {

	private String nome;
	private String cpf;
	private String rg;
	
	public Pessoa(String nome, String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	//Lança exeção HugeNameException caso a String seja maior igual que 50
	public void setNome(String nome) throws HugeNameException {
		if(nome.length() <= 50) {
			this.nome = nome;
		}
		else
			throw new HugeNameException();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	
	
	
	
	
}
