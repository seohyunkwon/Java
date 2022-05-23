import java.util.Scanner;

public class Ex03_15 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int min = a<b ? a : b;
		if(min<=c) { System.out.println(min);}
		else { System.out.println(c);}
		
	}
	
}
