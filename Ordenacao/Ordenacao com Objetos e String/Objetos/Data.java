
public class Data extends Evento {

	private int dia;
	private int mes;
	private int ano;

	public Data(Evento[] eventos, Data data, String horario, String nome, int dia, int mes, int ano) {
		super(eventos, data, horario, nome);
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(Calendario c, Evento e, Data d) {
		super(c, e);
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}



	public int compare(Data data) {
		
		
		
		return 0;
	}

	public int compareAno(int ano) {
		return 0;
	}

	public int compareDia(int dia) {
		return 0;
	}

	public int compareMes(int mes) {
		return 0;
	}

	/// GET AND SETTERS
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
