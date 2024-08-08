package oi;

import java.util.Scanner;

public class Hello {
    static boolean button;  // Make 'button' static
    static boolean ligar = true;  // Make 'ligar' static
    static boolean desligar = false;  // Make 'desligar' static

    public static void main(String[] args) {    
    		Scanner scanner = new Scanner(System.in);
    		while(true) {
    		System.out.println("Estado atual do botão: " + button);
        
    		System.out.println("Bem-vindo ao interruptor\nDeseja fazer o que?\n1 - ligar\n2 - desligar\n");
    		int escolha = scanner.nextInt();  // No arguments for nextInt()
    		scanner.nextLine();  // Consume the newline character
        
    		if (escolha == 1) {
    			button = ligar;  // Set 'button' to 'ligar'
    			System.out.println("O botão foi ligado: " + ligar);
    		} else if (escolha == 2) {
    			button = desligar;  // Set 'button' to 'desligar'
    			System.out.println("O botão foi desligado: " + desligar);
    		} else {
    			System.out.println("Escolha inválida.");
    		}
    }
}
}
