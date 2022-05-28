import java.util.Scanner;

public class Ex06_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("요소수 :");
		int n = scanner.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"]=");
			a[i] = scanner.nextInt();
		}
		
		System.out.print("찾을 숫자 :");
		int k = scanner.nextInt();
		for(int i=0; i<n; i++) {
			if(k==a[i]) {System.out.println("그 값은 a["+i+"]에 있습니다.");}
			
		}
		System.out.println("해당 값이 존재하지 않습니다.");
		
	}
}
