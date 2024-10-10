package fag;

import java.util.ArrayList;
import java.util.Scanner;

public class atividade {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<Produto> produtos = new ArrayList<>();
	        int opcao;

	        do {
	            System.out.println("\nSistema de Cadastro de Produtos");
	            System.out.println("1. Cadastrar novo produto");
	            System.out.println("2. Exibir produtos cadastrados");
	            System.out.println("3. Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();
	            scanner.nextLine(); // Limpa o buffer do scanner

	            switch (opcao) {
	                case 1:
	                    // Cadastrar novo produto
	                    System.out.print("Digite o nome do produto: ");
	                    String nome = scanner.nextLine();

	                    System.out.print("Digite o preço do produto: ");
	                    double preco = scanner.nextDouble();

	                    System.out.print("Digite a quantidade do produto: ");
	                    int quantidade = scanner.nextInt();

	                    Produto produto = new Produto(nome, preco, quantidade);
	                    produtos.add(produto);

	                    System.out.println("Produto cadastrado com sucesso!");
	                    break;

	                case 2:
	                    // Exibir produtos cadastrados
	                    if (produtos.isEmpty()) {
	                        System.out.println("Nenhum produto cadastrado.");
	                    } else {
	                        System.out.println("\nLista de Produtos Cadastrados:");
	                        for (Produto p : produtos) {
	                            System.out.println(p);
	                        }
	                    }
	                    break;

	                case 3:
	                    // Sair do programa
	                    System.out.println("Saindo...");
	                    break;

	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        } while (opcao != 3);

	        scanner.close();
	    }
	}
