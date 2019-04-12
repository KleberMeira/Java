
public class Evento extends Calendario {

	private Data data;
	private String horario;
	private String nome;

	public Evento(Evento[] eventos, Data data, String horario, String nome) {
		super(eventos);
		this.data = new Data(data, data, data);
		this.horario = horario;
		this.nome = nome;
	}
	
	public Evento(Calendario c, Evento e) {
		super(e);
		
		this.data = e.getData();
		this.horario = e.getHorario();
		this.nome = e.getNome();
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

}
