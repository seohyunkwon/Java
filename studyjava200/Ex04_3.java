import java.util.Random;
import java.util.Scanner;

// 2�ڸ� ������(10~99)��,�� �G��,�� '���ڸ��߱� ����'�� ������. ���� ������ if�� �׸��� do���� ����� ��

public class Ex04_3 {
	public static void main(String[] args) {
		System.out.println("���� ���߱� ���� ����!\n10���� 99������ ���ڸ� ���߼���");
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int a; int rand;
		rand = 10+random.nextInt(90);
		do {
			System.out.print("� �����ϱ�?: ");
			a = scanner.nextInt();
			if(a>rand) {
				System.out.println("�� ���� �����Դϴ�.");
				}
			else if(a<rand) {
				System.out.println("�� ū �����Դϴ�.");
				}
		}while(a!=rand);
		System.out.println("�����Դϴ�.");
		
		
		
	}
}
