package roupa.model;

public class Bermuda extends Roupa {

	private int bolso;
	
	public Bermuda(int tamanho, String cor, int genero, int bolso, int numero) {
		super(tamanho, cor, genero,numero);
		
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
		System.out.println("1 - Com bolso, 2 - Sem bolso "+ this.bolso);
		
	}

}
