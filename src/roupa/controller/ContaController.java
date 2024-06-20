package roupa.controller;

import java.util.ArrayList;

import roupa.model.Roupa;
import roupa.repository.RoupaRepository;

public class ContaController implements RoupaRepository {

	private ArrayList<Roupa> listaDeRoupas = new ArrayList<>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var roupa = buscarNaCollection(numero);

		if (roupa != null)
			roupa.visualizar();
		else
			System.out.println("\nA Conta número:" + numero + "não foi encontrada!");

	}

	@Override
	public void listarTodas() {
		for (var roupa : listaDeRoupas) {
			roupa.visualizar();

		}
	}

	@Override
	public void cadastrar(Roupa roupa) {
		listaDeRoupas.add(roupa);
		System.out.println("\nA Conta número: " + roupa.getNumero() + " foi criada com sucesso!");

	}

	@Override
	public void atualizar(Roupa roupa) {
		var buscaConta = buscarNaCollection(roupa.getNumero());

		if (buscaConta != null) {
			listaDeRoupas.set(listaDeRoupas.indexOf(buscaConta), roupa);
			System.out.println("\nA Conta número: " + roupa.getNumero() + " foi atualizada com sucesso!");

		} else {
			System.out.println("\nA Conta número: " + roupa.getNumero() + " não foi encontrada!");

		}

	}

	@Override
	public void deletar(int numero) {
		var roupa = buscarNaCollection(numero);

		if (roupa != null) {
			if (listaDeRoupas.remove(roupa) == true)
				System.out.println("\nA Conta número " + numero + " foi deletada com sucesso!");
		} else {
			System.out.println("\nA Conta número " + numero + " não foi encontrada!");
		}

	}
	public int gerarNumero() {
		return ++numero;
	}

	public Roupa buscarNaCollection(int numero) {
		for (var roupa : listaDeRoupas) {
			if (roupa.getNumero() == numero) {
				return roupa;
			}
		}
		return null;

	}
}
