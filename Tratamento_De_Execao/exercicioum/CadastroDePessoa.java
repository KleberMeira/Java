package exercicioum;

public class CadastroDePessoa {

	
	private String nome;
	private String cpf;
	private String rg;
	
	public CadastroDePessoa(String nome, String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) throws HugeNameException 
	{
		if(nome.length() > 30)
		{
			throw new HugeNameException();
		}
		for(int i = 0 ; i < nome.length() ; i ++)
		{
			
		}
		this.nome = nome;
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
	
	

	
	
	
	
}
