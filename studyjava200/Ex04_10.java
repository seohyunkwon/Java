// ���� ������ n�� �о 1���� n������ ���� ���ϴ� ���α׷��� �ۼ��϶�.
import java.util.Scanner;

public class Ex04_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		
		do {System.out.print("���� ������ :");
			a=scanner.nextInt();
		} while(a<0);
		
		int i = 1; int mul=1;
		while(a>=i) {
			 mul *= i;
			i++;
		}
		System.out.println("1���� "+a+"������ ���� "+mul+"�Դϴ�.");
	}
}
