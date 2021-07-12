package br.c125.pokemon;

import br.c125.interfaces.Curavel;

public class Agua extends Pokemon implements Curavel {

	public Agua(int id, String nome, double vida, double ataque, double defesa) {
		super(id, nome, vida, ataque, defesa);
		
	}
	
	public void curarVida() {
		
		this.vida += 15;
	}

}
