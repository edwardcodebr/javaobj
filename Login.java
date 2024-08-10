package Myroom;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao login, digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Seja bem-vindo, " + nome);
        System.out.println("Digite sua senha:");
        String senha = scanner.nextLine();
        System.out.println("Escreva sua idade:");
        int idade = scanner.nextInt();
        scanner.nextLine();  // Limpa o buffer

        if (idade >= 1 && idade <= 12) {
            System.out.println("Criança.");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Jovem.");
        } else if (idade >= 18 && idade <= 55) {
            System.out.println("Adulto.");
        } else if (idade >= 56) {
            System.out.println("Idoso.");
        }

        while (true) {
            System.out.println("Bem-vindo ao menu\nNome: " + nome + "\nIdade: " + idade + "\n1 - Mudar senha\n2 - Mudar nome\n3 - Sair\n");
            int escolha = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer

            switch (escolha) {
                case 1:
                    System.out.println("Digite a nova senha:");
                    senha = scanner.nextLine();
                    System.out.println("Senha alterada com sucesso.");
                    break;
                case 2:
                    System.out.println("Digite a senha atual:");
                    String senhad = scanner.nextLine();
                    if (senhad.equals(senha)) {
                        System.out.println("Digite o novo nome:");
                        nome = scanner.nextLine();
                        System.out.println("Nome alterado com sucesso para: " + nome);
                    } else {
                        System.out.println("Senha incorreta.");
                    }
                    break;
                case 3:
                    System.out.println("Desligando...");
                    return;  // Sai do método main e encerra o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}