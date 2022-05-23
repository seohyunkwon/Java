import java.util.Scanner;

public class Ex03_16 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int mid = 0;
		if (a>=b) {
			if(b>=c) {mid=b;}
			else if (a<=c) {mid=a;}
			else {mid=c;}
			}
		else if(a>c) {mid = a;}
		else if(b>c) {mid=c;}
		else {mid=b;}
		
		System.out.println("중앙값은 "+mid+"입니다.");
		
	// https://armontad-1202.tistory.com/31
	}
}
