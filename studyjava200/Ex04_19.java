//1부터 n까지의 정숫값에 각 값을 제곱하여 표시하는 프로그램을 작성하라.
import java.util.Scanner;

public class Ex04_19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정숫값 :");
		int n = scanner.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println(i+"의 제곱은 "+ i*i + "입니다.");
		}
		
	}
}
