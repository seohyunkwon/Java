import java.util.Scanner;

public class Ex04_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if(a>0) {
			for(int i=0; i<a; i++) {
				System.out.print("*");
				}
			System.out.println();
		}
	}
}
