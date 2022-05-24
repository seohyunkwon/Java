// 2개의 정숫값을 읽어서 두 정수 사이에 있는 모든 정숫값을 작은 것부터 큰 순으로 표시하는 프로그램을 작성하라
import java.util.Scanner;

public class Ex04_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 A: ");
		int a = scanner.nextInt();
		System.out.print("정수 B: ");
		int b = scanner.nextInt();
		if(a>b) { 
			int t = a;
			a = b;
			b = t;
		}
		
		do {
			System.out.print(a++ + " ");
		} while(a<=b);
		
	}
}
