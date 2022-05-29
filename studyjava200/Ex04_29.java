import java.util.Scanner;

public class Ex04_29 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 더합니다.");
		int i; int a; int b; int sum=0;
	
		outer:
		for(i=1; i<=10; i++) {
			System.out.println(i+"그룹");
			for(int j=1; j<=5; j++) {
			System.out.print("정수 :");
			b = scanner.nextInt();
			if(b==88888) continue outer; 
			else if(b==99999) break outer;
			sum += b;}
			
		}
		System.out.println("합계 : "+sum);
	}
}
