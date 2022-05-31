import java.util.Scanner;

public class Ex04_26 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a; int b; int sum=0; int avg=0; int i;
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요? :");
		a = scanner.nextInt();
		for( i=0; i<a; i++) {
			System.out.print("정수(0으로 종료) :");
			b = scanner.nextInt();
			if(b==0) break;
			sum += b;
		} 
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+sum/i);
		
		
	}
}
