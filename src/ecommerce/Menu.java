package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
	

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		float peso, altura;
		int  cor, opcao,tipo;
		String  nome, menu = """
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
					
				keyPress();
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

	}public static void keyPress() {

		try {

			System.out.println( "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

}
	}}
