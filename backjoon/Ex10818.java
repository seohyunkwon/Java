import java.util.Scanner;

public class Ex10818 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			int k = scanner.nextInt();	
			arr[i] = k;
		}
		int max=arr[0]; int min=arr[0];
		for(int i=0; i<n; i++) {
			if(max<arr[i]) max = arr[i];
			if(min>arr[i]) min = arr[i];
		}
	
		System.out.println(min+" "+max);
	}
}