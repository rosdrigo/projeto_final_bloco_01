package roupa.repository;

import roupa.model.Roupa;

public interface RoupaRepository {
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void cadastrar(Roupa roupa);
	public void atualizar(Roupa roupa);
	public void deletar(int numero);
	
	
}
