import java.util.Scanner;

public class SistemaDeOracao{
	

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" ::: Escolha a opção desejada :::");

		System.out.println(" (1) Oracoes para Politico");
		System.out.println(" (2) Oracoes para Esportista");
		System.out.println(" (3) Oracoes para Professor");
		System.out.println(" (4) Oracoes para o Cachorro");
		System.out.println(" (5) Oracoes para o Gato");
		System.out.println(" (6) Sair");

		int menu = input.nextInt();

		switch (menu){
			case 1 :
					////politico       String nome, String cpf, double valorPropinaRecebida
					Politico politico = new Politico("LUCAS", "12345689210", 300);

					System.out.println("(1) Fazer Oração");
					System.out.println("(2) Receber Oração ");

					int oracao = input.nextInt();
					switch(oracao){
						case 1 : 
								politico.fazOracao();
								break;
						case 2 : 
								politico.recebeOracao();
								break;
						default :
								break;

					}
			case 2 :
					///Esportista      String nome, String cpf, String esporteFavorito
					Esportista esportista = new Esportista("JOAO", "23456789010", "VOLEI");

					System.out.println("(1) Fazer Oração");
					System.out.println("(2) Receber Oração ");

					int oracao2 = input.nextInt();
					switch(oracao2){
						case 1 : 
								esportista.fazOracao();
								break;
						case 2 : 
								esportista.recebeOracao();
								break;
						default :
								break;

					}
			case 3 :
					//Professor        String nome, String cpf, double valorDevendoAoBanco
					Professor professor = new Professor("PAULO", "4567890123", 500);

					System.out.println("(1) Fazer Oração");
					System.out.println("(2) Receber Oração ");

					int oracao3 = input.nextInt();
					switch(oracao3){
						case 1 : 
								professor.fazOracao();
								break;
						case 2 : 
								professor.recebeOracao();
								break;
						default :
								break;

					}
			case 4 : 
					///Cachorro        String raca, int idade, int quantDeMordidas
					Cachorro cachorro = new Cachorro("PUDLLE", 5, 8);			

					System.out.println("(1) Fazer Oração");
					System.out.println("(2) Receber Oração ");

					int oracao4 = input.nextInt();
					switch(oracao4){
						case 1 : 
								cachorro.fazOracao();
								break;
						case 2 : 
								cachorro.recebeOracao();
								break;
						default :
								break;

					}
			case 5 :
					//Gato             String raca, int idade, String racaoFavorita
					Gato gato = new Gato("SIAMES", 3, "PEDIGREE");	

					System.out.println("(1) Fazer Oração");
					System.out.println("(2) Receber Oração ");

					int oracao5 = input.nextInt();
					switch(oracao5){
						case 1 : 
								gato.fazOracao();
								break;
						case 2 : 
								gato.recebeOracao();
								break;
						default :
								break;

					}
			default: 
					break;
		}
		
	}
}