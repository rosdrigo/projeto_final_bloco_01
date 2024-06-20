package roupa.model;

public class Camisa extends Roupa {
	
	private int capuz;
	private int manga;
	
	public Camisa(String cor, String genero,int numero, int capuz, int manga) {
		super(cor, genero,numero);
		
		this.capuz = capuz;
		this.manga = manga;
		
	}

	public int getCapuz() {
		return capuz;
	}

	public void setCapuz(int capuz) {
		this.capuz = capuz;
		
		
	}

	public int getManga() {
		return manga;
	}

	public void setManga(int manga) {
		this.manga = manga;
	}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Sua Escolha (1 com manga / 2 sem manga):  "+ this.manga);
		System.out.println("Sua Escolha (1 com capuz / 2 sem capuz):  "+ this.capuz);
	}

}
