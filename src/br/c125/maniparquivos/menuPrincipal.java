package br.c125.maniparquivos;

import java.util.Scanner;

import br.c125.Main;
import br.c125.pokemon.Fogo;
import br.c125.pokemon.Pokemon;

public class menuPrincipal {

	// Declaração de variáveis
			static String arquivoNome = "RegistroPokemons.txt";
			static String amostradoraAux = null;
			static String nomePokemon =  null;
			static String vidaPokemon = null;
			static String ataquePokemon = null;
			static String defesaPokemon =  null;
			static String tipoPokemon = null;
			//Pokemon1
			static String tipoPokemon1 = null;
			static String nomePokemon1 =null;
			static String vidaPokemon1 = null;
			static String ataquePokemon1 = null;
			static String defesaPokemon1 = null;
			static String infosPokemon1 = null;
			//Pokemon2
			static String tipoPokemon2 = null;
			static String nomePokemon2 =null;
			static String vidaPokemon2 = null;
			static String ataquePokemon2 = null;
			static String defesaPokemon2 = null;
			static String infosPokemon2 = null;
			
			static int opcoesMenu = 0;
			static int opcoesTipo = 0;
			static int id = 0; // Por padrão já existem dois Pokemons
			static int idAtual = 0;
			static int idPokemon1 = 0;
			static int idPokemon2 = 0;
			
