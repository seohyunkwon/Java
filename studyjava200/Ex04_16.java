import java.util.Scanner;

public class Ex04_16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇 cm 부터:");
		int a = scanner.nextInt();
		System.out.print("몇 cm 까지:");
		int b = scanner.nextInt();
		System.out.print("몇 cm 단위:");
		int c = scanner.nextInt();
		System.out.println("신장 표준 체중");
		System.out.println("-------");
		
		for(int i=a; i<=b; i+=c) {
			System.out.println(i+" "+(i-100)*0.9);
		}
	}

}
