import java.util.Scanner;

public class Ex04_23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�Ƕ�̵带 ǥ���մϴ�.");
		System.out.print("�ܼ���? :");
		int a=scanner.nextInt();
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a-i; j++) 
				System.out.print(" ");
			for(int j=1; j<=2*i-1; j++) 
				System.out.print("*");
		System.out.println();
		}
		
		
	}
}

// 1�� 4 1 0000*
// 2�� 3 3 000***
// 3�� 2 5 00*****
// 4�� 1 7 0*******
// 5�� 0 9 *********

