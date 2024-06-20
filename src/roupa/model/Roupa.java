package roupa.model;

public abstract class  Roupa {
	
	private int tamanho;
	private String cor;
	private int genero;
	private int numero;
	
	
	public Roupa(int tamanho, String cor, int genero, int numero) {
		this.tamanho = tamanho;
		this.cor = cor;
		this.genero = genero;
		this.numero = numero;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getTamanho() {
		return tamanho;
	}


	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public int getGenero() {
		return genero;
	}


	public void setGenero(int genero) {
		this.genero = genero;
	}
	
	public void visualizar() {
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do seu Pedido:");
		System.out.println("***********************************************************");
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Cor: " + this.cor);
		System.out.println("Gênero: " + this.genero);
		System.out.println("ID: " + this.numero);
		
		
	}

}
