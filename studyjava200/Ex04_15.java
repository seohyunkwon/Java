// 1���� n���� ���� ���ϴ� ���α׷��� for���� ����� �ۼ�����.
import java.util.Scanner;

public class Ex04_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a; int add = 0;
		do{System.out.print("1���� n������ ���� ���մϴ�. n�� �� :");
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