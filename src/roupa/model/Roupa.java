package roupa.model;

public abstract class  Roupa {
	
	
	private String cor;
	private String genero;
	private int numero;
	
	
	public Roupa( String cor, String genero, int numero) {
		
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



	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void visualizar() {
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do seu Pedido:");
		System.out.println("***********************************************************");
		System.out.println("Cor: " + this.cor);
		System.out.println("Gênero: " + this.genero);
		System.out.println("ID: " + this.numero);
		
		
	}

}
