import java.util.Scanner;

public class Ex04_20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ã���ϴ�.");

		int month; int a;
		do{
			do {
			System.out.print("�� ���Դϱ�? :");
			month = scanner.nextInt();
			} while(month<1 || month>12);
			switch(month) {
			case 3 : case 4: case 5:
			System.out.println("���Դϴ�."); break;
			case 6 : case 7: case 8:
				System.out.println("�����Դϴ�."); break;
			case 9 : case 10: case 11:
				System.out.println("�����Դϴ�."); break;
			case 12 : case 1: case 2:
				System.out.println("�ܿ��Դϴ�."); break;
			}
			System.out.print("�ٽ� �Ͻðڽ��ϱ�? 1..Yes / 0.. No");
			a= scanner.nextInt();
		} while(a==1);
		
	}
}
