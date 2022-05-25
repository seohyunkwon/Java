//입력한 정숫값의 모든 약수와 그 갯수를 출력하는 프로그램을 작성하시오
import java.util.Scanner;

public class Ex04_18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정숫값 :");
		int a = scanner.nextInt();
		int count = 0; 
		
		for(int i=1; i<=a; i++) {
			if(a%i==0) {
				System.out.print(i+" ");
				count ++;
			}
		}
		System.out.println();
		System.out.println("의 약수는 "+ count+"개입니다.");
	
	}
}
