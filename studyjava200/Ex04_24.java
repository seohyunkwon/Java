import java.util.Scanner;

public class Ex04_24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 피라미드를 표시합니다.");
		System.out.print("단수 :");
		int a = scanner.nextInt();
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a-i; j++) System.out.print(" ");
			for(int j=1; j<=2*i-1; j++) 
				System.out.print(i%10);
		System.out.println();
			
		}
		
	}
}
