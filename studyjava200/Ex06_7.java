import java.util.Scanner;

public class Ex06_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����� :");
		int n = scanner.nextInt();
		int[] t = new int[n];
		System.out.println("������ �Է��ϼ���.");
		
		int sum=0;
		for(int i=0; i<n; i++) {
		System.out.print((i+1)+"���� ���� :");
		t[i] = scanner.nextInt();
		sum += t[i];
		}
		
		int max=t[0];
		int min=t[0];
		for(int i=0; i<n; i++) {
			if(max<t[i]) {max = t[i];}
			if(min>t[i]) {min = t[i];}
			
		}
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+(sum/n));
		System.out.println("�ְ��� : "+(max));
		System.out.println("������ : "+(min));
	}
}
