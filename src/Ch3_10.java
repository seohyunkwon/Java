import java.util.Scanner;

public class Ch3_10 {
	public static void main(String args[]) {
		
//		System.out.println('2'-'0'); // 2
//		'2'-> char , '0'-> char
		
		System.out.println("�����ȯ �����غ���");
		System.out.println("1~9 ������ ���ڸ� �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in);
		char c1 = scanner.next().charAt(0); // nextChar ���� �Ұ�, String���� �Է� �� ��ȯ�ؾ� ��
		char c2 = '0';
		
		System.out.println("�� ���ڴ� char Ÿ�����δ� "+ c1+"�̴�.");
		
		int d1 = (int)c1;
		int d2 = (int)c2;
		System.out.println("�׷��� int Ÿ������ ����ϸ� �����ڵ��� "+d1+"�� ��µȴ�.");
		System.out.println("����, [ System.out,println('"+d1+"'-'0'); ]�� ���� char Ÿ������ �ڵ� ����ȯ �Ǿ "+(d1-d2)+"�� ���� ����ȴ�");
		
	}
	
}
