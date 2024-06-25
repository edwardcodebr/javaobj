package printstream;
 
import java.util.Scanner;
import java.io.PrintStream;
public class print {
	public static void main(String[] args) {
		while(true) {
			PrintStream ps = new PrintStream(System.out);
			Scanner scanner = new Scanner(System.in);
			ps.println("welcome to calculator Java, choose a function");
			ps.println("\n1- sum\n2 - sub\n3 - mult\n4 - div\n0 - exit");
			int choose = scanner.nextInt();
			if(choose == 1) {
				ps.println("exemple: x + y = z");
				ps.println("write valour for x:");
				int x = scanner.nextInt();
				ps.println("write a valour for y");
				int y = scanner.nextInt();
				int z = x + y;
				ps.println("the valour is " +z);
			}
			if(choose == 2) {
				ps.println("exemple: x - y = z");
				ps.println("write valour for x:");
				int x1 = scanner.nextInt();
				ps.println("write a valour for y");
				int y1 = scanner.nextInt();
				int z1 = x1 - y1;
				ps.println("the valour is " +z1);
			}
			if(choose == 3) {
				ps.println("exemple: x * y = z");
				ps.println("write valour for x:");
				int x2 = scanner.nextInt();
				ps.println("write a valour for y");
				int y2 = scanner.nextInt();
				int z2 = x2 * y2;
				ps.println("the valour is " +z2);
			}
			if(choose == 4) {
				ps.println("exemple: x / y = z");
				ps.println("write valour for x:");
				int x3 = scanner.nextInt();
				ps.println("write a valour for y");
				int y3 = scanner.nextInt();
				int z3 = x3 / y3;
				ps.println("the valour is " +z3);
			}
			if(choose == 0) {
				ps.print("bye bye.");
				break;
			}
		}
		
}
}