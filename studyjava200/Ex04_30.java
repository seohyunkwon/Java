import java.util.Random;
import java.util.Scanner;

public class Ex04_30 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int rand = random.nextInt(90);
		System.out.println(rand);
		System.out.println("���� ���߱� ���� ����!");
		
		for(int i=1; i<=7; i++) {
		do{System.out.println("0���� 99������ ���ڸ� ���߼���.");} while(i==1);
		
		System.out.print("���� Ƚ�� "+ (7-i) +"ȸ, � �����ϱ�?");
		
		
		
		}
	}
}
