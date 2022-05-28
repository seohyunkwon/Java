import java.util.Scanner;

public class Ex04_27 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요? :");
		int a = scanner.nextInt();
		int i; int b; int sum=0; 
		for(i=1; i<=a; i++) {
			System.out.print("정수 : ");
			b = scanner.nextInt();
			sum += b;
			if(sum>=1000) 
				{
				System.out.println("합계가 1000을 넘었습니다.\n마지막 값은 무시합니다."); 
				sum-=b; i -=1;
				break;}
			
		}
		System.out.println(sum);
		System.out.println(sum/i);
		
	}
}
