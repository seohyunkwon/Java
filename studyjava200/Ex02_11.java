import java.util.Random;

public class Ex02_11 {
	public static void main(String args[]) {
		Random random = new Random();
		
		int a = 1+ random.nextInt(9);
		int b = -1 - random.nextInt(9);
		int c = 10+ random.nextInt(90);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}
}
