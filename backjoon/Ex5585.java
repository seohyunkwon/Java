import java.util.Scanner;

public class Ex5585 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int change = 1000 - sc.nextInt();		
		int[] money = {500, 100, 50, 10, 5 ,1};
		int result =0;
		
		for(int i=0; i<money.length; i++) {
			if(change/money[i]!=0) {
			result +=change/money[i];
			change %= money[i];}
		}
	
		System.out.println(result);
	}
	
}