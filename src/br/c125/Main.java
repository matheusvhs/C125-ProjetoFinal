package br.c125;

import br.c125.maniparquivos.menuPrincipal;
import br.c125.maniparquivos.ArquivoManip;
import br.c125.pokemon.Agua;
import br.c125.pokemon.Fogo;
import br.c125.pokemon.Inseto;
import br.c125.pokemon.Pedra;
import br.c125.pokemon.Planta;

public class Main {

	public static void main(String[] args) {

		// Chama o menu e retorna a opção escolhida
		menuPrincipal.menu();

		//Fogo[] fogos = new Fogo[5];
		// Planta[] planta = new Planta[5];
		// Agua[] agua = new Agua[5];
		// Pedra[] pedra = new Pedra[5];
		// Inseto[] inseto = new Inseto[5];

		// switch
		// case 1:
		// fogos[menuPrincipal.getId()] = new Fogo(menuPrincipal.getId()
		// ,menuPrincipal.getNomePokemon(), 100, 25, 10,
		// Integer.parseInt(menuPrincipal.getTipoPokemon()));
		
		int id1 = menuPrincipal.getIdPokemon1();
        String nome1 = menuPrincipal.getNomePokemon1();
        double vida1 = Double.parseDouble(menuPrincipal.getVidaPokemon1());
        double ataque1 = Double.parseDouble(menuPrincipal.getAtaquePokemon1());
        double defesa1 = Double.parseDouble(menuPrincipal.getDefesaPokemon1());

        int id2 = menuPrincipal.getIdPokemon2();
        String nome2 = menuPrincipal.getNomePokemon2();
        double vida2 = Double.parseDouble(menuPrincipal.getVidaPokemon2());
        double ataque2 = Double.parseDouble(menuPrincipal.getAtaquePokemon2());
        double defesa2 = Double.parseDouble(menuPrincipal.getDefesaPokemon2());
		
		Fogo fogo1 = new Fogo(id1, nome1, vida1, ataque1, defesa1);
		Agua agua1 = new Agua(id2, nome2, vida2, ataque2, defesa2);
		
		//similando luta hard coded
		
		while(fogo1.getVida() > 0 || agua1.getVida() > 0 ) {
		
		fogo1.atacar(agua1);
		
		agua1.atacar(fogo1);
		
		if(fogo1.getVida() <= 0) {
		System.out.println("Agua Venceu!");
		break;
		}
		if(agua1.getVida() <= 0) {
			System.out.println("Fogo Venceu!");
			}
		}
		
		}
		
		// fogos[3].mostraInfo();

		/*
		 * agua1.mostraInfo(); planta1.mostraInfo(); fogo1.atacar(agua1);
		 * agua1.mostraInfo(); agua1.curarVida(); agua1.mostraInfo();
		 * 
		 * 
		 * pedra1.mostraInfo(); pedra1.aumentaDefesa(); pedra1.mostraInfo();
		 */

	}

