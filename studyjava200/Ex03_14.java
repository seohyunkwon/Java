import java.util.Scanner;

public class Ex03_14 {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int diff = a>=b ? a-b : b-a ;
		
//		if (diff<=10) {System.out.println("�� ���� ���� 10 �����Դϴ�."); }
//		else {System.out.println("�� ���� ���� 11 �̻��Դϴ�.");}
		
		System.out.println("�� ���� ���� "+ (diff<=10 ? "10����":"11�̻�") + "�Դϴ�.");
	}
}
