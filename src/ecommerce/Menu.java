package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import roupa.controller.ContaController;
import roupa.model.Bermuda;
import roupa.model.Camisa;

public class Menu {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		ContaController cc = new ContaController();

		
		

		float peso, altura;
		int  opcao, tipo,genero;
		String generoNome ="";
		String nome, menu = """
				-------------------------
				|   BRECHÓ DO ROSDRIGO   |
				-------------------------
				|  1. Novo Pedido        |
				|  2. Ver seus pedidos   |
				|  3. Atualizar pedido   |
				|  4. Deletar pedido     |
				|  5. Sair               |
				-------------------------
				""";

		while (true) {
			System.out.println(menu);
			System.out.println("Entre com a opção desejada: ");
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 5) {

				System.out.println("\nMuito Obrigado! Brechó do Rosdrigo agradece, Volte sempre!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Bem vindo, Digite o seu nome: ");
				leia.skip("\\R?");
				nome = leia.nextLine();

				do {
					System.out.println("Digite (1) se está procurando Camisas ou (2) para Bermudas");
					tipo = leia.nextInt();
				} while (tipo < 1 || tipo > 2);
				System.out.println("Digite (1) Para Genero Feminimo e (2) Para Masculino:  ");
				genero = leia.nextInt();
				
				switch(genero) {
				case 1:
					generoNome =  "Feminimo";
					break;
				case 2:
					generoNome = "Masculino";
					break;
					default: 
						System.out.println("Número Inválido");
				}
				
				System.out.println("Digite a cor que você deseja: ");
				leia.skip("\\R?");
				String cor =leia.nextLine();
				
				switch (tipo) { 
			case 1 -> {
				System.out.println("Digite 1 se deseja capuz ou 2 para não: ");
				int capuzTipo = leia.nextInt();
				
				System.out.println("Digite 1 se deseja manga ou 2 para não: ");
				int mangaTipo = leia.nextInt();
				
				cc.cadastrar(new Camisa(cor, generoNome,cc.gerarNumero(), capuzTipo, mangaTipo));
			}
			case 2 -> {
				System.out.println("Digite 1 se deseja bolso ou 2 para não: ");
				int bolso = leia.nextInt();
				cc.cadastrar(new Bermuda(cor, generoNome,cc.gerarNumero(),bolso));			}
				}
				
				

				keyPress();
				break;

			case 2:

				System.out.println("Aqui estão seus pedidos\n\n");
				cc.listarTodas();
				keyPress();
				break;

			case 3:

				System.out.println("Atualizar seu pedido\n\n ");
				System.out.println("Digite o ID do pedido: ");
				int pedidoDel = leia.nextInt();
				
				var buscaConta = cc.buscarNaCollection(pedidoDel);
				
				if(buscaConta !=null) {
					buscaConta.getNumero();
					
					do {
						System.out.println("Digite (1) se está procurando Camisas ou (2) para Bermudas");
						tipo = leia.nextInt();
					} while (tipo < 1 || tipo > 2);
					System.out.println("Digite (1) Para Genero Feminimo e (2) Para Masculino:  ");
					genero = leia.nextInt();
					
					switch(genero) {
					case 1:
						generoNome =  "Feminimo";
						break;
					case 2:
						generoNome = "Masculino";
						break;
						default: 
							System.out.println("Número Inválido");
					}
					
					System.out.println("Digite a cor que você deseja: ");
					leia.skip("\\R?");
					String cor2 =leia.nextLine();
					
					switch (tipo) { 
				case 1 -> {
					System.out.println("Digite 1 se deseja capuz ou 2 para não: ");
					int capuzTipo = leia.nextInt();
					
					System.out.println("Digite 1 se deseja manga ou 2 para não: ");
					int mangaTipo = leia.nextInt();
					
					cc.cadastrar(new Camisa(cor2, generoNome,cc.gerarNumero(), capuzTipo, mangaTipo));
				}
				case 2 -> {
					System.out.println("Digite 1 se deseja bolso ou 2 para não: ");
					int bolso = leia.nextInt();
					cc.cadastrar(new Bermuda(cor2, generoNome,cc.gerarNumero(),bolso));			}
					}
					
					

					keyPress();
					break;
				}
				
				break;

			case 4:
				System.out.println("Apagar o pedido\n\n");
				System.out.println("Digite o ID do pedido: ");
				int pedido = leia.nextInt();
				
				cc.deletar(pedido);
				break;

			default:
				System.out.println("OPÇÃO INVALIDA");
				break;
			}

		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Final do primeiro bloco feito por: Rodrigo Silva ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/rosdrigo");
		System.out.println("*********************************************************");

	}

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
