import java.util.Scanner;

// ���� �ѳ��̿� ���Ǹ� ���ϴ� ���α׷��� �ۼ�����. 

public class Ex2_10 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		
		System.out.println(Math.PI);
		System.out.println("���� ��������" +r+"�̸�,");
		System.out.println("���� �ѳ��̴�" +(4*r*r*Math.PI)+"�̴�.");
		System.out.println("���� ���Ǵ�" +(4/3.0*r*r*r*Math.PI)+"�̴�."); // a
		System.out.println("���� ���Ǵ�" +(4/3*r*r*r*Math.PI)+"�̴�."); // b
		
		// b�� ��� 4/3�� ������ �ٲ�� 1�� ���, a�� ��� �Ǽ��� ����Ͽ� 1.33���� ���. ��� a�� �Ǵ�.
		
		
	}

}
