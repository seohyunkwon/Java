import java.util.Scanner;

public class Ex03_3 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ΰ��� ������ �Է��Ͻÿ�");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a%b==0) {
			System.out.println("B�� A�� ����̴�.");
		} else {
			System.out.println("B�� A�� ����� �ƴϴ�.");    // if(a%b !=0)
		}
		
	}
}
