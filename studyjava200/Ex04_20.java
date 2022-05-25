import java.util.Scanner;

public class Ex04_20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계절을 찾습니다.");

		int month; int a;
		do{
			do {
			System.out.print("몇 월입니까? :");
			month = scanner.nextInt();
			} while(month<1 || month>12);
			switch(month) {
			case 3 : case 4: case 5:
			System.out.println("봄입니다."); break;
			case 6 : case 7: case 8:
				System.out.println("여름입니다."); break;
			case 9 : case 10: case 11:
				System.out.println("가을입니다."); break;
			case 12 : case 1: case 2:
				System.out.println("겨울입니다."); break;
			}
			System.out.print("다시 하시겠습니까? 1..Yes / 0.. No");
			a= scanner.nextInt();
		} while(a==1);
		
	}
}
