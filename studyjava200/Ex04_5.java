
// 입력받은 정숫값부터 0가지 카운트다운하는 프로그램을 작성하라. 카운트다운 종료 후의 변숫값을 확인할 수 있게 할 것

import java.util.Scanner;

public class Ex04_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		int a;
		do {
			System.out.print("양의 정숫값 :");
			a = scanner.nextInt();
		}while(a<=0);

		while(a>=0) {
			System.out.println(a--);
		}
		System.out.println("변수의 값이 "+a+"가 되었습니다.");
	}
}
