// 2���� �������� �о �� ���� ���̿� �ִ� ��� �������� ���� �ͺ��� ū ������ ǥ���ϴ� ���α׷��� �ۼ��϶�
import java.util.Scanner;

public class Ex04_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� A: ");
		int a = scanner.nextInt();
		System.out.print("���� B: ");
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
