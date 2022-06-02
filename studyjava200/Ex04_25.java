import java.util.Scanner;

public class Ex04_25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
		System.out.print("2이상의 정숫값 :");
		n = scanner.nextInt();} while(n<2);
		
		int k=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {k += 1;	} 
		}
		if(k==2) {System.out.println("소수입니다.");}
		else {System.out.println("소수가 아닙니다.");}
		
		
	}
}
