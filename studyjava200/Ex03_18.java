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
		System.out.println("������������ ����");
		System.out.println("���� a�� "+ a+", ���� b�� "+b+"�Դϴ�.");
	}
}
