import java.util.Arrays;
import java.util.Scanner;

public class Ex06_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("¿ä¼Ò¼ö : ");
		int n = scanner.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"] =");
			int b = scanner.nextInt();
			a[i]=b;
			
		}
		System.out.println(Arrays.toString(a));
		
		
	}
}
