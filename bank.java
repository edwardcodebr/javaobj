import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannercpf = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        Scanner scanner5 = new Scanner(System.in);
        Scanner scanner6 = new Scanner(System.in);
        Scanner scanner7 = new Scanner(System.in);

        System.out.println("welcome to bank nacional Microsoft, let's start creating your account, enter name:");
        String name = scanner.nextLine();
        System.out.println("enter username:");
        String cpf = scannercpf.nextLine();
        System.out.println("press a number for continue:");
        int bag = scanner2.nextInt();

        bag = 0;

        System.out.println("welcome to bank profile:");
        System.out.println("name:" +name);
        System.out.println("account:" +cpf);
        System.out.println("money in bag:" +bag);

        System.out.println("press 1 for first money");
        int ch = scanner3.nextInt();
            if (ch == 1) 
            {
                System.out.println("you recive 1$ in your account.");
                bag = bag + 1;
            }
        boolean continuar = true;
        while (1 == 1) {
            System.out.println("welcome to bank profile:");
            System.out.println("name:" +name);
            System.out.println("account:" +cpf);
            System.out.println("money in bag:" +bag);
            System.out.println("1 - deposit.");
            System.out.println("2 - tranfer.");
            System.out.println("3 - exit.");
            int ch2 = scanner4.nextInt();
            switch (ch2) {
            case 1:
                System.out.printf("write a valour for deposit:");
                int win = scanner5.nextInt();
                    bag = bag + win;
                System.err.println("your account is now:" +bag);
                break;
            case 2:
                System.out.println("write a valour for transfer:");
                int back = scanner6.nextInt();
                if (bag >= 0){
                    System.out.println("no.");
                }
            case 3:
                continuar = false;
            }
        }


    }
}