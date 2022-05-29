import java.util.Random;
import java.util.Scanner;

public class Ex04_30 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int rand = random.nextInt(90);
		System.out.println(rand);
		System.out.println("숫자 맞추기 게임 시작!");
		
		for(int i=1; i<=7; i++) {
		do{System.out.println("0부터 99사이의 숫자를 맞추세요.");} while(i==1);
		
		System.out.print("남은 횟수 "+ (7-i) +"회, 어떤 숫자일까?");
		
		
		
		}
	}
}
