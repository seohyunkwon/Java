import java.util.Arrays;
import java.util.Scanner;

public class Ex06_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("¿ä¼Ò¼ö :");
		int n = scanner.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {arr[i]=(int)(Math.random()*10)+1;}
		
		for(int i=10; i>=1; i--) {
			for(int j=0; j<n; j++) { 
				if(arr[j]>=i) System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=0; i<2*n; i++) 
			System.out.print("-");
			System.out.println();
		for(int i=0; i<n; i++) 
			System.out.print(i%10+" ");
		System.out.println();
		
		
		
	}
}
