
public class Calendario {

	private Evento[] eventos;

	public Calendario(Evento[] eventos) {
		super();
		this.eventos = eventos;
	}
	
	public Calendario(Calendario c) {
		this.eventos = c.getEventos();
	}

	public void mostrarDia() {

	}

	public void mostrarMes() {

	}

	public void mostrarAno() {

	}

	public Evento[] getEventos() {
		return eventos;
	}

	public void setEventos(Evento[] eventos) {
		this.eventos = eventos;
	}

}
