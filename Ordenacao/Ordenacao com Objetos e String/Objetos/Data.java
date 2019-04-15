
public class Data implements Listagem {

	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data(Data d) {
		this.dia = d.getDia();
		this.mes = d.getMes();
		this.ano = d.getAno();
	}

	public int compare(Data data) {

		if (data.equals(data)) {
			return 1;
		} else
			return 0;
	}

	public int compareAno(int ano) {

		if (this.ano > ano) {
			return -1;
		} else if (this.ano == ano) {
			return 0;
		} else
			return 1;
	}

	public int compareDia(int dia) {

		if (this.dia > dia) {
			return -1;
		} else if (this.dia == dia) {
			return 0;
		} else
			return 1;
	}

	public int compareMes(int mes) {

		if (this.mes > mes) {
			return -1;
		} else if (this.mes == mes) {
			return 0;
		} else
			return 1;
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

	@Override
	public void listagemGeral() {
		// TODO Auto-generated method stub
		System.out.print("Data: " + getDia() + "/" + getMes() + "/" + getAno());
	}

	//
	
}
