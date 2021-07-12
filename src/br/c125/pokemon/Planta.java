package br.c125.pokemon;

import br.c125.interfaces.Curavel;

public class Planta extends Pokemon implements Curavel {

	public Planta(int id, String nome, double vida, double ataque, double defesa) {
		super(id, nome, vida, ataque, defesa);
		
	}

	@Override
	public void curarVida() {
		this.vida += 10;
	}

}
