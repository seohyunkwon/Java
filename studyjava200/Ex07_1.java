import java.util.Scanner;

public class Ex07_1 {
	static int signOf(int x) {
		if(x<0) return -1;
		else if(x==0) return 0;
		else return 1;
		
	}
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Á¤¼ý°ª :");
	int x = scanner.nextInt();
	System.out.println(signOf(x));
	
	
	}
	
}
