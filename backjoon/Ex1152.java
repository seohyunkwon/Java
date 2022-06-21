import java.util.Scanner;

public class Ex1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s2 = s.trim();
		int num; int t=1;
		if(s2.length()==0) {System.out.println("0");}
		else {for(int i=0; i<s2.length(); i++) {
				if (s2.charAt(i)==' ' && s2.charAt(i+1)!=' ') t++;
					} 
		System.out.println(t);}
		
	}
}
