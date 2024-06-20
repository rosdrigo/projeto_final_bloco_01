package roupa.model;

public class Camisa extends Roupa {
	
	private int capuz;
	private int manga;
	
	public Camisa(int tamanho, String cor, int genero, int capuz, int manga, int numero) {
		super(tamanho, cor, genero,numero);
		
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
		System.out.println("1 - Com Manga, 2 - Sem Manga "+ this.manga);
		System.out.println("1 - Com Capuz, 2 - Sem Capuz "+ this.capuz);
	}

}