			// Declara o Scanner
			Scanner entradaTeclado = new Scanner(System.in);

	
	// Menu
	public static void menu() {

		idAtual = ArquivoManip.getContLinha();
		//ArquivoManip.LeituraDeArquivo(arquivoNome);
		id = idAtual;
		System.out.println("IdAtual: Antes de Inserir Pokemon " + idAtual);
		
		 amostradoraAux = null;
		 nomePokemon =  null;
		 vidaPokemon = null;
		 ataquePokemon = null;
		 defesaPokemon =  null;
		 tipoPokemon = null;
		 opcoesMenu = 0;
		 opcoesTipo = 0;
		 idPokemon1 = 0;
		 idPokemon2 = 0;
		 
		 
		// Declara o Scanner
		Scanner entradaTeclado = new Scanner(System.in);

		System.out.println("Bem vindo a versão alpha, do Simulador de X1 de Pokemóns\n ");

		System.out.println("Escolha uma opção do menu: ");
		System.out.println(" -------------- Menu -------------- ");
		System.out.println("	1 - Simular X1");
		System.out.println("	2 - Inserir novo Pokémon");
		System.out.println("	3 - Listar Pokémons");
		System.out.println("	4 - Deletar Pokémon");
		System.out.println("------------------------------------");

		// Entrada opcoesMenu
		opcoesMenu = entradaTeclado.nextInt(); // lê o próximo int a ser entrado e joga para a var opcoesMenu

		// Switch opções iniciais do menu
		switch (opcoesMenu) {
		case 1: { // X1 de pokémons
			System.out.println("X1 de pokémons \n");
			System.out.println("Escolha o número de dois dos pokémons existentes para o X1");

			// Realiza a leitura do arquivo "arquivoNome"  
			// e printa na tela os dados de todos od pokemons
			ArquivoManip.LeituraDeArquivo(arquivoNome);

			System.out.println("\nEscolha Pokemon 1:\n");
			idPokemon1 = entradaTeclado.nextInt(); 
			System.out.println("\nEscolha Pokemon 2:\n");
			idPokemon2 = entradaTeclado.nextInt(); 
			
			System.out.println("Pokemon 1: \n");
			
			 nomePokemon1 = ExtractManip.LeituraExtract("extractData", idPokemon1, 1);
			 tipoPokemon1 = ExtractManip.LeituraExtract("extractData", idPokemon1, 2);
			 vidaPokemon1 = ExtractManip.LeituraExtract("extractData", idPokemon1, 3);
			 ataquePokemon1 = ExtractManip.LeituraExtract("extractData", idPokemon1, 4);
			 defesaPokemon1 = ExtractManip.LeituraExtract("extractData", idPokemon1, 5);
			 infosPokemon1 = ExtractManip.LeituraExtract("extractData", idPokemon1, 6);
			
			//System.out.println(infosPokemon1);
			
			System.out.println("Pokemon 2: \n");
			 nomePokemon2 = ExtractManip.LeituraExtract("extractData", idPokemon2, 1);
			 tipoPokemon2 = ExtractManip.LeituraExtract("extractData", idPokemon2, 2);
			 vidaPokemon2 = ExtractManip.LeituraExtract("extractData", idPokemon2, 3);
			 ataquePokemon2 = ExtractManip.LeituraExtract("extractData", idPokemon2, 4);
			 defesaPokemon2 = ExtractManip.LeituraExtract("extractData", idPokemon2, 5);
			 infosPokemon2 = ExtractManip.LeituraExtract("extractData", idPokemon2, 6);
			
			System.out.println(infosPokemon2);
			
			System.out.println("\nDeseja retornar ao menu? \n");
			System.out.println("	1 - Sim");
			System.out.println("	2 - Não");

			int opcao = 0;
			opcao = entradaTeclado.nextInt(); // lê o próximo int a ser entrado e joga para a var opcoesMenu
			if (opcao == 1) {
				// Chama o menu e retorna a opção escolhida
				menuPrincipal.menu();
			} else {
				System.out.println("\nFIM DE PROGRAMA");
				break;
			}

			break;
		}
		case 2: { // Criar um novo pokémon
			
			id = getId() + 1;
			
			System.out.println("ID: " + getId());	
		
			
			System.out.println("Criar um novo pokémon \n");

			System.out.println("Escolha o nome do pokemón: ");

			// Entrada para desbugar
			String desbugaPokemon = entradaTeclado.nextLine();

			// Entrada do nome do pokemon
			nomePokemon = entradaTeclado.nextLine(); // Lê as próximas cadeia de caracteres digitadas e joga para
															// a var nomePokemon
			ArquivoManip.EscritaDeArquivo("\n" + getId() + " - " + nomePokemon, arquivoNome); // Realiza a escrita de nomePokemon em
																				// arquivoNome
			System.out.println("\nNome: " + nomePokemon + "\n");

			System.out.println("Escolha o tipo do pokémon: \n");
			System.out.println("	1 - Fogo");
			System.out.println("	2 - Planta");
			System.out.println("	3 - Agua");
			System.out.println("	4 - Pedra");
			System.out.println("	5 - Inseto");

			// Entrada opcoesMenu
			// Scanner entradaOpcoesTipo = new Scanner(System.in);// Declara o Scanners
			opcoesTipo = entradaTeclado.nextInt(); // lê o próximo int a ser entrado e joga para a var opcoesMenu

			switch (opcoesTipo) { // this.tipo
			case 1: {
				amostradoraAux = "Nome: " + nomePokemon + "\nTipo: Fogo\n";
				System.out.println("Nome: " + nomePokemon);
				System.out.println("Tipo: Fogo");
				ArquivoManip.EscritaDeArquivo("tipo: fogo;", arquivoNome); // Realiza a escrita do tipo do pokemon em
																			// arquivoNome
				tipoPokemon = "Fogo";
				
				break;
			}
			case 2: {
				amostradoraAux = "Nome: " + nomePokemon + "\nTipo: Planta\n";
				System.out.println("Nome: " + nomePokemon);
				System.out.println("Tipo: Planta");
				ArquivoManip.EscritaDeArquivo("tipo: planta;", arquivoNome); // Realiza a escrita do tipo do pokemon em
				
				tipoPokemon = "Planta";																// arquivoNome
				
				break;
			}
			case 3: {
				amostradoraAux = "Nome: " + nomePokemon + "\nTipo: agua\n";
				System.out.println("Nome: " + nomePokemon);
				System.out.println("Tipo: Agua");
				ArquivoManip.EscritaDeArquivo("tipo: agua;", arquivoNome); // Realiza a escrita do tipo do pokemon em
																			// arquivoNome
				
				tipoPokemon = "Agua";
				
				break;
			}
			case 4: {
				amostradoraAux = "Nome: " + nomePokemon + "\nTipo: Pedra\n";
				System.out.println("Nome: " + nomePokemon);
				System.out.println("Tipo: Pedra");
				ArquivoManip.EscritaDeArquivo("tipo: pedra;", arquivoNome); // Realiza a escrita do tipo do pokemon em
																			// arquivoNome
				
				tipoPokemon = "Pedra";
				
				break;
			}
			case 5: {
				amostradoraAux = "Nome: " + nomePokemon + "\nTipo: Inseto\n";
				System.out.println("Nome: " + nomePokemon);
				System.out.println("Tipo: Inseto");
				ArquivoManip.EscritaDeArquivo("tipo: inseto;", arquivoNome); // Realiza a escrita do tipo do pokemon em
																			// arquivoNome
				
				tipoPokemon = "Inseto";
				
				break;
			}
			default:
				System.out.println("\nOpção inexistente, esolhe direito rapá!");
				break;
			}

			// Entrada para desbugar
			String desbugaPokemon1 = entradaTeclado.nextLine();

			// Entrada da vida
			System.out.println("\nEntre com a vida do pokemón: ");
			// Scanner entradaVida = new Scanner(System.in); //Declara o Scanner
			vidaPokemon = entradaTeclado.nextLine(); // Lê as próximas cadeia de caracteres digitadas e joga para
															// a var vidaPokemon
			ArquivoManip.EscritaDeArquivo("vida: " + vidaPokemon, arquivoNome); // Realiza a escrita de vidaPokemon em
																				// arquivoNome
			amostradoraAux = amostradoraAux + "vida: " + vidaPokemon + "\n";
			System.out.println(amostradoraAux);

			// Entrada do ataque
			System.out.println("\nEntre com a quantidade de ataque do pokemón:  ");
			// Scanner entradaAtaque = new Scanner(System.in); //Declara o Scanner
			ataquePokemon = entradaTeclado.nextLine(); // Lê as próximas cadeia de caracteres digitadas e joga
																// para a var ataquePokemon
			ArquivoManip.EscritaDeArquivo("ataque: " + ataquePokemon, arquivoNome); // Realiza a escrita de
																					// ataquePokemon em arquivoNome
			amostradoraAux = amostradoraAux + "Ataque: " + ataquePokemon + "\n";
			System.out.println(amostradoraAux);

			// Entrada da defesa
			System.out.println("\nEntre com a quantidade de defesa do pokemón: ");
			// Scanner entradaDefesa = new Scanner(System.in); //Declara o Scanner
			defesaPokemon = entradaTeclado.nextLine(); // Lê as próximas cadeia de caracteres digitadas e joga
																// para a var defesaPokemon
			ArquivoManip.EscritaDeArquivo("defesa: " + defesaPokemon, arquivoNome); // Realiza a escrita de
																					// defesaPokemon em arquivoNome
			amostradoraAux = amostradoraAux + "Defesa: " + defesaPokemon + "\n";
			System.out.println(amostradoraAux);

			ArquivoManip.EscritaDeArquivo(Integer.toString(getId()), "arquivoCountID");
			
			ArquivoManip.EscritaDeArquivo(Integer.toString(getId()), "extractData");
			ArquivoManip.EscritaDeArquivo(nomePokemon, "extractData");
			ArquivoManip.EscritaDeArquivo(tipoPokemon, "extractData");
			ArquivoManip.EscritaDeArquivo(vidaPokemon, "extractData");
			ArquivoManip.EscritaDeArquivo(ataquePokemon, "extractData");
			ArquivoManip.EscritaDeArquivo(defesaPokemon, "extractData");
			
			//Switch Faz Pokemon
		
			
			System.out.println("\nDeseja retornar ao menu? \n");
			System.out.println("	1 - Sim");
			System.out.println("	2 - Não");

			int opcao = 0;
			opcao = entradaTeclado.nextInt(); // lê o próximo int a ser entrado e joga para a var opcoesMenu
			if (opcao == 1) {
				// Chama o menu e retorna a opção escolhida
				menuPrincipal.menu();
			} else {
				System.out.println("\nFIM DE PROGRAMA");
				break;
			}
			break;

		}
		case 3: { // Mostrar lista de pokémons
			System.out.println("Mostrar lista de pokémons \n");
			// Realiza a leitura do arquivo "arquivoNome"
			ArquivoManip.LeituraDeArquivo(arquivoNome);

			System.out.println("\nDeseja retornar ao menu? \n");
			System.out.println("	1 - Sim");
			System.out.println("	2 - Não");

			int opcao = 0;
			opcao = entradaTeclado.nextInt(); // lê o próximo int a ser entrado e joga para a var opcoesMenu
			if (opcao == 1) {
				// Chama o menu e retorna a opção escolhida
				menuPrincipal.menu();
			} else {
				System.out.println("\nFIM DE PROGRAMA");
				break;
			}

			break;
		}
		case 4: { // Deletar pokémon
			System.out.println("Deletar pokémon \n");
			System.out.println("Escolha o nome do pokemon a ser deletado: ");
			// Scanner entradaPokemon = new Scanner(System.in); //Declara o Scanner
			nomePokemon = entradaTeclado.nextLine(); // Lê as próximas cadeia de caracteres digitadas e joga para
															// a var nomePokemon
			// ArquivoManip.EscritaDeArquivo(nomePokemon, arquivoNome); // Realiza a escrita
			// de nomePokemon em arquivoNome

			System.out.println("\nDeseja retornar ao menu? \n");
			System.out.println("	1 - Sim");
			System.out.println("	2 - Não");

			int opcao = 0;
			opcao = entradaTeclado.nextInt(); // lê o próximo int a ser entrado e joga para a var opcoesMenu
			if (opcao == 1) {
				// Chama o menu e retorna a opção escolhida
				menuPrincipal.menu();
			} else {
				System.out.println("\nFIM DE PROGRAMA");
				break;
			}
			
				

			break;
		}
		default:
			System.out.println("Opçãoo inexistente, esolhe direito rapá!");
			break;
		}
	}
	
	
public static String getNomePokemon1() {
		return nomePokemon1;
	}


public static int getIdPokemon1() {
		return idPokemon1;
	}


