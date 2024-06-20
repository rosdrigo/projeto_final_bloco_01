package roupa.model;

public class Bermuda extends Roupa {

	private int bolso;
	
	public Bermuda( String cor, String genero,int numero, int bolso ) {
		super(cor, genero,numero);
		
		this.bolso = bolso;
		
	
		
	}
	
	public int getBolso() {
		return bolso;
	}

	public void setBolso(int bolso) {
		this.bolso = bolso;
	}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Sua Escolha (1 com bolso / 2 sem bolso):  "+ this.bolso);
		
	}

}
