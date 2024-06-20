package ecommerce;

import java.util.Locale;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		float peso, altura;
		int  tamanho, opcao,tipo;
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
			opcao = leia.nextInt();

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
				

				System.out.println("Olá " + nome + ", Digite sua Altura (ex: 1.75)");
				altura = leia.nextFloat();

				System.out.println("Olá " + nome + ", Digite seu peso (ex: 65.5)");
				peso = leia.nextFloat();
				
				
				do {
					System.out.println("Digite 1 para calças ou 2 para blusas  :");
					tipo = leia.nextInt();
				} while (tipo < 1 || tipo > 2);
				System.out.println("Digite a cor da sua calça 1 - Verde, 2 - Azul, 3 - Amarelo ");
				tamanho = leia.nextInt();
				
				switch(tamanho) {
				
				
				}
				
				break;
				
			case 2:
			
				System.out.println("Aqui estão seus pedidos\n\n");
				break;
				
			case 3:
				
				System.out.println("Atualizar seu pedido\n\n ");
				
				break;
				
			case 4:
				System.out.println("Apagar o pedido\n\n");
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

}
