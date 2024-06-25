package prova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	  private static List<Categoria> categorias = new ArrayList<>();
	    private static List<Produto> produtos = new ArrayList<>();

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int opcao;

	        do {
	            System.out.println("1. Cadastrar Categoria");
	            System.out.println("2. Cadastrar Produto");
	            System.out.println("3. Listar Categorias");
	            System.out.println("4. Listar Produtos");
	            System.out.println("5. Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();
	            scanner.nextLine(); // Consumir nova linha

	            switch (opcao) {
	                case 1:
	                    cadastrarCategoria(scanner);
	                    break;
	                case 2:
	                    cadastrarProduto(scanner);
	                    break;
	                case 3:
	                    listarCategorias();
	                    break;
	                case 4:
	                    listarProdutos();
	                    break;
	                case 5:
	                    System.out.println("Saindo...");
	                    break;
	                default:
	                    System.out.println("Opção inválida.");
	                    break;
	            }
	        } while (opcao != 5);

	        scanner.close();
	    }

	    private static void cadastrarCategoria(Scanner scanner) {
	        System.out.print("Nome da Categoria: ");
	        String nome = scanner.nextLine();

	        if (categoriaExiste(nome)) {
	            System.out.println("Categoria já cadastrada.");
	        } else {
	            Categoria categoria = new Categoria(nome);
	            categorias.add(categoria);
	            System.out.println("Categoria cadastrada com sucesso.");
	        }
	    }

	    private static void cadastrarProduto(Scanner scanner) {
	        if (categorias.isEmpty()) {
	            System.out.println("Nenhuma categoria cadastrada. Cadastre uma categoria primeiro.");
	            return;
	        }

	        System.out.print("Nome do Produto: ");
	        String nome = scanner.nextLine();

	        if (produtoExiste(nome)) {
	            System.out.println("Produto já cadastrado.");
	        } else {
	            listarCategorias();
	            System.out.print("Código da Categoria: ");
	            int codigoCategoria = scanner.nextInt();
	            scanner.nextLine(); // Consumir nova linha

	            Categoria categoria = buscarCategoria(codigoCategoria);
	            if (categoria == null) {
	                System.out.println("Categoria não encontrada.");
	            } else {
	                Produto produto = new Produto(nome, categoria);
	                produtos.add(produto);
	                System.out.println("Produto cadastrado com sucesso.");
	            }
	        }
	    }

	    private static void listarCategorias() {
	        if (categorias.isEmpty()) {
	            System.out.println("Nenhuma categoria cadastrada.");
	        } else {
	            for (Categoria categoria : categorias) {
	                System.out.println(categoria);
	            }
	        }
	    }

	    private static void listarProdutos() {
	        if (produtos.isEmpty()) {
	            System.out.println("Nenhum produto cadastrado.");
	        } else {
	            for (Produto produto : produtos) {
	                System.out.println(produto);
	            }
	        }
	    }

	    private static boolean categoriaExiste(String nome) {
	        return categorias.stream().anyMatch(categoria -> categoria.getNome().equalsIgnoreCase(nome));
	    }

	    private static boolean produtoExiste(String nome) {
	        return produtos.stream().anyMatch(produto -> produto.getNome().equalsIgnoreCase(nome));
	    }

	    private static Categoria buscarCategoria(int codigo) {
	        return categorias.stream().filter(categoria -> categoria.getCodigo() == codigo).findFirst().orElse(null);
	    }
}