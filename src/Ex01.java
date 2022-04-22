// 알쏭달쏭 자바 200제 문제 2-5, Scanner
// 키보드에서 입력한 정숫값을 표시하는 프로그램을 작성하자.
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		System.out.println("정수값 :");
		System.out.println(num+"입니다.");
	
	
	}

}

/*
//알쏭달쏭 자바 200제 문제 2-6
//키보드에서 입력한 정숫값에 10을 더한 값과 10을 뺀 값을 출력하자.

import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		System.out.println("정숫값 + 10 :"+ (x+10));
		System.out.println("정숫값 - 10 :"+ (x-10));
		
	}

}

// 알쏭달쏭 자바 200제 문제 2-7
// 키보드에서 입력한 정숫값에서 마지막 자릿수를 제외한 값과 마지막 자릿수 값만 표시하는 프로그램을 작성하자.

// 다시 풀어보기 !

import java.util.Scanner;
public class Ex03 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		System.out.println("마지막 자릿수를 제외한 값 :"+ (x/10));
		System.out.println("마지막 자릿수 값 :"+ (x%10));
	}

}


*/

