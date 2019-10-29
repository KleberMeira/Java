import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int quantJogador, int quantElementos, int quantJogadas
		ListaLigada lista = new ListaLigada(3, 5, 4);
		
		
		//System.out.println("Tamanho: " + lista.size());
		
		//lista.sortearIndice();
		
		
		 Scanner scn = new Scanner(System.in);
	        Scanner scnS = new Scanner(System.in);

	        while (true) {

	            System.out.println("\n\n\n==========================================");
	            System.out.println("      JOGO DA LISTA LIGADA");
	            System.out.println("==========================================");
	            System.out.println("");
	            System.out.println("0 - sair");
	            System.out.println("1 - Iniciar Jogo");

	            System.out.println("\n");
	            System.out.print("Digite sua escolha: ");
	            int opc = scn.nextInt();

	            int num;
	            if (opc == 0) {
	                break;
	            } else if (opc == 1) {
	                
	            	lista.insert();
	            	System.out.println(" Partida Criada! ");
	            	
	            	System.out.println("Quantidade de jogadores: 5");
	            	
	            	lista.jogar();
	            	
	            	
	            	
	            	
	            	
	            	
	            } 
	            
	            System.out.println("\n\n(press. ENTER)");
	            String s = scnS.nextLine();

	        }

	        System.out.println("\n--------------------------------------------------");
	        System.out.println("*** Obrigado e ate' breve ***");
			
	    }
		
		
	}


