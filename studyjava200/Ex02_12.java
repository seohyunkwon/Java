import java.util.Random;
import java.util.Scanner;

public class Ex02_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int a = scanner.nextInt();
		int b = a-5 + random.nextInt(11);
		System.out.println(b);
		
		
	}

}
