import java.util.Scanner;

public class program{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        
        System.out.println("digite um numero x para soma:");
        int x = scanner.nextInt();
        System.out.println("digite o y:");
        int y = scanner.nextInt();

        int z = x + y;

        System.out.printf("sua soma de %d com %d deu %d", x, y, z);
    }
}