import java.util.Stack;
import java.util.Scanner;
public class Fila {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		 while (true) {
	            System.out.println("1 - Adicionar jogo na pilha.");
	            System.out.println("2 - Remover jogo do topo da pilha.");
	            System.out.println("3 - Listar jogos na pilha.");
	            System.out.println("4 - Sair.");
	            int choose = scanner.nextInt();
	            scanner.nextLine();  // Limpa o buffer do scanner
	            
	            switch (choose) {
	                case 1: 
	                    System.out.println("Digite o nome do jogo para empilhar:");
	                    String new_game = scanner.nextLine();
	                    stack.push(new_game);
	                    break;
	                
	                case 2: 
	                    if (!stack.isEmpty()) {
	                        String removedGame = stack.pop();
	                        System.out.println("Jogo removido: " + removedGame);
	                    } else {
	                        System.out.println("A pilha está vazia!");
	                    }
	                    break;
	                
	                case 3:
	                    if (!stack.isEmpty()) {
	                        System.out.println("Jogos na pilha: " + stack);
	                    } else {
	                        System.out.println("A pilha está vazia!");
	                    }
	                    break;
	                
	                case 4:
	                    System.out.println("Desligando...");
	                    return;
	                
	                default:
	                    System.out.println("Opção inválida!");
	                    break;
	            }
	        }
	}	
}