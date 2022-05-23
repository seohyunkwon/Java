import java.util.Scanner;

public class Ex03_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		if (a>0) {	System.out.println("값이 양수입니다.");	}
		else if (a==0) { System.out.println("값이 0입니다."); }
		else {System.out.println("값이 음수입니다.");}
	}

}
