// ���� �������� �о �� �ڸ����� ����ϴ� ���α׷��� �ۼ�����
import java.util.Scanner;

public class Ex04_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �������� �ڸ����� ǥ���մϴ�.");
		int a;
		
		do {System.out.print("���� ������ :");
			a = scanner.nextInt();
		} while(a<0);
		
		int div =0;
		while(a>0) {
			div++;
			a /= 10;
		}
		System.out.println("�Է��� ���ڴ� "+div+"�ڸ��Դϴ�.");
	}
}
