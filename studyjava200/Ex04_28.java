import java.util.Scanner;

public class Ex04_28 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 더합니다.\n몇 개를 더할까요? :");
		int a = scanner.nextInt();
		int i; int b; int sum=0;
		for(i=1; i<=a; i++) {
			System.out.print("정수 :");
			b = scanner.nextInt();
			if(b<0) {System.out.println("음수는 더하지 않습니다."); continue;}
			sum +=b;
			
		}
		System.out.println("합계 :"+sum);
		System.out.println("평균 :"+sum/a);
		
	}
}
