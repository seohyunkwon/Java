import java.util.Scanner;

public class Ex04_22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for(int i=1; i<=a; i++) {
			for(int j=a; j>i; j--) 
				System.out.print("0");
				
			for(int j=0; j<i; j++) 
				System.out.print("*");
			
			System.out.println();
		}
		
	}
}

// 0000* 4 1
// 000** 3 2
// 00*** 2 3
// 0**** 1 4
// *****   5