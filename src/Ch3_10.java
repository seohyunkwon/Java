import java.util.Scanner;

public class Ch3_10 {
	public static void main(String args[]) {
		
//		System.out.println('2'-'0'); // 2
//		'2'-> char , '0'-> char
		
		System.out.println("산술변환 이해해보기");
		System.out.println("1~9 사이의 문자를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		char c1 = scanner.next().charAt(0); // nextChar 변수 불가, String으로 입력 후 변환해야 함
		char c2 = '0';
		
		System.out.println("이 문자는 char 타입으로는 "+ c1+"이다.");
		
		int d1 = (int)c1;
		int d2 = (int)c2;
		System.out.println("그러나 int 타입으로 출력하면 유니코드인 "+d1+"로 출력된다.");
		System.out.println("따라서, [ System.out,println('"+d1+"'-'0'); ]의 값은 char 타입으로 자동 형변환 되어서 "+(d1-d2)+"의 값이 산출된다");
		
	}
	
}
