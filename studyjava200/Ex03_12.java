import java.util.Scanner;

public class Ex03_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�Ǽ� a: "); double a = scanner.nextDouble();
		System.out.print("�Ǽ� b: "); double b = scanner.nextDouble();
		
		double max = a>b ? a : b;
		System.out.println("�ִ��� " +max+"�Դϴ�.");
		
		
	}

}
