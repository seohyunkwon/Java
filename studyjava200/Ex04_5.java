
// �Է¹��� ���������� 0���� ī��Ʈ�ٿ��ϴ� ���α׷��� �ۼ��϶�. ī��Ʈ�ٿ� ���� ���� �������� Ȯ���� �� �ְ� �� ��

import java.util.Scanner;

public class Ex04_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ī��Ʈ�ٿ� �մϴ�.");
		int a;
		do {
			System.out.print("���� ������ :");
			a = scanner.nextInt();
		}while(a<=0);

		while(a>=0) {
			System.out.println(a--);
		}
		System.out.println("������ ���� "+a+"�� �Ǿ����ϴ�.");
	}
}
