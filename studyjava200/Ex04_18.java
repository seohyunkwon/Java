//�Է��� �������� ��� ����� �� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
import java.util.Scanner;

public class Ex04_18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ :");
		int a = scanner.nextInt();
		int count = 0; 
		
		for(int i=1; i<=a; i++) {
			if(a%i==0) {
				System.out.print(i+" ");
				count ++;
			}
		}
		System.out.println();
		System.out.println("�� ����� "+ count+"���Դϴ�.");
	
	}
}
