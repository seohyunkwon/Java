import java.util.Scanner;

public class Ex04_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int retry;
		do {
			System.out.print("정숫값 :");
			int n = scanner.nextInt();
		
			if(n>0) {System.out.println("이 값은 양수입니다.");}
			else if(n<0) {System.out.println("이 값은 음수입니다.");}
			else {System.out.println("이 값은 0입니다.");}
			
			System.out.println("다시 한번? 1 - Yes / 0 - No");
			retry = scanner.nextInt();
		} while(retry==1);
		
		
	}

}
