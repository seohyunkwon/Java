import java.util.Scanner;

public class Ex2562 {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[] arr = new int[9];
	
	for(int i=0; i<9; i++) {
		int k = scan.nextInt();
		arr[i] = k;
	}
	 
	int max = arr[0];
	for(int i=0; i<9; i++) {
		if(max<arr[i]) max = arr[i];
	}
	
	int t = 1;
	for(int i=0; i<9; i++) {
		if(max==arr[i]) break;
		t++;
	}
	System.out.println(max);
	System.out.println(t);
 }
}
