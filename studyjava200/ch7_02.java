import java.util.Scanner;

public class ch7_02 {
	static int min (int a, int b, int c) {
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		
		return min;
		}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� a :"); int a = scanner.nextInt();
		System.out.println("���� b :"); int b = scanner.nextInt();
		System.out.println("���� c :"); int c = scanner.nextInt();
		
		System.out.println("�ּڰ��� "+min(a,b,c)+"�Դϴ�.");
		
	}
}
	
