import java.util.Scanner;

public class Ex04_25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
		System.out.print("2�̻��� ������ :");
		n = scanner.nextInt();} while(n<2);
		
		int k=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {k += 1;	} 
		}
		if(k==2) {System.out.println("�Ҽ��Դϴ�.");}
		else {System.out.println("�Ҽ��� �ƴմϴ�.");}
		
		
	}
}
