import java.util.Scanner;

public class Ex {
	public static void main(String args[]) {
		int[] coinUnit = {500, 100, 50, 10};
		System.out.println("�ݾ��� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		
		System.out.println("money="+money);
		
		for(int i=0;i<coinUnit.length;i++) {
			
			
			int k = money/coinUnit[i];
			money = money%coinUnit[i];
			
			System.out.println(coinUnit[i]+"��: "+k);
			
			
		}
		
		
		}
}
