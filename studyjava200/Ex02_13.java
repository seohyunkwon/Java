import java.awt.print.Printable;
import java.util.Random;

public class Ex02_13 {
	public static void main(String[] args) {
		
		Random random = new Random();
		double a = Math.random();
		double b = random.nextDouble()*10;
		double c = -1 + random.nextDouble()*2;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}

}
