import java.util.Scanner;

// 3자리 양의 정숫값(100~999)을 읽는 프로그램을 작성하라(입력한 값이 3자리 양의 정숫값이 아니면 다시 입력하게 할 것)

public class Ex04_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		do {
			System.out.println("세자리 정숫값 : ");
			a = scanner.nextInt();
			
		} while(!(a>=100&&a<1000));
		System.out.println("입력한 값은 "+a+"입니다.");
		
		
	}
}
