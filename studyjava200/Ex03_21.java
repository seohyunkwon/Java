import java.util.Scanner;

public class Ex03_21 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է��Ͻÿ�");
		int month = scanner.nextInt();
		
//		switch(month) {
//		case 3: case 4: case 5:
//			System.out.println("��"); break;
//		case 6: case 7: case 8:
//			System.out.println("����"); break;
//		case 9: case 10: case 11:
//			System.out.println("����"); break;
//		case 12: case 1: case 2:
//			System.out.println("�ܿ�"); break;
//		}
		
		if(month>=3 && month<=5) {System.out.println("��");}
		else if(month>=6 && month<=8) {System.out.println("����");}
		else if(month>=9 && month<=11) {System.out.println("����");}
		else {System.out.println("�ܿ�");}
		
		
		
	}
}
