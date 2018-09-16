package exercicioum;

public class Numero {

	private int cocient;
	private int dem;
	
	public Numero(int cocient, int dem) {
		
		this.cocient = cocient;
		this.dem = dem;
	}

	
	public int getCocient() {
		return cocient;
	}

	public void setCocient(int cocient) {
		this.cocient = cocient;
	}

	public int getDem() {
		return dem;
	}

	public void setDem(int dem) {
		this.dem = dem;
	}
	
	
	public double divisao(int cocient, int dem) throws InvalidCpfFormatException {
		int result;
		return result = cocient / dem;
	}
	
	
	
}
