package br.c125.pokemon;

import br.c125.interfaces.MaisDefesa;

public class Inseto extends Pokemon implements MaisDefesa {

	public Inseto(int id, String nome, double vida, double ataque, double defesa) {
		super(id, nome, vida, ataque, defesa);
		
	}

	@Override
	public void aumentaDefesa() {
		
		this.defesa +=3;
		
	}

}
