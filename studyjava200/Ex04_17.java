import java.util.Scanner;

public class Ex04_17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if(a>0) {
			for(int i=0; i<a; i++) {
				System.out.print("*");
				if(i%5==4) {System.out.println();}
			}
			} if(a%5!=0) {System.out.println();}
				
			System.out.println();
	}
}