// 양의 정숫값을 읽어서 그 자릿수를 출력하는 프로그램을 작성하자
import java.util.Scanner;

public class Ex04_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("양의 정숫값의 자릿수를 표시합니다.");
		int a;
		
		do {System.out.print("양의 정숫값 :");
			a = scanner.nextInt();
		} while(a<0);
		
		int div =0;
		while(a>0) {
			div++;
			a /= 10;
		}
		System.out.println("입력한 숫자는 "+div+"자리입니다.");
	}
}
