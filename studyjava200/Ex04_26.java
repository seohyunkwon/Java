import java.util.Scanner;

public class Ex04_26 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a; int b; int sum=0; int avg=0; int i;
		System.out.println("������ ���մϴ�.");
		System.out.print("�� ���� ���ұ��? :");
		a = scanner.nextInt();
		for( i=0; i<a; i++) {
			System.out.print("����(0���� ����) :");
			b = scanner.nextInt();
			if(b==0) break;
			sum += b;
		} 
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+sum/i);
		
		
	}
}
