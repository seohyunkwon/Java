import java.util.Scanner;

public class Ex03_3 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("두개의 정수를 입력하시오");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a%b==0) {
			System.out.println("B는 A의 약수이다.");
		} else {
			System.out.println("B는 A의 약수가 아니다.");    // if(a%b !=0)
		}
		
	}
}
