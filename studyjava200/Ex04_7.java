//

import java.util.Scanner;

public class Ex04_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if(a>0) {
			int i =0;
			while(i<a) {
				System.out.print("*");
			i++;}
			System.out.println();
		}
	}
}
