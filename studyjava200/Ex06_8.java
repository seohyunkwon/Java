import java.util.Scanner;

public class Ex06_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��Ҽ� :");
		int n = scanner.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"]=");
			a[i] = scanner.nextInt();
		}
		
		System.out.print("ã�� ���� :");
		int k = scanner.nextInt();
		for(int i=0; i<n; i++) {
			if(k==a[i]) {System.out.println("�� ���� a["+i+"]�� �ֽ��ϴ�.");}
			
		}
		System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
		
	}
}
