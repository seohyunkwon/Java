// 1부터 n까지 합을 구하는 프로그램을 for문을 사용해 작성하자.
import java.util.Scanner;

public class Ex04_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a; int add = 0;
		do{System.out.print("1부터 n까지의 합을 구합니다. n의 값 :");
		a = scanner.nextInt();} while(a<0);
		for(int i=1; i<a; i++) {
			add += i;
			System.out.print(i+"+");
		}
		add +=a;
		System.out.print(a+"=");
		System.out.println(add);
	}

}
