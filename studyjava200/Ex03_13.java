import java.util.Scanner;

public class Ex03_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 a: "); int a = scanner.nextInt();
		System.out.print("정수 b: "); int b = scanner.nextInt();
		
//		if(a>=b) {
//			System.out.println("두 값의 차는 "+ (a-b) +"입니다.");
//		} else {
//			System.out.println("두 값의 차는 "+ (b-a) +"입니다.");
//		}
//		
		int diff = a>=b ? a-b : b-a;
		System.out.println("두 값의 차는 "+ diff +"입니다.");
	} 

}
