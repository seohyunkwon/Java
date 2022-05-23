import java.util.Scanner;

public class Ex03_14 {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int diff = a>=b ? a-b : b-a ;
		
//		if (diff<=10) {System.out.println("두 값의 차는 10 이하입니다."); }
//		else {System.out.println("두 값의 차는 11 이상입니다.");}
		
		System.out.println("두 값의 차는 "+ (diff<=10 ? "10이하":"11이상") + "입니다.");
	}
}
