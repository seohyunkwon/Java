import java.util.Scanner;

public class Ex04_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int retry;
		do {
			System.out.print("������ :");
			int n = scanner.nextInt();
		
			if(n>0) {System.out.println("�� ���� ����Դϴ�.");}
			else if(n<0) {System.out.println("�� ���� �����Դϴ�.");}
			else {System.out.println("�� ���� 0�Դϴ�.");}
			
			System.out.println("�ٽ� �ѹ�? 1 - Yes / 0 - No");
			retry = scanner.nextInt();
		} while(retry==1);
		
		
	}

}
