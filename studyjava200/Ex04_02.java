import java.util.Scanner;

// 3�ڸ� ���� ������(100~999)�� �д� ���α׷��� �ۼ��϶�(�Է��� ���� 3�ڸ� ���� �������� �ƴϸ� �ٽ� �Է��ϰ� �� ��)

public class Ex04_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		do {
			System.out.println("���ڸ� ������ : ");
			a = scanner.nextInt();
			
		} while(!(a>=100&&a<1000));
		System.out.println("�Է��� ���� "+a+"�Դϴ�.");
		
		
	}
}
