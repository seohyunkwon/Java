import java.util.Arrays;
import java.util.Scanner;

public class Ex22966 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		int[] LvArr = new int[a];
		String[] nameArr = new String[a];
		
		
		for(int i=0; i<a; i++) {
			String name = scanner.next();
			int lv = scanner.nextInt();
			nameArr[i]=name;
			LvArr[i]=lv;
		}
		
		int min=LvArr[0];
		for(int i=0; i<a; i++) {
			if(min>LvArr[i]) min = LvArr[i];
		}
		
		int num = 0;
		for(int i=0; i<a; i++) {
			if(min==LvArr[i]) break;
			num++;
		}
		System.out.println(nameArr[num]);
	}
}
