import java.util.Scanner;

public class Ex03_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� �Է��Ͻÿ�.");
		int a = scanner.nextInt();
		
		if(a<0) {
			int b = -1 * a;
			System.out.println("������ ������ " + b +"�Դϴ�." );
		} else {
		System.out.println("������ ������ "+a+"�Դϴ�.");
		}
	}
}
