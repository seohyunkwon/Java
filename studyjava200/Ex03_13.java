import java.util.Scanner;

public class Ex03_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� a: "); int a = scanner.nextInt();
		System.out.print("���� b: "); int b = scanner.nextInt();
		
//		if(a>=b) {
//			System.out.println("�� ���� ���� "+ (a-b) +"�Դϴ�.");
//		} else {
//			System.out.println("�� ���� ���� "+ (b-a) +"�Դϴ�.");
//		}
//		
		int diff = a>=b ? a-b : b-a;
		System.out.println("�� ���� ���� "+ diff +"�Դϴ�.");
	} 

}
