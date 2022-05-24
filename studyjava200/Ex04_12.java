// Ex04_5를 for문으로 표현해라

import java.util.Scanner;
public class Ex04_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		
		System.out.println("카운트다운 합니다.");
		System.out.print("양의 정숫값 :");
		a = scanner.nextInt();
		for(int i=a; i>=0; i--) {
			System.out.println(i);
		}
		
	}
}
