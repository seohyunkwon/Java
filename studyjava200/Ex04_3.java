import java.util.Random;
import java.util.Scanner;

// 2자리 정숫값(10~99)ㅇ,ㄹ 밎츤,ㄴ '숫자맞추기 게임'을 만들자. 난수 생성과 if문 그리고 do문을 사용할 것

public class Ex04_3 {
	public static void main(String[] args) {
		System.out.println("숫자 맞추기 게임 시작!\n10부터 99사이의 숫자를 맞추세요");
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int a; int rand;
		rand = 10+random.nextInt(90);
		do {
			System.out.print("어떤 숫자일까?: ");
			a = scanner.nextInt();
			if(a>rand) {
				System.out.println("더 작은 숫자입니다.");
				}
			else if(a<rand) {
				System.out.println("더 큰 숫자입니다.");
				}
		}while(a!=rand);
		System.out.println("정답입니다.");
		
		
		
	}
}
