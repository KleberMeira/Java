public class Animal{
	
	private String raca;
	private int idade;

	public Animal(String raca, int idade){
		this.raca = raca;
		this.idade = idade;
	}

	public void setRaca(String raca){
		this.raca = raca;
	}

	public void setIdade(int idade){
		this.idade = idade;
	}

	public String getRaca(){
		return raca;
	}

	public int getIdade(){
		return idade;
	}

	

}