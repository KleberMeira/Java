
public class Evento implements Listagem {

	private Data data;
	private String horario;
	private String nome;

	
	public Evento(Data data, String horario, String nome){
		this.data    = new Data(data); //
		this.horario = horario;
		this.nome 	 = nome;		
	}

	public Evento(Evento e) {
		this.data = e.getData();
		this.horario = e.getHorario();
		this.nome = e.getNome();
	}
	
	public Evento() {
		
	}
	
	//Get and Set
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public boolean igual(Evento evento) {
		return false;
	}

	@Override
	public void listagemGeral() {
		
		data.listagemGeral();//Data
		System.out.println();
		System.out.println("Nome do Evento: " + getNome());
		System.out.println("Horario: " + getHorario());
		
	}

}
