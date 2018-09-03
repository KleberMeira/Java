package exercicioum;

public class Paciente {

	private String nome;
	//private int[] cpf;
	private int rg;
	//private Data dataDeNascimento;
	
	//private String[] nomesDosPacientes = new String[1000];
	
	
		
	public Paciente(String nome, int rg) {
		this.nome = nome;
		//this.cpf = new int[11];
		this.rg = rg;
		//this.dataDeNascimento = dataDeNascimento;
		
	}

	/*
	public int[] getCpf() {
		return cpf;
	}
	
	
	//Validação para o formato YYY.YYY.YYY-YY
	public void setCpf(int[] cpf) {
		for(int i = 0; i < cpf.length; i++) {
			if(i == 2 || i == 6) {
				System.out.print(".");
			}
			if(i == 8)
				System.out.print("-");
		}
		this.cpf = cpf;
	}
	
	
	
	//Validação para o formato YY/YY/YY
	//A validação é fesita dentro da Classe Data na qual a mesma pertence
	public void setDataDeNascimento(Data dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
*/
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}
	
	
	/*
	public String[] getNomesDosPacientes() {
		return nomesDosPacientes;
	}

	public void setNomesDosPacientes(String[] nomesDosPacientes) {
		this.nomesDosPacientes = nomesDosPacientes;
	}
	*/
	
	public String toString() {
		return "Nome do Paciente" + "\n" + getNome() + "\n " + getRg();
	}


	
	
	
	
	
	
}
