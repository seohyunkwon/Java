import java.util.Scanner;

public class Ex04_28 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ ���մϴ�.\n�� ���� ���ұ��? :");
		int a = scanner.nextInt();
		int i; int b; int sum=0;
		for(i=1; i<=a; i++) {
			System.out.print("���� :");
			b = scanner.nextInt();
			if(b<0) {System.out.println("������ ������ �ʽ��ϴ�."); continue;}
			sum +=b;
			
		}
		System.out.println("�հ� :"+sum);
		System.out.println("��� :"+sum/a);
		
	}
}
