import java.util.Scanner;

public class Ex03_1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정숫값을 입력하시오");
		
		int a = scanner.nextInt();
		
		if (a<0) {
			System.out.println("이 값은 음의 값입니다.");
		} else if (a==0) {
			System.out.println("이 값은 0입니다.");
		} else {
			System.out.println("이 값은 양의 값입니다.");
		}
		
		
	}
}
