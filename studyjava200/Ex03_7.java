import java.util.Scanner;

public class Ex03_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a>b) {System.out.println("a�� ũ��."); }
		else if (a<b) {System.out.println("b�� ũ��.");}
		else {System.out.println("a�� b�� ����.");}
		
	}

}