	public static int getIdPokemon2() {
		return idPokemon2;
	}


	//Getters
	public static String getArquivoNome() {
		return arquivoNome;
	}


	public static String getAmostradoraAux() {
		return amostradoraAux;
	}


	public static String getNomePokemon() {
		return nomePokemon;
	}


	public static String getVidaPokemon() {
		return vidaPokemon;
	}


	public static String getAtaquePokemon() {
		return ataquePokemon;
	}


	public static String getDefesaPokemon() {
		return defesaPokemon;
	}


	public static String getTipoPokemon() {
		return tipoPokemon;
	}


	public static int getOpcoesMenu() {
		return opcoesMenu;
	}


	public static int getOpcoesTipo() {
		return opcoesTipo;
	}


	public static int getIdAtual() {
		return idAtual;
	}


	public Scanner getEntradaTeclado() {
		return entradaTeclado;
	}


	public static int getId() {
		return id;
	}
	
	public static String getAtaquePokemon1() {
		return ataquePokemon1;
	}


	public static String getDefesaPokemon1() {
		return defesaPokemon1;
	}


	public static String getInfosPokemon1() {
		return infosPokemon1;
	}


	public static String getVidaPokemon1() {
		return vidaPokemon1;
	}


	public static String getTipoPokemon1() {
		return tipoPokemon1;
	}


	public static String getVidaPokemon2() {
		return vidaPokemon2;
	}


	public static String getAtaquePokemon2() {
		return ataquePokemon2;
	}


	public static String getDefesaPokemon2() {
		return defesaPokemon2;
	}


	public static String getInfosPokemon2() {
		return infosPokemon2;
	}


	public static String getNomePokemon2() {
		return nomePokemon2;
	}

	

	
	
}
