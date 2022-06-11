import java.util.Arrays;
import java.util.Scanner;

public class Ex1009 {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);	
	
	int n = scanner.nextInt();
	int[] computer = new int[10];
	
	for(int i=0; i<n; i++) {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = (int) Math.pow(a, b);
		computer[i]=c;
		}
	
	for(int i=0; i<n; i++) {
		int t = computer[i];
		if (t%10==0) System.out.println(t+1);
		else System.out.println(t%10);
		}
	}
}


