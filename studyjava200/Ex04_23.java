import java.util.Scanner;

public class Ex04_23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("피라미드를 표시합니다.");
		System.out.print("단수는? :");
		int a=scanner.nextInt();
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a-i; j++) 
				System.out.print(" ");
			for(int j=1; j<=2*i-1; j++) 
				System.out.print("*");
		System.out.println();
		}
		
		
	}
}

// 1행 4 1 0000*
// 2행 3 3 000***
// 3행 2 5 00*****
// 4행 1 7 0*******
// 5행 0 9 *********

