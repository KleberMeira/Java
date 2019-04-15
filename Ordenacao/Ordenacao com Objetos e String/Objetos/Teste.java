
public class Teste {

	public static void main(String[] args) {
		
		Calendario ca = new Calendario();
		Data data = new Data(14, 05, 2018);
		Data data2 = new Data(15, 02, 2019);
		Data data3 = new Data(11, 03, 2017);
		Data data4 = new Data(03, 03, 2017);
		Data data5 = new Data(02, 03, 2017);
		Evento evento1 = new Evento(data, "15hrs", "Aula");
		Evento evento2 = new Evento(data2, "18hrs", "Treino Futebol");
		Evento evento3 = new Evento(data3, "7hrs", "Academia");
		Evento evento4 = new Evento(data4, "10hrs", "Luta");
		Evento evento5 = new Evento(data5, "17hrs", "Descanço");

		
		
		ca.preencheEventos(evento1);
		ca.preencheEventos(evento2);
		ca.preencheEventos(evento3);
		ca.preencheEventos(evento4);
		ca.preencheEventos(evento5);

		
		
		System.out.println("Desordenado por dia");
		System.out.println();
		
		ca.listagemEventos();
		ca.mostrarDia(ca.getEventos(), 0, ca.getEventos().length-1);
		
		System.out.println("Ordenado por dia");
		System.out.println();
		ca.listagemEventos();
		
		


		
		
	}

}
