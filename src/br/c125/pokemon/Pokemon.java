package br.c125.pokemon;



public abstract class Pokemon{
	
	protected String nome;
	protected double vida;
	protected double ataque;
	protected double defesa;
	protected int tipo;
	protected int id;

	public Pokemon(int id, String nome, double vida, double ataque, double defesa){
		this.id = id;
		this.nome = nome;
		this.vida = vida;
		this.ataque = ataque;
		
	}
	/*Ataca o pokemon, o pokemon q ser� atacado � passado por parametro. 
	 Imprimime menssagem e altera o a vida do pokemon atacado.*/
	public void atacar(Pokemon patacado) {
		
		double vida = patacado.getVida();
		System.out.println(this.nome + " atacando!");
		System.out.println(this.nome + " atacou " + patacado.getNome() + "!");
		
		vida = ((vida - this.ataque) + patacado.getDefesa());
		
		patacado.setVida(vida);
		
		System.out.println();
		
	}
	
	//Ao chamar esta fun��o, as informa��es do Pokemon ser�o imprimidas
	public void mostraInfo() {
		System.out.println("ID: " + this.id);
		System.out.println("Pokemon: " + this.nome);
		System.out.println("HP: " + this.vida);
		System.out.println("ATK: " + this.ataque);
		System.out.println("Defesa: " + this.defesa);
		
		switch (this.tipo) {
		case 1:
			System.out.println("Tipo: Fogo");
			break;
		case 2:
			System.out.println("Tipo: Planta");
			break;
		case 3:
			System.out.println("Tipo: Agua");
			break;
		case 4:
			System.out.println("Tipo: Pedra");
			break;
		case 5:
			System.out.println("Tipo: Inseto");
			break;
			}
		System.out.println();
	}

	
	// Getters & Setters
	public String getNome() {
		return nome;
	}

	public double getVida() {
		return vida;
	}

	public double getAtaque() {
		return ataque;
	}

	public double getDefesa() {
		return defesa;
	}
	public int getTipo() {
		return tipo;
	}
	public void setVida(double vida) {
		this.vida = vida;
	}
	
	
	
}



