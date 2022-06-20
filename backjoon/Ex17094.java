import java.util.Scanner;

public class Ex17094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		char[] arr = s.toCharArray();

		int num2 =0; int numE = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='2') num2++;
			else if(arr[i]=='e') numE++;
		}
		
		if(num2==numE) System.out.println("yee");
		else if(num2>numE) System.out.println("2");
		else System.out.println("e");
		
				
	}
}
