import java.util.Scanner;

public class Ex03_1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� �Է��Ͻÿ�");
		
		int a = scanner.nextInt();
		
		if (a<0) {
			System.out.println("�� ���� ���� ���Դϴ�.");
		} else if (a==0) {
			System.out.println("�� ���� 0�Դϴ�.");
		} else {
			System.out.println("�� ���� ���� ���Դϴ�.");
		}
		
		
	}
}
