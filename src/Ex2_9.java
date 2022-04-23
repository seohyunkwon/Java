import java.util.Scanner;

// 삼각형의 밑변과 높이를 입력받아 삼각형의 넓이를 구하는 프로그램을 작성하자.

public class Ex2_9 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		
		System.out.println("삼각형의 밑변 :"+ x);
		System.out.println("삼각형의 높이 :"+ y);
		System.out.println("삼각형의 넓이 :"+ (x*y)/2);
		
	}

}
