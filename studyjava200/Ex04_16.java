import java.util.Scanner;

public class Ex04_16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� cm ����:");
		int a = scanner.nextInt();
		System.out.print("�� cm ����:");
		int b = scanner.nextInt();
		System.out.print("�� cm ����:");
		int c = scanner.nextInt();
		System.out.println("���� ǥ�� ü��");
		System.out.println("-------");
		
		for(int i=a; i<=b; i+=c) {
			System.out.println(i+" "+(i-100)*0.9);
		}
	}

}
