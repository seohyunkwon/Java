import java.util.Scanner;

public class Ex04_29 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ���մϴ�.");
		int i; int a; int b; int sum=0;
	
		outer:
		for(i=1; i<=10; i++) {
			System.out.println(i+"�׷�");
			for(int j=1; j<=5; j++) {
			System.out.print("���� :");
			b = scanner.nextInt();
			if(b==88888) continue outer; 
			else if(b==99999) break outer;
			sum += b;}
			
		}
		System.out.println("�հ� : "+sum);
	}
}
