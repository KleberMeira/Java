import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		

Scanner input = new Scanner(System.in);
		
		int menu = 0;
		
		do {
			System.out.println("---MEU CALENDÁRIO---");
			System.out.println("[1] Adcionar Evento");
			System.out.println("[2] Visualizar Eventos");
			System.out.println("[3] Visualizar por Filtro");
			System.out.println("[4] Sair");
			menu = input.nextInt();
			
			switch(menu) {
			
			case 1: {
				
				Calendario ca = new Calendario();
				
				int dia, mes, ano;
				System.out.println("Digite a data do Evento: ");
				System.out.println("Dia:");
				dia = input.nextInt();
				System.out.println("Mês (númerico): ");
				mes = input.nextInt();
				System.out.println("Ano:");
				ano = input.nextInt();
				
				Data data = new Data(dia, mes, ano);
				
				System.out.println(" Agora digite as informações sobre o evento ");
				System.out.println();
				
				String nome, horario;
				System.out.println("Nome: ");
				System.out.println();
				nome = input.next();
				System.out.println();
				
				System.out.println("Horario: ");
				System.out.println();
				horario = input.next();
				System.out.println();
				
				Evento evento = new Evento(data, horario, nome);
				System.out.println();
				
				ca.preencheEventos(evento); //Armazena os dados de entrada no vetor 
				System.out.println("Pronto! Construímos seu Evento");
			
				break;
				}//fim case 2
			
			case 2: {
				
				Calendario ca = new Calendario();
				
				System.out.println("---TODOS OS EVENTOS---");
				System.out.println();
				
				ca.listagemEventos();
				
				break;
				}
			
			case 3: {
				
				Calendario ca = new Calendario();
				Data dat = new Data();
				
				System.out.println("--FILTRO--");
				System.out.println();
				
				int valor;
				System.out.println("Ordem Crescente");
				System.out.println("[1] Por Dia");
				System.out.println("[2] Por Mês");
				System.out.println("[3] Por Ano");
				valor = input.nextInt();
				
				if(valor == 1) {
					ca.mostrarDia(ca.getEventos(), 0, ca.getEventos().length-1);
				}
				else if(valor == 2) {
					ca.mostrarMes(ca.getEventos(), 0, ca.getEventos().length-1);
				}
				else if(valor == 3) {
					ca.mostrarAno(ca.getEventos(), 0, ca.getEventos().length-1);
				}
				else
					System.out.println("Inválido!");
			}//fim case 3
			
			default:
				System.out.println();
			
			}//fim do swicth
			
		}while(menu != 4);
		System.out.println("Até Mais!");
		
		/*
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
		*/
		

		
		
		
		
		
	}

}
