import java.util.Scanner;

public class Ex03_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a>b) {System.out.println("a가 크다."); }
		else if (a<b) {System.out.println("b가 크다.");}
		else {System.out.println("a와 b가 같다.");}
		
	}

}
