import java.util.Scanner;

public class Ex04_27 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ���մϴ�.");
		System.out.print("�� ���� ���ұ��? :");
		int a = scanner.nextInt();
		int i; int b; int sum=0; 
		for(i=1; i<=a; i++) {
			System.out.print("���� : ");
			b = scanner.nextInt();
			sum += b;
			if(sum>=1000) 
				{
				System.out.println("�հ谡 1000�� �Ѿ����ϴ�.\n������ ���� �����մϴ�."); 
				sum-=b; i -=1;
				break;}
			
		}
		System.out.println(sum);
		System.out.println(sum/i);
		
	}
}
