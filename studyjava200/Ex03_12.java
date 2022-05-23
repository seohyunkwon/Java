import java.util.Scanner;

public class Ex03_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("실수 a: "); double a = scanner.nextDouble();
		System.out.print("실수 b: "); double b = scanner.nextDouble();
		
		double max = a>b ? a : b;
		System.out.println("최댓값은 " +max+"입니다.");
		
		
	}

}
