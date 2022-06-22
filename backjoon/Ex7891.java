import java.util.Scanner;

public class Ex7891 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int[] arr = new int[num];
		int[] arr2 = new int[num];
		
		
		for(int i=0; i<num; i++) {
			arr[i] = scanner.nextInt();
			arr2[i] = scanner.nextInt();
		}
		
		for(int i=0; i<num; i++) {
			System.out.println(arr[i]+arr2[i]);
		}
		
		
		
	}
}
