import java.util.Scanner;

// 구의 겉넓이와 부피를 구하는 프로그램을 작성하자. 

public class Ex2_10 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		
		System.out.println(Math.PI);
		System.out.println("구의 반지름은" +r+"이며,");
		System.out.println("구의 겉넓이는" +(4*r*r*Math.PI)+"이다.");
		System.out.println("구의 부피는" +(4/3.0*r*r*r*Math.PI)+"이다."); // a
		System.out.println("구의 부피는" +(4/3*r*r*r*Math.PI)+"이다."); // b
		
		// b의 경우 4/3이 정수로 바뀌며 1로 계산, a의 경우 실수로 취급하여 1.33으로 계산. 고로 a가 옳다.
		
		
	}

}
