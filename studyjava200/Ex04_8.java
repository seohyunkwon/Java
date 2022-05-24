import java.util.Scanner;

public class Ex04_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇 개를 표시할까요? :");
		int n = scanner.nextInt();
		int i=0;
		while(i<n) {
			if(i%2==1) {System.out.print("+");}
			else {System.out.print("*");}
			i++;
			}
			System.out.println();
	
		}
}
