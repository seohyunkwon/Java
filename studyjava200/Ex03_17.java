import java.util.Scanner;

public class Ex03_17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정숫값을 입력하시오");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a==b) {System.out.println("두 값이 같습니다.");}
		else {
			int min; int max;
			if(a>b) {max = a; min = b;}
			else {max=b; min=a;}
			System.out.println("큰 값은 "+ max +", 작은 값은 "+ min +"입니다.");
		}
		
	}

}
