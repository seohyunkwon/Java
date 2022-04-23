import java.util.Random;

/* 다음과 같은 프로그램을 작성하자.
   한 자리 양의 정숫값(즉, 1이상 9이하의 값)을 랜덤으로 생성해서 표시
   한 자리 음의 정숫값(즉, -9이상 -1이하의 값)을 랜덤으로 생성해서 표시
   두자리 양의 정숫값(즉, 10이상 99이하의 값)을 랜덤으로 생성해서 표시
 */

public class Ex2_11 {
	public static void main(String[] args) {

		Random random = new Random();
		
		int a = random.nextInt(9-1+1);
		System.out.println(a);
		
		int b = random.nextInt((-1)-(-9)+1);
		System.out.println(b);
		
		int c = random.nextInt(99-10+1);
		System.out.println(c);
	}

}
