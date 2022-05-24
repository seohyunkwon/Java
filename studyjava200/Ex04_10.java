// 양의 정숫값 n을 읽어서 1부터 n까지의 곱을 구하는 프로그램을 작성하라.
import java.util.Scanner;

public class Ex04_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		
		do {System.out.print("양의 정숫값 :");
			a=scanner.nextInt();
		} while(a<0);
		
		int i = 1; int mul=1;
		while(a>=i) {
			 mul *= i;
			i++;
		}
		System.out.println("1부터 "+a+"까지의 곱은 "+mul+"입니다.");
	}
}
