import java.util.Scanner;

public class Ex03_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정숫값을 입력하시오.");
		int a = scanner.nextInt();
		
		if(a<0) {
			int b = -1 * a;
			System.out.println("정수의 절댓값은 " + b +"입니다." );
		} else {
		System.out.println("정수의 절댓값은 "+a+"입니다.");
		}
	}
}
