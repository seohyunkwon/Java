import java.util.Scanner;

public class Ex03_17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� �Է��Ͻÿ�");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a==b) {System.out.println("�� ���� �����ϴ�.");}
		else {
			int min; int max;
			if(a>b) {max = a; min = b;}
			else {max=b; min=a;}
			System.out.println("ū ���� "+ max +", ���� ���� "+ min +"�Դϴ�.");
		}
		
	}

}
