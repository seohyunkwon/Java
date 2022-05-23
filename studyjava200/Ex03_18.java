import java.util.Scanner;

public class Ex03_18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a<b) {
			int t=b;
			b = a;
			a = t;
		}
		System.out.println("내림차순으로 정렬");
		System.out.println("변수 a는 "+ a+", 변수 b는 "+b+"입니다.");
	}
}
